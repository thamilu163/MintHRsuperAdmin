package testCases;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddOrganizationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class AddOrganizationDataDriven extends BaseClass {
	@Test(priority = 1,dataProvider = "BasicDataOrg", dataProviderClass = DataProviders.class)
	public void test_BasicDataDDT(Map<String, String> data) throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(rb.getString("email"));
		lp.setPassword(rb.getString("password"));
		lp.cickLogin();
		HomePage hp = new HomePage(driver);
		hp.clickOrganisation();
		hp.clickAddOrganisation();
		AddOrganizationPage aop = new AddOrganizationPage(driver);
		aop.setOrganizationName(data.get("organisation"));
		aop.setGSTnumber(data.get("GSTNumber"));
		aop.setBasicDataEmail(data.get("email"));
		aop.setOrganizationCode(data.get("organizationCode"));
		aop.setPANNumber(data.get("panNumber"));
		aop.setTANNumber(data.get("tanNumber"));
		aop.setCA_Address(data.get("CAAddress"));
		aop.setCA_Landmark(data.get("CALandmark"));
		aop.setCA_City(data.get("CACity"));
		aop.setCA_PostalCode(data.get("CAPostalCode"));
		aop.setCA_State(data.get("CAState"));
		aop.setCA_Country(data.get("CACountry"));
		//aop.clickRegSameCom_address();
		aop.setRA_Address(data.get("RAAddress"));
		aop.setRA_Landmark(data.get("RALandmark"));
		aop.setRA_City(data.get("RACity"));
		aop.setRA_PostalCode(data.get("RAPostalCode"));
		aop.setRA_State(data.get("RAState"));
		Thread.sleep(5000);
		aop.setRA_Country(data.get("RACountry")); 
		aop.clickBS_Save_Next();
		aop.setCP_Firstname(data.get("firstName"));
		aop.setCP_Milddlename(data.get("middleName"));



	}
}
