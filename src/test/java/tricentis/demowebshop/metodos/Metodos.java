package tricentis.demowebshop.metodos;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;

import tricentis.demowebshop.drivers.Drivers;

public class Metodos extends Drivers {

	public void clicar(By locator) {
		try {
			driver.findElement(locator).click();
		} catch (Exception e) {
			throw new NoSuchElementException("Elemento não encontrado " + locator);
		}

	}

	public void escrever(By firstName, String string) {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
}
