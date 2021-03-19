package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class ProductDataMaps extends BasePage{
	
	public ProductDataMaps(WebDriver driver) {
		super(driver);
	}
	
	public WebElement buttonOpenDateCalendar() {
		WebElement element = driver.findElement(By.id("openstartdatecalender"));
		return element;
	}

	public WebElement chooseDate() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]"));
		return element;
	}

	public WebElement buttonNextDate() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]"));
		return element;
	}

	public WebElement dateDefault() {
		WebElement element = driver.findElement(By.xpath("//a[@class='ui-state-default']"));
		return element;
	}
	
	public WebElement insuranceSum() {
		WebElement element = driver.findElement(By.id("insurancesum"));
		return element;
	}
	
	public WebElement meritRating() {
		WebElement element = driver.findElement(By.id("meritrating"));
		return element;
	}

	public WebElement damageInsurance() {
		WebElement element = driver.findElement(By.id("damageinsurance"));
		return element;
	}
	
	
	public WebElement setOptionalProducts(String value) {
		int cod = 0;
		if(value == "Euro Protection") {
			cod = 1;
		}
		if(value == "Legal Defense Insurance") {
			cod = 2;
		}
		WebElement element = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label["+cod+"]/span"));
		return element;
	}
	
	public WebElement courtesyCar() {
		WebElement element = driver.findElement(By.id("courtesycar"));
		return element;
	}
	
	public WebElement buttonNext() {
		WebElement element = driver.findElement(By.id("nextselectpriceoption"));
		return element;
	}
	

}
