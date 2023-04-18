package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddEmployeePage;
import pageObjects.HomePage;
import pageObjects.ViewOrganizationsPage;
import testBase.BaseClass;

public class AddEmployeeTest extends BaseClass {
    @Test(priority = 1)
    public void testBasicData() throws InterruptedException {
        HomePage hp=new HomePage(driver);
        hp.clickOrganisation();
        hp.clickViewOrganisation();

       ViewOrganizationsPage vop=new ViewOrganizationsPage(driver);
        try{
            vop.setTxtSearchByOrgname("rivarate");
        vop.clickActions();
        vop.clickBtnCreateAdminUser();
        AddEmployeePage aep=new AddEmployeePage(driver);
        aep.setTxtFirstName(randomeString());
        aep.setTxtMiddleName(randomeString());
        aep.setTxtLastName(randomeString());
        aep.setTxtDateOfBirth("30/03/1996");
        aep.setSelectGender("Male");
        aep.setSelectEmployeeStatus("Admin");
        aep.setTxtEmpCode("ADG123");
        aep.setTxtOfficeEmail(randomAlphaNumeric()+"@gmail.com");
        aep.setTxtDateOfJoining("17/04/2023");
        //Current Address
        aep.setTxtCA_FlatNumber(randomeNumber());
        aep.setTxtCA_BuildingName(randomeString());
        aep.setTxtCA_Address(randomeString());
        aep.setTxtCA_Landmark(randomeString());
        aep.setTxtCA_City("Dakshina Kannada");
        aep.setTxtCA_PostalCode("574212");
        aep.setTxtCA_State("Karnataka");
        aep.setSelectCA_Country("India");
        //click on check button
       // aep.clickCheckbx_PAAddSame();
        //Permanent address
        aep.setTxtPM_FlatNumber("123654");
        aep.setTxtPA_Buid$name(randomeString());
       aep.setTxtPA_Address(randomeString());
        aep.setTxtPA_LandMark(randomeString());
        aep.setTxtPA_City(randomeString());
        aep.setTxtPA_PostalCode("574212");
        aep.setTxtPA_State("Karnataka");
        aep.setSelectPA_Country("India");
        aep.clickBtnBD_Save$Next();
       // aep.clickLinkCtCommunicationTab();
      //  Thread.sleep(5000);
       Assert.assertTrue(aep.isDisplayPersonalEmail());}
        catch (Exception e){
           Assert.fail();
        }
    }
    @Test(priority = 2)
    public void testCommunication(){
        AddEmployeePage aep1=new AddEmployeePage(driver);
        aep1.setTxtCtPhoneNumber("9741265895");
        aep1.setTxtCtOtherPhoneNumber("9902969621");
        aep1.setTxtCtPersonalEmail("qwer2424@gmail.com");
       // aep1.clickBtnCtPrevious();
        aep1.clickBtnCtSave_Next();

    }
    @Test(priority = 3)
public void testIdentity(){
    AddEmployeePage aep2=new AddEmployeePage(driver);
    aep2.setTxtItAadhaar("256314893654");
    //aep2.setInputItFileAadhaar();
    aep2.setTxtItPanNumber("GBGPS4562R");
   //aep2.setInputItFilePan();
    aep2.setTxtItDrivingLicence("KA21 20200002986");
   // aep2.setInputItFileDrivingLicence();
    aep2.setTxtItPfNumber("");
    aep2.setTxtItVehicleNumber("KA21V 3795");
    //aep2.setTxtItPassportNumber();
   // aep2.setInputItVaccinationCertificate();
    //aep2.setInputItFileIDCard();
    //aep2.clickBtnItPrevious();
    aep2.clickBtnItSave_Next();
}

}
