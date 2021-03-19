package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class PriceOptionMaps extends BasePage {
	public PriceOptionMaps(WebDriver driver) {
		super(driver);
	}
	
	public WebElement radioButtonPrice(String value) {
		int cod = 0;
		if(value == "Silver") {
			cod = 1;
		}
		if(value == "Gold") {
			cod = 2;
		}
		if(value == "Platinum") {
			cod = 3;
		}
		if(value == "Ultimate") {
			cod = 4;
		}
		WebElement element = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[" + cod + "]/span"));
		return element;
	}
	
	public WebElement buttonNext() {
		WebElement element = driver.findElement(By.id("nextsendquote"));
		return element;
	}

}
