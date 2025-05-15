package tricentis.demowebshop.testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tricentis.demowebshop.config.Navegador;
import tricentis.demowebshop.elementos.Elementos;
import tricentis.demowebshop.metodos.Metodos;

public class LoginTest {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	@BeforeEach
	public void setup() {
		Navegador.abrirNavegador();
		metodo.clicar(el.getMenuLogin());
	}

	@AfterEach
	public void tearDown() {
		Navegador.fecharNavegador();
	}

	@Test
	public void loginSucesso() {
		String email = "testetestes@gmail.com"; 
		metodo.escrever(el.getEmail(), email);
		metodo.escrever(el.getPassword(), "B?0P248kEf-P");
		metodo.clicar(el.getBtnLogin());
		metodo.validarTexto(email);
	}

	@Test
	public void senhaInvalida() {
		String email = "testetestes@gmail.com"; 
		metodo.escrever(el.getEmail(), email);
		metodo.escrever(el.getPassword(), "errado");
		metodo.clicar(el.getBtnLogin());
		metodo.validarTexto("Login was unsuccessful. Please correct the errors and try again.");
		metodo.validarTexto("The credentials provided are incorrect");
	}

	@Test
	public void emailForaDoPadrao() {
		String email = "testetestesgmail.com"; 
		metodo.escrever(el.getEmail(), email);
		metodo.escrever(el.getPassword(), "B?0P248kEf-P");
		metodo.clicar(el.getBtnLogin());
		metodo.validarTexto("Please enter a valid email address.");
	}

	@Test
	public void emailInexistente() {
		String email = "10testetestes@gmail.com"; 
		metodo.escrever(el.getEmail(), email);
		metodo.escrever(el.getPassword(), "B?0P248kEf-P");
		metodo.clicar(el.getBtnLogin());
		metodo.validarTexto("Login was unsuccessful. Please correct the errors and try again.");
		metodo.validarTexto("No customer account found");
	}

	@Test
	public void senhaBranco() {
		String email = "testetestes@gmail.com"; 
		metodo.escrever(el.getEmail(), email);
		metodo.escrever(el.getPassword(), "");
		metodo.clicar(el.getBtnLogin());
		metodo.validarTexto("Login was unsuccessful. Please correct the errors and try again.");
		metodo.validarTexto("The credentials provided are incorrect");
	}

	@Test
	public void emailBranco() {
		String email = ""; 
		metodo.escrever(el.getEmail(), email);
		metodo.escrever(el.getPassword(), "B?0P248kEf-P");
		metodo.clicar(el.getBtnLogin());
		metodo.validarTexto("Login was unsuccessful. Please correct the errors and try again.");
		metodo.validarTexto("No customer account found");
	}

}
