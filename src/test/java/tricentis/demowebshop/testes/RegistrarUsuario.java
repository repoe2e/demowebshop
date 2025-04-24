package tricentis.demowebshop.testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tricentis.demowebshop.config.Navegador;
import tricentis.demowebshop.elementos.Elementos;
import tricentis.demowebshop.metodos.Metodos;

public class RegistrarUsuario {
	
	Elementos el = new Elementos();
	Metodos metodo = new Metodos();
	
	@BeforeEach
	public void setup() {
		Navegador.abrirNavegador();
		metodo.clicar(el.getMenuRegister());
	}
	
	@Test
	public void registroSucesso() {
		metodo.escrever(el.getFirstName(),"Anderson");
		metodo.escrever(el.getLastName(),"Barbosa");
		metodo.escrever(el.getEmail(),"kopak44741@bauscn.com");
		metodo.escrever(el.getPassword(),"B?0P244kEf-P");
		metodo.escrever(el.getConfirmPassword(),"B?0P244kEf-P");
		metodo.clicar(el.getBtnRegister());
	}
	
/*
	- Dados em branco
	- Dados inválidos
	- Senha fora do padrão
	- Senhas diferentes
	- Email fora do padrão
	*/
	
	

}
