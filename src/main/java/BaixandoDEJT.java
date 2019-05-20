
// Generated by Selenium IDE
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaixandoDEJT {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void BaixandoDEJT() {
		driver.get("https://dejt.jt.jus.br/dejt/f/n/diariocon");
		driver.manage().window().setSize(new Dimension(1600, 839));
		driver.findElement(By.id("corpo:formulario:tipoCaderno")).click();
		{
			WebElement dropdown = driver.findElement(By.id("corpo:formulario:tipoCaderno"));
			dropdown.findElement(By.xpath("//option[. = 'Administrativo']")).click();
		}
		driver.findElement(By.id("corpo:formulario:tipoCaderno")).click();
		driver.findElement(By.id("corpo:formulario:tribunal")).click();
		{
			WebElement dropdown = driver.findElement(By.id("corpo:formulario:tribunal"));
			dropdown.findElement(By.xpath("//option[. = 'TRT 1ª Região']")).click();
		}
		driver.findElement(By.id("corpo:formulario:tribunal")).click();
		driver.findElement(By.cssSelector("#corpo\\3A formulario\\3A botaoAcaoPesquisar .plc-corpo-acao-t")).click();
		driver.findElement(By.cssSelector(".bt > img")).click();
	}
}
