package pages;

import org.openqa.selenium.WebDriver;
import maps.ProductDataMaps;

public class ProductDataPage extends BasePage {
	private ProductDataMaps productDataMaps;
	public ProductDataPage(WebDriver driver) {
		super(driver);
		productDataMaps = new ProductDataMaps(driver);
	}

	public void setStartDate(String ano) throws Exception {
		click(productDataMaps.buttonOpenDateCalendar());
		while (!productDataMaps.chooseDate().getText().equals(ano)) {
			click(productDataMaps.buttonNextDate());
		}
		click(productDataMaps.dateDefault());
	}
	
	public void setInsuranceSum(String value) throws Exception {
		selectComboBox(productDataMaps.insuranceSum(), value);
	}
	
	public void setMeritRating(String value) throws Exception {
		selectComboBox(productDataMaps.meritRating(), value);
	}
	
	public void setDamageInsurance(String value) throws Exception {
		selectComboBox(productDataMaps.damageInsurance(), value);
	}
	
	public void selectOptionalProducts(String value) throws Exception {
		click(productDataMaps.setOptionalProducts(value));
	}
	
	public void setCourtesyCar(String value) throws Exception {
		selectComboBox(productDataMaps.courtesyCar(), value);
	}
	
	public void nextPage() throws Exception {
		click(productDataMaps.buttonNext());
	}
	
}
