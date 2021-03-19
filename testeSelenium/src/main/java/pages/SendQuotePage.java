package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import maps.SendQuoteMaps;

public class SendQuotePage extends BasePage{
	
	private SendQuoteMaps sendQuoteMaps;

	public SendQuotePage(WebDriver driver) {
		super(driver);
		sendQuoteMaps = new SendQuoteMaps(driver);
	}
	
	public void setEmail(String value) throws Exception {
		preencherCampoTexto(sendQuoteMaps.textFieldinputEmail(), value);
	}
	
	public void setPhone(String value) throws Exception {
		preencherCampoTexto(sendQuoteMaps.textFieldinputPhone(), value);
	}
	
	public void setUsernamer(String value) throws Exception {
		preencherCampoTexto(sendQuoteMaps.textFieldinputUsername(), value);
	}
	
	public void setPassword(String value) throws Exception {
		preencherCampoTexto(sendQuoteMaps.textFieldinputPassword(), value);
	}
	
	public void setConfirmPassword(String value) throws Exception {
		preencherCampoTexto(sendQuoteMaps.textFieldinputConfirmPassword(), value);
	}
	
	public void setComments(String value) throws Exception {
		preencherCampoTexto(sendQuoteMaps.textFieldinputComments(), value);
	}
	
	public void clickSendForm() throws Exception {
		click(sendQuoteMaps.buttonSendEmail());
	}
	
	public void clickConfirmSendForm() throws Exception {
		click(sendQuoteMaps.buttonSendingEmailSuccess());
	}
	
	public void validateInviteForm(String value) throws Exception {
		boolean verifica = false;
		if (sendQuoteMaps.alertSendingEmailSuccess().getText().equals(value)) {
			verifica = true;
			clickConfirmSendForm();
		}
		Assert.assertTrue(verifica);
	}

}
