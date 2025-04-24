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
	 private By Email = By.id("Email");
	 private By Password = By.id("Password");
	 private By ConfirmPassword = By.id("ConfirmPassword");
	 private By btnRegister = By.id("register-button");
	 
}
