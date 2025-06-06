package tricentis.demowebshop.metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.opentest4j.AssertionFailedError;

import tricentis.demowebshop.drivers.Drivers;

public class Metodos extends Drivers {

	public void clicar(By locator) {
		try {
			esperarElementoClicavel(locator, 5);
			driver.findElement(locator).click();
		} catch (Exception e) {
			throw new NoSuchElementException("Elemento não encontrado " + locator);
		}

	}

	public void clicar(String elemento, String texto) {
		try {
			driver.findElement(By.xpath("//*[" + elemento + "]//*[contains(text(),'" + texto + "')]")).click();
		} catch (Exception e) {
			throw new NoSuchElementException("Elemento não encontrado com o texto " + texto);
		}

	}

	public void escrever(By locator, String texto) {
		try {
			driver.findElement(locator).sendKeys(texto);
		} catch (Exception e) {
			throw new NoSuchElementException("Elemento não encontrado " + locator);
		}
	}

	public void validarTexto(By locator, String textoDesejado) {
		try {
			String textoCapturado = driver.findElement(locator).getText();
			assertEquals(textoDesejado, textoCapturado);
		} catch (Exception e) {
			throw new AssertionFailedError("Texto em branco ou errado!");
		}
	}

	public void validarTexto(String textoDesejado) {
		try {
			esperarElementoVisivel(By.xpath("//*[text()='" + textoDesejado + "']"), 5);
			String textoCapturado = driver.findElement(By.xpath("//*[text()='" + textoDesejado + "']")).getText();
			assertEquals(textoDesejado, textoCapturado);
		} catch (Exception e) {
			throw new AssertionFailedError("Texto em branco ou errado!");
		}
	}

	public void esperarElementoClicavel(By locator, int segundos) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(segundos));
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (Exception e) {
			throw new NoSuchElementException("Elemento não encontrado " + locator);
		}
	}

	public void esperarElementoVisivel(By locator, int segundos) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(segundos));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception e) {
			throw new NoSuchElementException("Elemento não encontrado " + locator);
		}
	}

	public void validarUrl(String urlDesejada) {
		try {
			assertEquals(urlDesejada, driver.getCurrentUrl());
		} catch (Exception e) {
			throw new NotFoundException(urlDesejada + " não encontrada.");
		}
	}

	public String alrt() {

		return driver.switchTo().alert().getText();

	}
	
	
	
	

}