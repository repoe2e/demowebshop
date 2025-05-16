package tricentis.demowebshop.testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tricentis.demowebshop.config.Navegador;
import tricentis.demowebshop.elementos.Elementos;
import tricentis.demowebshop.metodos.Metodos;

public class LogoutTest {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	@BeforeEach // deve ser executado antes de cada teste
	public void setUp() {
		Navegador.abrirNavegador();
		metodo.clicar(el.getMenuLogin());
		metodo.escrever(el.getEmail(), "testetestes@gmail.com");
		metodo.escrever(el.getPassword(), "B?0P248kEf-P");
		metodo.clicar(el.getBtnLogin());
	}

	@AfterEach
	public void tearDown() {
		Navegador.fecharNavegador();
	}

	@Test
	public void logoutSucesso() {
		metodo.esperarElementoClicavel(el.getMenuLogout(), 10);
		metodo.clicar(el.getMenuLogout());
		metodo.validarUrl("https://demowebshop.tricentis.com/");
	}
}