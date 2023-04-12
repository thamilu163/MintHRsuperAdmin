package testCases;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.LogoutDDTpage;
import testBase.BaseClass;

import utilities.DataProviders;

public class LoginDataDrivenTest extends BaseClass {
	@Test (dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void test_LoginDDT(Map<String, String> data) {
	logger.info(" Starting TC_003_LoginDataDrivenTest ");
		try {
		LoginPage lg=new LoginPage(driver);
		lg.setUsername(data.get("username"));
		lg.setPassword(data.get("password"));
		lg.cickLogin();
		
		HomePage hp=new HomePage(driver);
		boolean targetpage=hp.isDashboardExists();
		LogoutDDTpage lddt=new LogoutDDTpage(driver);
		if(data.get("result").equals("Superadmin"	)) {
			if(targetpage==true) {
				hp.clickicoMyAccount();
				hp.clicklinkLogout();
				hp.clickbtnYESpopup();
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
				lg.clearUsername();
				lg.clearPassword();
				}
		}
		if(data.get("result").equals("Admin"	)) {
			if(targetpage==true) {
				lddt.adminLogout();
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
				lg.clearUsername();
				lg.clearPassword();
				}
		}
		if(data.get("result").equals("Employee"	)) {
			if(targetpage==true) {
				lddt.employeeLogout();
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
				lg.clearUsername();
				lg.clearPassword();
				}
		}
		if(data.get("result").equals("HR"	)) {
			if(targetpage==true) {
				lddt.hrLogout();
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
				lg.clearUsername();
				lg.clearPassword();
				}
		}
		if(data.get("result").equals("invalid"	)) {
			if(targetpage==true) {
				hp.clickicoMyAccount();
				hp.clicklinkLogout();
				hp.clickbtnYESpopup();
				Assert.assertTrue(false);
			}else {
				Assert.assertTrue(true);
				lg.clearUsername();
				lg.clearPassword();
					}
		}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info(" Finished TC_003_LoginDataDrivenTest");  
	}

}
