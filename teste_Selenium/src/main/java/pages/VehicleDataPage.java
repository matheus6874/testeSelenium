package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import maps.VehicleDataMaps;


public class VehicleDataPage extends BasePage {
	private VehicleDataMaps vehicleDataMaps;
	
	public VehicleDataPage(WebDriver driver) {
		super(driver);
		vehicleDataMaps = new VehicleDataMaps(driver);
	}
	
	public void setMake(String value) throws Exception {
		selectComboBox(vehicleDataMaps.selectComboBoxMake(), value);
	}
	
	public void setModel(String value) throws Exception {
		selectComboBox(vehicleDataMaps.selectComboBoxModel(), value);
	}
	
	public void setCylinderCapacity(String value) throws Exception {
		setTextField(vehicleDataMaps.textFieldCylinderCapacity(), value);
	}
	
	public void setEnginePerformance(String value) throws Exception {
		setTextField(vehicleDataMaps.textFieldEnginePerformance(), value);
	}
	
	public void setDateOfManufacture(String data) throws Exception {
		setTextField(vehicleDataMaps.DateOfManufacture(), data);
	}
	
	public void setNumberOfSeats(String value) throws Exception {
		selectComboBox(vehicleDataMaps.selectComboBoxNumberOfSeats(), value);
	}
	
	public void setNumberOfSeats1(String value) throws Exception {
		selectComboBox(vehicleDataMaps.selectComboBoxNumberOfSeats1(), value);
	}
	
	public void setFuelType(String value) throws Exception {
		selectComboBox(vehicleDataMaps.selectComboBoxFuelType(), value);
	}
	
	public void setTextFieldPayLoad(String value) throws Exception {
		setTextField(vehicleDataMaps.textFieldPayLoad(), value);
	}
	
	public void setTextFieldTotalWeight(String value) throws Exception {
		setTextField(vehicleDataMaps.textFieldTotalWeight(), value);
	}
	
	public void setTextFieldListPrice(String value) throws Exception {
		setTextField(vehicleDataMaps.textFieldListPrice(), value);
	}
	
	public void setTextFieldLicensePlateNumber(String value) throws Exception {
		setTextField(vehicleDataMaps.textFieldLicensePlateNumber(), value);
	}
	
	public void setTextFieldAnnualMileage(String value) throws Exception {
		setTextField(vehicleDataMaps.textFieldAnnualMileage(), value);
	}
	
	public void nextPage() throws Exception {
		click(vehicleDataMaps.Buttonnext());
	}
	
	public void setRightHandDrive(String value) throws Exception {
		if (value == "y") {
			vehicleDataMaps.radioButtonRightHandDriveYes().click();
		} else {
			vehicleDataMaps.setRightHandDriveNo().click();
		}
	}
	
}
