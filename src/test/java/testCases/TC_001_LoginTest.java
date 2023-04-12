package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;


public class TC_001_LoginTest extends BaseClass {
	// Login with valid credential for super admin
	@Test()
	public void  test_Login() {
		logger.info("**Starting Login test **");
		try {
	LoginPage lp=new LoginPage(driver);
	lp.setUsername(rb.getString("email"));
	lp.setPassword(rb.getString("password"));
	logger.info("**Clicking Login button**");
	lp.cickLogin();
	HomePage hp=new HomePage(driver);
	Assert.assertEquals(hp.isDashboardExists(), true);
	logger.info("**validated login**");
		}
		catch(Exception e) {
		Assert.fail();	
		}
	logger.info("***Finished Login***");
	}
}
