package Pacote_ER2_UC11;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ER2_UC11_PACOTE {
	
	private WebDriver driver; 
	
	@Before
	public void abrirNavegador () {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
	    driver = new ChromeDriver ();
	    driver.manage().window().maximize();
	}
	
    @Test //Testando o projeto
	
	public void testeangular() {
		
		driver.get("http://localhost:4200/");
		driver.findElement(By.id("campo-email")).sendKeys("danielle@email.com");
		driver.findElement(By.tagName("button")).click();
		
	}
}
