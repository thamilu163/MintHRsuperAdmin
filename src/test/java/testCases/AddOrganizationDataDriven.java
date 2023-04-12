package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddOrganizationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class AddOrganizationDataDriven extends BaseClass {
    @Test
    public void test_BasicDataDDT() {
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

}
