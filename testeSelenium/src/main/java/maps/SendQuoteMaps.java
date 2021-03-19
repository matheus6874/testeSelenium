package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class SendQuoteMaps extends BasePage {
	
	public SendQuoteMaps(WebDriver driver) {
		super(driver);
	}
	
	public WebElement textFieldinputEmail() {
		WebElement element = driver.findElement(By.id("email"));
		return element;
	}
	
	public WebElement textFieldinputPhone() {
		WebElement element = driver.findElement(By.id("phone"));
		return element;
	}
	
	public WebElement textFieldinputUsername() {
		WebElement element = driver.findElement(By.id("username"));
		return element;
	}
	
	public WebElement textFieldinputPassword() {
		WebElement element = driver.findElement(By.id("password"));
		return element;
	}
	
	public WebElement textFieldinputConfirmPassword() {
		WebElement element = driver.findElement(By.id("confirmpassword"));
		return element;
	}
	
	public WebElement textFieldinputComments() {
		WebElement element = driver.findElement(By.id("Comments"));
		return element;
	}
	
	public WebElement buttonSendEmail() {
		WebElement element = driver.findElement(By.id("sendemail"));
		return element;
	}
	
	public WebElement alertSendingEmailSuccess() {
		WebElement element = driver.findElement(By.xpath("//div['sweet-alert showSweetAlert visible']//h2"));
		return element;
	}
	
	public WebElement buttonSendingEmailSuccess() {
		WebElement element = driver
				.findElement(By.xpath("//div['sweet-alert showSweetAlert visible']//button[@class='confirm']"));
		return element;
	}
}
