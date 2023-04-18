package testCases;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddOrganizationPage;
import pageObjects.HomePage;
import testBase.BaseClass;
import utilities.DataProviders;

public class Add extends BaseClass{
	@Test ( dataProvider="BasicDataOrg", dataProviderClass=DataProviders.class)
	public void test_BasicData(Map<String, String> bsdata) {
	
		try {
			HomePage hp = new HomePage(driver);
			hp.clickOrganisation();
			hp.clickAddOrganisation();
			
		AddOrganizationPage aop = new AddOrganizationPage(driver);
			aop.setOrganizationName(bsdata.get("organization"));
			aop.setGSTnumber(bsdata.get("GSTnumber"));
			aop.setBasicDataEmail(bsdata.get("email"));
			aop.setOrganizationCode(bsdata.get("organizationCode"));
			aop.setPANNumber(bsdata.get("panNumber"));
			aop.setTANNumber(bsdata.get("tanNumber"));
			
			aop.setCA_Address(bsdata.get("CA_Address"));
			aop.setCA_Landmark(bsdata.get("CA_Landmark"));
			aop.setCA_City(bsdata.get("CA_City"));
			aop.setCA_PostalCode(bsdata.get("CA_PostalCode"));
			aop.setCA_State(bsdata.get("CA_State"));
			aop.setCA_Country(bsdata.get("CA_Country"));
			
			// aop.clickRegSameCom_address();
			aop.setRA_Address(bsdata.get("RA_Address"));
			aop.setRA_Landmark(bsdata.get("RA_Landmark"));
			aop.setRA_City(bsdata.get("RA_City"));
			aop.setRA_PostalCode(bsdata.get("RA_PostalCode"));
			aop.setRA_State(bsdata.get("RA_State"));
			aop.setRA_Country(bsdata.get("RA_Country"));
			
			aop.clickBS_Save_Next();
			
			Assert.assertEquals(aop.isDisplayedCP_Firstname(), true);
			

		} catch (Exception e) {
			Assert.fail();
		}
		
	}

}
