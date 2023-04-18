package testCases;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddOrganizationPage;
import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.DataProviders;

public class AddOrganizationDataDriven extends BaseClass {
	@Test(priority = 1,dataProvider = "BasicDataOrg", dataProviderClass = DataProviders.class)
	public void test_BasicDataDDT(Map<String, String> bsdata) {
		logger.info("***Clicking on Home page***");
		try {
			HomePage hp = new HomePage(driver);
			hp.clickOrganisation();
			hp.clickAddOrganisation();
			logger.info("***adding organisation details****");
			AddOrganizationPage aop = new AddOrganizationPage(driver);
			aop.setOrganizationName(randomeString().toUpperCase());
			aop.setGSTnumber(bsdata.get("GSTnumber"));
			aop.setBasicDataEmail(bsdata.get("email"));
			aop.setOrganizationCode(randomeNumber());
			aop.setPANNumber(bsdata.get("panNumber"));
			aop.setTANNumber(bsdata.get("tanNumber"));
			logger.info("***filling communication address details***");
			aop.setCA_Address(bsdata.get("CA_Address"));
			aop.setCA_Landmark(bsdata.get("CA_Landmark"));
			aop.setCA_City(bsdata.get("CA_City"));
			aop.setCA_PostalCode(bsdata.get("CA_PostalCode"));
			aop.setCA_State(bsdata.get("CA_State"));
			aop.setCA_Country(bsdata.get("CA_Country"));
			logger.info("***filling Registered address  details***");
			aop.clickRegSameCom_address();
		//	Thread.sleep(5000);
			aop.setRA_Address(bsdata.get("RA_Address"));
			aop.setRA_Landmark(bsdata.get("RA_Landmark"));
			aop.setRA_City(bsdata.get("RA_City"));
			aop.setRA_PostalCode1(bsdata.get("RA_PostalCode"));
			aop.setRA_State(bsdata.get("RA_State"));
			aop.setRA_Country(bsdata.get("RA_Country"));
			Thread.sleep(5000);
			logger.info("***clicking on save next button***");
			aop.clickBS_Save_Next();
		
			logger.info("***successfully clicked on save and next button***");
			logger.info("****will Validate condition in contact person page***");
			Assert.assertEquals(aop.isDisplayedCP_Firstname(), true);
			logger.info("**** Validated condition in contact person page***");

		} catch (Exception e) {
			Assert.fail();
		}
		logger.info("***Basic data of addOrganisation done***");
	}
	@Test(priority = 2)
 public void testContactPersonDDT(){
	 logger.info("***Filling details into contact person page***");
	 try {
		 AddOrganizationPage aop = new AddOrganizationPage(driver);
		 aop.setCP_Firstname(randomeString().toUpperCase());
		 aop.setCP_Milddlename(randomeString().toUpperCase());
		 aop.setCP_Lastname(randomeString().toUpperCase());
		 aop.setCP_Email(randomAlphaNumeric() + "@gmail.com");
		 aop.setCP_PhoneNumber(randomeNumber());
		 logger.info("***Filled  contact person details***");
		 aop.setAMFirstname(randomeString().toUpperCase());
		 aop.clickCP_Privious(); // checking functionality of privious button in contact person page
		 logger.info("****checking functionality of privious button in contact person page***");
		 aop.clickBS_Save_Next(); // back to contact person details
		 logger.info("****back to contact person details***");
		 aop.setAMMiddlename(randomeString().toUpperCase());
		 aop.setAMLastname(randomeString().toUpperCase());
		 aop.setAMDesigmation(randomeString());
		 aop.setAMdEmail(randomAlphaNumeric() + "@gmail.com");
		 aop.setAMPhoneNumber(randomeNumber());
		 logger.info("***filled Account Manager details");
		 aop.clickCP_Save_Next();
		 logger.info("****Clicked save and next button***");
		 Assert.assertEquals(aop.isDisplayedBD_Bankname(), true);
		 logger.info("***Validated an element in Bank detail page***");
	 } catch (Exception e) {
		 Assert.fail();
	 }
 }
}
