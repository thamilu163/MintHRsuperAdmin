package testCases;


import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ViewOrganizationsPage;
import testBase.BaseClass;

public class ViewOrganizationTest extends BaseClass {
	@Test
public void test_ViewOrganisationTable() throws InterruptedException {
	HomePage hp= new HomePage(driver);
	hp.clickOrganisation();
	hp.clickViewOrganisation();
	ViewOrganizationsPage vop=new ViewOrganizationsPage(driver);
	vop.setTxtSearchByOrgname("CASNU");
	vop.clickActions(); // Explicit wait needed
	//System.out.println(vop.getAttributeValue());

	Thread.sleep(5000);
}
}
