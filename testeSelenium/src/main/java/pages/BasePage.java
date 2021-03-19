package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriverWait wait;
	public WebDriver driver;
	public Actions action;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.action = new Actions(driver);
		this.wait = new WebDriverWait(driver, 80);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	}
	
	public void acessarUrl(String url) {
		driver.navigate().to(url);
	}
	
	public void preencherCampoTexto(WebElement campo, String value) {
		wait.until(ExpectedConditions.visibilityOf(campo));
		campo.clear();
		campo.sendKeys(value);
	}
	
	public void selectComboBox(WebElement campo, String value) throws Exception {
		Select combo = new Select(campo);
		combo.selectByVisibleText(value);
	}
	
	public void setTextField(WebElement campo, String value) {
		wait.until(ExpectedConditions.visibilityOf(campo));
		campo.clear();
		campo.sendKeys(value);
	}
	
	public void click(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	
	public static void implicitWait(int valor) throws InterruptedException {
		Thread.sleep(valor);
	}
}
