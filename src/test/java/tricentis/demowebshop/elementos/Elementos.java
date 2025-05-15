package tricentis.demowebshop.elementos;

import org.openqa.selenium.By;
import lombok.Getter;

@Getter
public class Elementos {
	
	/*
	 * Elementos para registrar usuário
	 */
	 private By menuRegister = By.xpath("//a[@href='/register']");
	 private By firstName = By.id("FirstName");
	 private By lastName = By.id("LastName");
	 private By email = By.id("Email");
	 private By password = By.id("Password");
	 private By confirmPassword = By.id("ConfirmPassword");
	 private By btnRegister = By.id("register-button");
	 
	 
	 
	 /*
	  * Elementos para login
	  */
	 private By menuLogin = By.xpath("//a[@href='/login']");
	 private By btnLogin = By.xpath("//input[@class='button-1 login-button']");
	 
}
