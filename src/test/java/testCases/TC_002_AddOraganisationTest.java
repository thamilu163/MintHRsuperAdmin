package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddOrganizationPage;
import pageObjects.HomePage;
import pageObjects.ViewOrganizationsPage;
import testBase.BaseClass;

// Validate (with valid credentials) functionality of all elements except check box (Communication address
//same as Registered address )including previous button
public class TC_002_AddOraganisationTest extends BaseClass {
	@Test(priority = 1)
	public void test_BasicData() {
		logger.info("***Clicking on Home page***");
		try {
			HomePage hp = new HomePage(driver);
			hp.clickOrganisation();
			hp.clickAddOrganisation();
			logger.info("***adding organisation details****");
			AddOrganizationPage aop = new AddOrganizationPage(driver);
			aop.setOrganizationName(randomeString().toUpperCase());
			aop.setGSTnumber("29GBGPS4589H5Z4");
			aop.setBasicDataEmail(randomAlphaNumeric() + "@gmail.com");
			aop.setOrganizationCode(randomeNumber());
			aop.setPANNumber("GBGPS1047L");
			aop.setTANNumber("RDSG58469U");
			logger.info("***filling communication address details***");
			aop.setCA_Address("Peruvaje house 1-123/1");
			aop.setCA_Landmark("Bellare");
			aop.setCA_City("Mangalore");
			aop.setCA_PostalCode("574212");
			aop.setCA_State("Karnataka");
			aop.setCA_Country("India");
			logger.info("***filling Registered address  details***");
			// aop.clickRegSameCom_address();
			aop.setRA_Address("Peruvaje house 1-123/1");
			aop.setRA_Landmark("Bellare");
			aop.setRA_City("Mangalore");
			aop.setRA_PostalCode("574212");
			aop.setRA_State("Karnataka");
			aop.setRA_Country("India");
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

	@Test(priority = 2, dependsOnMethods = { "test_BasicData" })
	public void testContactPerson() throws InterruptedException {
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
	@Test(priority=3, dependsOnMethods= {"testContactPerson"})
	public void testBillingDetails() throws InterruptedException {
		logger.info("***Will enter banking details***");
		try {
		AddOrganizationPage aop=new AddOrganizationPage(driver);
		aop.setBD_Bankname(randomeString().toUpperCase());
		aop.setBD_IFSCcode("ASDF0001254");
		aop.setBD_AccountNumber(randomeNumber());
		aop.setBD_PlanValidity("05-04-2025");
		aop.setBD_Numb_User("200");
		logger.info("*** entered banking details***");
		logger.info("***Will enter banking contact person  details***");
		aop.setBCP_Firstname(randomeString().toUpperCase());
		aop.setBCP_Middlename(randomeString().toUpperCase());
		aop.setBCP_Lastname(randomeString().toUpperCase());
		aop.setBCP_EmailAddress(randomAlphaNumeric()+"@gmail.com");
		aop.setBCP_PhoneNumber("8695425487");
		logger.info("entered phone number");
		logger.info("***Will enter banking address details***");
		aop.setBA_Address(randomeString());
		aop.setBA_Landmark(randomeString());
		logger.info("***checking functionality of privious button in Banking detail page***");
		aop.clickBD_Privious();//checking functionality of privious button in Banking detail page
		logger.info("*** privious button works fine in Banking detail page***");
		aop.clickCP_Save_Next();
		logger.info("***back to banking address details***");
		aop.setBA_City(randomeString());
		aop.setBA_PostalCode("574587");
		logger.info("***entred postal pincode***");
		aop.setBA_State(randomeString());
		logger.info("***entred state***");
		aop.setBA_Country("Lebanon");
		logger.info("****entered All the details of Banks****");
	//	aop.clickDB_Save();
		logger.info("***successfully clicked on save button***");
		ViewOrganizationsPage vop=new ViewOrganizationsPage(driver);
		Assert.assertEquals(vop.isDisplayedViewOrganisation(), true);
		logger.info("**Condition validated**");
		}catch (Exception e) {
			Assert.fail();
		}
	}
}
