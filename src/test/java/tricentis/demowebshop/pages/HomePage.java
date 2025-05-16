package tricentis.demowebshop.pages;

import org.openqa.selenium.By;
import tricentis.demowebshop.elementos.Elementos;
import tricentis.demowebshop.metodos.Metodos;

public class HomePage {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	public void enviarDadosDeLogin(String email, String senha) {
		metodo.clicar(el.getMenuLogin());
		metodo.escrever(el.getEmail(), email);
		metodo.escrever(el.getPassword(), senha);
		metodo.clicar(el.getBtnLogin());
	}

	public void login(String email, String senha) {
		enviarDadosDeLogin(email, senha);
		metodo.validarTexto(email);
	}

	public void login(String email, String senha, String msgError) {
		enviarDadosDeLogin(email, senha);
		metodo.validarTexto(msgError);
	}

	public void login(String email, String senha, String msgError, String msgErro1) {
		enviarDadosDeLogin(email, senha);
		metodo.validarTexto(msgError);
		metodo.validarTexto(msgErro1);
	}

	/**
	 * Se não possuir subcategoria informar no segundo parametro null
	 * @param categoria
	 * @param subCategoria
	 */
	public void headerMenu(String categoria, String subCategoria) {
		metodo.clicar("@class='top-menu'", categoria);
		if (subCategoria != null || subCategoria.trim().isEmpty()) {
			metodo.clicar("@class='top-menu'", categoria);
		}
	}

}