package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.BasePage;
import pages.InsurantDataPage;
import pages.PriceOptionPage;
import pages.VehicleDataPage;
import pages.ProductDataPage;
import pages.SendQuotePage;

public class PreencherFormularioSteps {
	
	private BasePage basePage;	
	private VehicleDataPage vehicleDataPage;
	private InsurantDataPage insurantDataPage;
	private ProductDataPage productDataPage;
	private PriceOptionPage priceOptionPage;
	private SendQuotePage sendQuotePage;

	public PreencherFormularioSteps() {
		basePage = new BasePage(BaseTest.driver);
		vehicleDataPage = new VehicleDataPage(BaseTest.driver);
		insurantDataPage = new InsurantDataPage(BaseTest.driver);
		productDataPage = new ProductDataPage(BaseTest.driver);
		priceOptionPage = new PriceOptionPage(BaseTest.driver);
		sendQuotePage = new SendQuotePage(BaseTest.driver);
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
	
	@Dado("preencho o formulario Product Data")
	public void preencho_o_formulario_product_data() throws Exception {
		productDataPage.setStartDate("2023");
		productDataPage.setInsuranceSum("7.000.000,00");
		productDataPage.setMeritRating("Bonus 6");
		productDataPage.setDamageInsurance("Partial Coverage");
		productDataPage.selectOptionalProducts("Euro Protection");
		productDataPage.setCourtesyCar("No");
		productDataPage.nextPage();
	}
	
	@Dado("preencho o formulario Price Option")
	public void preencho_o_formulario_price_option() throws Exception {
		priceOptionPage.setPriceOptions("Gold");
		priceOptionPage.nextPage();
	}
	
	@Dado("preencho o formulario Send Quote")
	public void preencho_o_formulario_send_quote() throws Exception {
		sendQuotePage.setEmail("matheus.scristino@gmail.com");
		sendQuotePage.setPhone("35992017484");
		sendQuotePage.setUsernamer("matheuscristino");
		sendQuotePage.setPassword("Mat2021");
	    sendQuotePage.setConfirmPassword("Mat2021");
	    sendQuotePage.setComments("Lorem Ipsum Lorem Ipsum Lorem Ipsum");
	}
	
	@Quando("submeto o formulario")
	public void submeto_o_formulario() throws Exception {
	  sendQuotePage.clickSendForm();
	}
	
	@Então("deve-se ver a mensagem de sucesso {string}")
	public void deve_se_ver_a_mensagem_de_sucesso(String string) throws Exception {
		sendQuotePage.validateInviteForm(string);
	}
	
}
