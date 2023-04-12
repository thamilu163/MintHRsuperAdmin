package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.DashBoardPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class ValidatePagesVisibleTest extends BaseClass{
@Test
	public void validateDashboardPage() {
	logger.info("***Starting vlidation of dashboard***");
	HomePage hp=new HomePage(driver);
	hp.clickDashboard();
		DashBoardPage dbp=new DashBoardPage(driver	);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(dbp.isTotalOrganizationDisplayed(), true);
		sa.assertEquals(dbp.isTotalUsersDisplayed(), true);
		sa.assertEquals(dbp.isTotalLeavesDisplayed(), true);
		sa.assertEquals(dbp.isTotalAttendanceDisplayed(), true);
		logger.info("***validated attendance***");
		sa.assertEquals(dbp.isTotalHolidaysDisplayed(), true);
		logger.info("will check data");
		sa.assertEquals(dbp.isAllDataDisplayed(), false);
		sa.assertAll();
		logger.info(" ***Validation of Dashboard completed***");
	}

}
