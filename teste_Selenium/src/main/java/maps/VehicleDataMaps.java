package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class VehicleDataMaps extends BasePage {
	public VehicleDataMaps(WebDriver driver) {
		super(driver);
	}
	
	public WebElement selectComboBoxMake() {
		WebElement element = driver.findElement(By.id("make"));
		return element;
	}
	
	public WebElement selectComboBoxModel() {
		WebElement element = driver.findElement(By.id("model"));
		return element;
	}
	
	public WebElement textFieldCylinderCapacity() {
		WebElement element = driver.findElement(By.id("cylindercapacity"));
		return element;
	}
	
	public WebElement textFieldEnginePerformance() {
		WebElement element = driver.findElement(By.id("engineperformance"));
		return element;
	}
	
	public WebElement DateOfManufacture() {
		WebElement element = driver.findElement(By.id("dateofmanufacture"));
		return element;
	}
	
	public WebElement selectComboBoxNumberOfSeats() {
		WebElement element = driver.findElement(By.id("numberofseats"));
		return element;
	}
	
	public WebElement radioButtonRightHandDriveYes() {
		WebElement element = driver.findElement(By.xpath("(//*[contains(@class, 'ideal-radio')])[2]"));
		return element;
	}
	
	public WebElement setRightHandDriveNo() {
		WebElement element = driver
				.findElement(By.xpath("(//*[contains(@class, 'ideal-radio')])[4]"));
		return element;
	}
	
	public WebElement selectComboBoxNumberOfSeats1() {
		WebElement element = driver.findElement(By.id("numberofseatsmotorcycle"));
		return element;
	}
	
	public WebElement selectComboBoxFuelType() {
		WebElement element = driver.findElement(By.id("fuel"));
		return element;
	}
	
	public WebElement textFieldPayLoad() {
		WebElement element = driver.findElement(By.id("payload"));
		return element;
	}
	
	public WebElement textFieldTotalWeight() {
		WebElement element = driver.findElement(By.id("totalweight"));
		return element;
	}
	
	public WebElement textFieldListPrice() {
		WebElement element = driver.findElement(By.id("listprice"));
		return element;
	}
	
	public WebElement textFieldLicensePlateNumber() {
		WebElement element = driver.findElement(By.id("licenseplatenumber"));
		return element;
	}
	
	public WebElement textFieldAnnualMileage() {
		WebElement element = driver.findElement(By.id("annualmileage"));
		return element;
	}
	
	public WebElement Buttonnext() {
		WebElement element = driver.findElement(By.id("nextenterinsurantdata"));
		return element;
	}


}
