package tricentis.demowebshop.testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tricentis.demowebshop.config.Navegador;
import tricentis.demowebshop.pages.HomePage;

public class ComprarProdutoTest {
	
	HomePage home = new HomePage();
	
	
	@BeforeEach
	public void setup() {
		Navegador.abrirNavegador();
		home.login("testetestes@gmail.com", "B?0P248kEf-P");
		
	}
	
	
	@Test
	public void comprarProduto() {
		home.headerMenu("Computer",null);
	}


}
