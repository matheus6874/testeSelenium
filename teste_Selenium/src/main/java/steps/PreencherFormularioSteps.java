package steps;

import io.cucumber.java.pt.Dado;
import pages.BasePage;
import pages.InsurantDataPage;
import pages.VehicleDataPage;

public class PreencherFormularioSteps {
	
	private BasePage basePage;	
	private VehicleDataPage vehicleDataPage;
	private InsurantDataPage insurantDataPage;

	public PreencherFormularioSteps() {
		basePage = new BasePage(BaseTest.driver);
		vehicleDataPage = new VehicleDataPage(BaseTest.driver);
		insurantDataPage = new InsurantDataPage(BaseTest.driver);
	}
	
	@Dado("que eu acesso o site {string}")
	public void que_eu_acesso_o_site(String string) {
	    basePage.acessarUrl(string);
	}
	
	@Dado("preencho o formulario Vehicle Data")
	public void preencho_o_formulario_vehicle_data() throws Exception {
		vehicleDataPage.setMake("Honda");  
		vehicleDataPage.setModel("Scooter");
		vehicleDataPage.setCylinderCapacity("150");
		vehicleDataPage.setEnginePerformance("100");
		vehicleDataPage.setDateOfManufacture("10/02/2020");
		vehicleDataPage.setNumberOfSeats("4");
		vehicleDataPage.setRightHandDrive("n");
		vehicleDataPage.setNumberOfSeats1("2");
		vehicleDataPage.setFuelType("Gas");
		vehicleDataPage.setTextFieldPayLoad("900");
		vehicleDataPage.setTextFieldTotalWeight("2000");
		vehicleDataPage.setTextFieldListPrice("16000");
		vehicleDataPage.setTextFieldLicensePlateNumber("1234");
		vehicleDataPage.setTextFieldAnnualMileage("10000");
		vehicleDataPage.nextPage();
	}
	
	@Dado("preencho o formulario Insurant Data")
	public void preencho_o_formulario_insurant_data() throws Exception {
		insurantDataPage.setFirstName("Matheus");
		insurantDataPage.setLastName("Cristino");
		insurantDataPage.setDateOfBirth("1997","May",24);
		insurantDataPage.setGender("male");
		insurantDataPage.setStreetAddress("Rua José Moraes");
		insurantDataPage.setCountry("Brazil");
		insurantDataPage.setZipCode("37472000");
		insurantDataPage.setCity("Carmo de Minas");
		insurantDataPage.setOccupation("Employee");
		insurantDataPage.setHobbie("Speeding");
		insurantDataPage.setHobbie("Bungee Jumping");
		insurantDataPage.setWebsite("https://www.linkedin.com/in/matheus-cristino-4b0377147/");
		insurantDataPage.setImage();
		insurantDataPage.nextPage();
	}
}
