package tricentis.demowebshop.testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tricentis.demowebshop.config.Navegador;
import tricentis.demowebshop.elementos.Elementos;
import tricentis.demowebshop.metodos.Metodos;
import tricentis.demowebshop.pages.HomePage;

public class LoginTest {

	HomePage home = new HomePage();

	@BeforeEach
	public void setup() {
		Navegador.abrirNavegador();
	}

	@AfterEach
	public void tearDown() {
		Navegador.fecharNavegador();
	}

	@Test
	public void loginSucesso() {
		home.login("", "B?0P248kEf-P");
	}

	@Test
	public void senhaInvalida() {
		home.login("testetestes@gmail.com", "", "The credentials provided are incorrect");
		
	}

	@Test
	public void emailForaDoPadrao() {
		home.login("testetestesgmail.com", "", "Please enter a valid email address.");
	}

	@Test
	public void emailInexistente() {
		home.login("10testetestes@gmail.com", "", "Login was unsuccessful. Please correct the errors and try again.");
	}

	@Test
	public void senhaBranco() {
		home.login("testetestes@gmail.com", "", "The credentials provided are incorrect");
	}

	@Test
	public void emailBranco() {
		home.login("", "B?0P248kEf-P", "No customer account found");
	}

}
