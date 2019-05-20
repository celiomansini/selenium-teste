import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestaSelenium {

	public static void main(String[] args) {

		WebDriver driver;
		// chrome ::::::::::::::::::::::::::::::::::
		// System.setProperty("webdriver.chrome.driver","C:\\Users\\celio.silva\\Desktop\\CELIO\\particular\\CURSOS\\chromedriver\\chromedriver.exe");
		// driver = new ChromeDriver();

		// firefox ::::::::::::::::::::::::::::
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\celio.silva\\Desktop\\CELIO\\particular\\CURSOS\\geckodriver-v0.24.0-win64\\geckodriver.exe");

		FirefoxOptions opt = new FirefoxOptions();

		opt.addPreference("browser.download.folderList", 2);
		opt.addPreference("browser.download.manager.showWhenStarting", false);
		opt.addPreference("browser.download.dir", "c:\\temp");
		opt.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");

		opt.addPreference("pdfjs.disabled", true);

		// Use this to disable Acrobat plugin for previewing PDFs in Firefox (if you
		// have Adobe reader installed on your computer)
		opt.addPreference("plugin.scan.Acrobat", "99.0");
		opt.addPreference("plugin.scan.plid.all", false);
		// driver = new FirefoxDriver(firefoxProfile);
		driver = new FirefoxDriver(opt);

		// acessa DEJT
		driver.get("https://dejt.jt.jus.br/dejt/f/n/diariocon");
		driver.manage().window().maximize();

		driver.findElement(By.id("corpo:formulario:tipoCaderno")).click();
		{
			WebElement dropdown = driver.findElement(By.id("corpo:formulario:tipoCaderno"));
			dropdown.findElement(By.xpath("//option[. = 'Judiciário']")).click();
		}
		// Ensure the new page is loaded - by checking for the presence of "element_ID"
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("corpo:formulario:tribunal")));

		driver.findElement(By.id("corpo:formulario:tribunal")).click();
		{
			// WebElement dropdown = driver.findElement(By.id("corpo:formulario:tribunal"));
			// dropdown.findElement(By.xpath("//option[. = 'TRT 1ª Região']")).click();
			Select tribunal = new Select(driver.findElement(By.id("corpo:formulario:tribunal")));
			tribunal.selectByVisibleText("TRT 1ª Região");
		}
		driver.findElement(By.id("corpo:formulario:tribunal")).click();
		driver.findElement(By.cssSelector("#corpo\\3A formulario\\3A botaoAcaoPesquisar .plc-corpo-acao-t")).click();
		driver.findElement(By.cssSelector(".bt > img")).click();

//		try {
//			driver.wait(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 driver.close();

	}

}
