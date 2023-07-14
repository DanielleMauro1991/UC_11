package testesenaicursos;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testebuscarinfo {
	
	private WebDriver driver;
	
	@Before
	public void abrirNavegador () {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
	    driver = new ChromeDriver ();
	    driver.manage().window().maximize();
	}
	
	@Test
	public void testeNavegador () {
		/*driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("videos de programacao");
		driver.findElement(By.className("gLFyf")).sendKeys(Keys.RETURN);	*/
		
		/*driver.get("https://www.google.com/maps/search/maps/@-25.1521977,-52.5798277,7z/data=!3m1!4b1?entry=ttu"); */
		
		driver.get("https://www.mercadolivre.com.br/");
		driver.findElement(By.className("nav-search-input")).sendKeys("festa infantil");
		driver.findElement(By.className("nav-search-input")).sendKeys(Keys.RETURN);
			
		
	}

}
