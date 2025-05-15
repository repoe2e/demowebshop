package tricentis.demowebshop.testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tricentis.demowebshop.config.Navegador;
import tricentis.demowebshop.elementos.Elementos;
import tricentis.demowebshop.metodos.Metodos;
import tricentis.demowebshop.utils.MassaTestes;

public class RegistrarUsuarioTest {
	
	Elementos el = new Elementos();
	Metodos metodo = new Metodos();
	MassaTestes massa = new MassaTestes();
	
	
	@BeforeEach
	public void setup() {
		Navegador.abrirNavegador();
		metodo.clicar(el.getMenuRegister());
	}
	
	@AfterEach
	public void tearDown() {
		//Navegador.fecharNavegador();
	}
	
	@Test
	public void registroSucesso() throws InterruptedException {
		String email = massa.retornaDados("emailGmail"); 
		metodo.escrever(el.getFirstName(),"Anderson");
		metodo.escrever(el.getLastName(),"Barbosa");
		Thread.sleep(4000);
		metodo.escrever(el.getEmail(),email);
		metodo.escrever(el.getPassword(),"B?0P248kEf-P");
		metodo.escrever(el.getConfirmPassword(),"B?0P248kEf-P");
		metodo.clicar(el.getBtnRegister());
		metodo.validarTexto(email);
	}
	
	
	//@Test
	public void registrarEmailRegistrado() {
		metodo.escrever(el.getFirstName(),"Anderson");
		metodo.escrever(el.getLastName(),"Barbosa");
		metodo.escrever(el.getEmail(),"kopak44742@bauscn.com");
		metodo.escrever(el.getPassword(),"B?0P244kEf-P");
		metodo.escrever(el.getConfirmPassword(),"B?0P244kEf-P");
		metodo.clicar(el.getBtnRegister());
		metodo.validarTexto("The specified email already exists");
	}
	
	//@Test
	public void registrarConfirmacaoDeSenhaDiferente() {
		metodo.escrever(el.getFirstName(),"Anderson");
		metodo.escrever(el.getLastName(),"Barbosa");
		metodo.escrever(el.getEmail(),"kopak44702@bauscn.com");
		metodo.escrever(el.getPassword(),"B?0P244kEf-");
		metodo.escrever(el.getConfirmPassword(),"B?0P244kEf-P");
		metodo.clicar(el.getBtnRegister());
		metodo.validarTexto("The password and confirmation password do not match.");
	}
	
	
	
/*
	- Dados em branco
	- Dados inválidos
	- Senha fora do padrão
	- Senhas diferentes
	- Email fora do padrão
	*/
	
	

}
