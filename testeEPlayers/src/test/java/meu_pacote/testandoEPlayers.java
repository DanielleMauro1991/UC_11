package meu_pacote;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testandoEPlayers {
	
	private WebDriver driver;
	
	@Before //Antes de iniciar o teste
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
	}
	
	@Test //Testando o projeto
	
	public void testeangular() {
		
		driver.get("http://localhost:4200");
		driver.findElement(By.id("campo-email")).sendKeys("caique@email.com");
		driver.findElement(By.id("campo-email")).sendKeys(Keys.RETURN);
		
	}
}
