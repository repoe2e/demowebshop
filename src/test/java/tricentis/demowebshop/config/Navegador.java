package tricentis.demowebshop.config;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import tricentis.demowebshop.drivers.Drivers;

public class Navegador extends Drivers {
	
	public static void abrirNavegador() {
		try {
			ChromeOptions option = new ChromeOptions();
			//option.addArguments("--headless");// não abre o navegador
			driver = new  ChromeDriver(option);
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
		} catch (Exception e) {
			System.err.println("Erro ao abrir Navegador " + e.getCause());
			throw new WebDriverException();
		}
	}

}
