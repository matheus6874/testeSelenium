package pages;

import org.openqa.selenium.WebDriver;
import maps.PriceOptionMaps;

public class PriceOptionPage extends BasePage{
	private PriceOptionMaps priceOptionMaps;
	
	public PriceOptionPage(WebDriver driver) {
		super(driver);
		priceOptionMaps = new PriceOptionMaps(driver);
	}

	public void setPriceOptions(String value) throws Exception {
		click(priceOptionMaps.radioButtonPrice(value));
	}
	
	public void nextPage() throws Exception {
		click(priceOptionMaps.buttonNext());
	}
}
