package pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.WebDriver;
import maps.InsurantDataMaps;

public class InsurantDataPage extends BasePage {
	
	private InsurantDataMaps insurantDataMaps;
	
	public InsurantDataPage(WebDriver driver) {
		super(driver);
		insurantDataMaps = new InsurantDataMaps(driver);
	}
	
	public void setFirstName(String value) throws Exception {
		preencherCampoTexto(insurantDataMaps.textFieldFirstName(), value);
	}

	public void setLastName(String value) throws Exception {
		preencherCampoTexto(insurantDataMaps.textFieldLastName(), value);
	}
	
	public void setDateOfBirth(String ano,String mes,int dia) throws Exception {
		click(insurantDataMaps.buttonDataBirthCalendar());
		while (!insurantDataMaps.textYear().getText().equals(ano)) {
			click(insurantDataMaps.buttonPrevDate());
		}
		while (!insurantDataMaps.textMonth().getText().equals(mes)) {
			click(insurantDataMaps.buttonPrevDate());
		}
		click(insurantDataMaps.buttonDateDefault(dia));
	}
	
	public void setGender(String value) throws Exception {
		if (value == "female") {
			insurantDataMaps.genderFemale().click();
		} else {
			insurantDataMaps.genderMale().click();
		}
	}
	
	public void setStreetAddress(String value) throws Exception {
		preencherCampoTexto(insurantDataMaps.textFieldStreetAddress(), value);
	}
	
	public void setCountry(String value) throws Exception {
		selectComboBox(insurantDataMaps.comboBoxCountry(), value);
	}
	
	public void setZipCode(String value) throws Exception {
		preencherCampoTexto(insurantDataMaps.textFiledZipCode(), value);
	}
	
	public void setCity(String value) throws Exception {
		preencherCampoTexto(insurantDataMaps.textFieldCity(), value);
	}
	
	public void setOccupation(String value) throws Exception {
		selectComboBox(insurantDataMaps.comboBoxOccupation(), value);
	}
	
	public void setHobbie(String value) throws Exception {
		click(insurantDataMaps.checkHobbie(value));
	}
	
	public void setWebsite(String value) throws Exception {
		preencherCampoTexto(insurantDataMaps.textFieldWebsite(), value);
	}
	

	public void setImage() throws Exception {
		String imagem = "file:///" + System.getProperty("user.dir") + "/src/main/resources/teste.jpg";

		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection str = new StringSelection(imagem);
		clipboard.setContents(str, null);

		click(insurantDataMaps.openImage());
		implicitWait(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		implicitWait(3000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		implicitWait(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		implicitWait(4000);
	}

	public void nextPage() throws Exception {
		click(insurantDataMaps.buttonNext());
	}

}
