package maps;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;

public class InsurantDataMaps extends BasePage{
	
	public InsurantDataMaps(WebDriver driver) {
		super(driver);
	}
	
	public WebElement textFieldFirstName() {
		WebElement element = driver.findElement(By.id("firstname"));
		return element;
	}
	
	public WebElement textFieldLastName() {
		WebElement element = driver.findElement(By.id("lastname"));
		return element;
	}
	
	public WebElement buttonDataBirthCalendar() {
		WebElement element = driver.findElement(By.id("opendateofbirthcalender"));
		return element;
	}
	
	public WebElement textYear() {
		WebElement element = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
		return element;
	}
	
	public WebElement textMonth() {
		WebElement element = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		return element;
	}
	
	public WebElement buttonPrevDate() {
		WebElement element = driver.findElement(By.xpath("//*[@data-handler='prev']"));
		return element;
	}

	public WebElement buttonDateDefault(int dia) {
		WebElement element = driver.findElement(By.xpath("(//a[@class='ui-state-default'])["+dia+"]"));
		return element;
	}
	
	public WebElement genderMale() {
		WebElement element = driver
				.findElement(By.xpath("(//*[contains(@class, 'ideal-')])[6]"));
		return element;
	}

	public WebElement genderFemale() {
		WebElement element = driver
				.findElement(By.xpath("(//*[contains(@class, 'ideal-')])[8]"));
		return element;
	}
	
	public WebElement textFieldStreetAddress() {
		WebElement element = driver.findElement(By.id("streetaddress"));
		return element;
	}
	
	public WebElement comboBoxCountry() {
		WebElement element = driver.findElement(By.id("country"));
		return element;
	}
	
	public WebElement textFiledZipCode() {
		WebElement element = driver.findElement(By.id("zipcode"));
		return element;
	}
	
	public WebElement textFieldCity() {
		WebElement element = driver.findElement(By.id("city"));
		return element;
	}
	
	public WebElement comboBoxOccupation() {
		WebElement element = driver.findElement(By.id("occupation"));
		return element;
	}
	
	public WebElement checkHobbie(String value) {
		int cod = 0;
		
		if(value == "Speeding") {
			cod = 1;
		}
		if(value == "Bungee Jumping") {
			cod = 2;
		}
		if(value == "Cliff Diving") {
			cod = 3;
		}
		if(value == "Skydiving") {
			cod = 4;
		}
		if(value == "Other") {
			cod = 5;
		}
		WebElement element = driver.findElement(By.xpath("(//span[@class='ideal-check'])["+cod+"]"));
		return element;
	}
	
	public WebElement textFieldWebsite() {
		WebElement element = driver.findElement(By.id("website"));
		return element;
	}
	
	public WebElement image() {
		WebElement element = driver.findElement(By.id("picture"));
		return element;
	}
	
	public WebElement openImage() {
		WebElement element = driver.findElement(By.id("open"));
		return element;
	}
	
	public WebElement buttonNext() {
		WebElement element = driver.findElement(By.id("nextenterproductdata"));
		return element;
	}

}
