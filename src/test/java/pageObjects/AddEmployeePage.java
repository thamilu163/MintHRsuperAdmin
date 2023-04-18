package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddEmployeePage extends BasePage {
    public AddEmployeePage(WebDriver driver) {
        super(driver);
    }
    JavascriptExecutor js =(JavascriptExecutor) driver;
    WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));
    //WebElements
    @FindBy(id="first_name")
    private WebElement txtFirstName;
    @FindBy(id = "middle_name")
    private WebElement txtMiddleName;
    @FindBy(id = "last_name")
    private WebElement txtLastName;
    @FindBy(xpath = "//div[@class='col-12 col-lg-6']//input[@id='date-input']")
    private WebElement txtDateOfBirth;
    @FindBy(xpath = "//div[@class='row form-group mt-2']//div//select[@id='select']")
    private WebElement selectGender;
    @FindBy(xpath = "//div[@class='row form-group']//select[@id='select']")
    private WebElement selectEmployeeStatus;
    @FindBy(id="employee-code")
    private WebElement txtEmpCode;
    @FindBy(id = "office-email")
    private WebElement txtOfficeEmail;
    @FindBy(id = "date_of_joining")
    private WebElement txtDateOfJoining;

    // Current address
    @FindBy(xpath = "//div[@class='tab-pane active fade show']//div[5]//div[1]//div[1]//input[1]")
   private WebElement txtCA_FlatNumber;
    @FindBy(xpath = "//div[2]//main[1]//div[2]//div[1]/div[1]/div[1]/form[1]//div[5]/div[2]//input[1]")
    private WebElement txtCA_BuildingName;
    @FindBy(xpath = "(//input[@id=\"street\"])[1]")
    private WebElement txtCA_Address;
    @FindBy(xpath = "(//input[@placeholder='Enter landmark'])[1]")
    private WebElement txtCA_Landmark;
    @FindBy(xpath = "(//input[@placeholder='Enter city name'])[1]")
    private WebElement txtCA_City;
    @FindBy(xpath = "(//input[@placeholder='Postal Code'])[1]")
    private WebElement txtCA_PostalCode;
    @FindBy(xpath = "(//input[@id='state'])[1]")
    private WebElement txtCA_State;
    @FindBy(xpath = "(//select[@id='country'])[1]")
    private WebElement selectCA_Country;
    //permanent address
    @FindBy(xpath = "//input[@value='false']")
    private WebElement checkbx_PAAddSame;
    @FindBy(xpath = "(//input[@id='flat_number'])[2]")
    private WebElement txtPA_FlatNumber;
    @FindBy(xpath = "(//input[@placeholder='Building Number'])[2]")
    private WebElement txtPA_Buid$name;
    @FindBy(xpath = "(//input[@placeholder='Enter street name'])[2]")
    private WebElement txtPA_Address;
    @FindBy(xpath = "(//input[@placeholder='Enter landmark'])[2]")
    private WebElement txtPA_LandMark;
    @FindBy(xpath = "(//input[@id='city'])[2]")
    private WebElement txtPA_City;
    @FindBy(xpath = "(//input[@placeholder='Postal Code'])[2]")
    private WebElement txtPA_PostalCode;
    @FindBy(xpath = "(//input[@placeholder='Enter state name'])[2]")
    private WebElement txtPA_State;
    @FindBy(xpath = "(//select[@id='country'])[2]" )
    private WebElement selectPA_Country;
    @FindBy(xpath = "//button[@class='float-right my-3 btn btn-primary']")
    private WebElement btnBD_Save$Next;

    //communication tab
    @FindBy(xpath = "//li[@data-tip='Communication']//a[@class='nav-link']")
    private WebElement linkCtCommunicationTab;
    @FindBy(xpath = "//div[@class='tab-pane active fade show']//div[@class='row form-group']//div[1]//div[1]//input[1]")
    private WebElement txtCtPhoneNumber;
    @FindBy(xpath = "//div[@class='tab-pane active fade show']//div[@class='row form-group']//div[2]//div[1]//input[1]")
    private WebElement txtCtOtherPhoneNumber;
    @FindBy(xpath = "//input[@id='personal-email']")
    private WebElement txtCtPersonalEmail;
    public boolean isDisplayPersonalEmail(){
       try{
           WebElement pEmail=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='personal-email']")));
           return pEmail.isDisplayed();}
       catch (Exception e){
           return false;
       }
    }
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Previous'])[1]")
    private WebElement btnCtPrevious;
    @FindBy(xpath = "(//button[@class='float-right btn btn-primary'][normalize-space()='Save & Next'])[1]")
    private WebElement btnCtSave_Next;

    //Identity tab
    @FindBy(xpath = "//a[normalize-space()='Identity']")
    private WebElement linkItIdentityTab;
    @FindBy(xpath = "//input[@placeholder='Enter Aadhar Number']")
    private WebElement txtItAadhaar;
    @FindBy(xpath = "//div[@class='card-body']//div[@class='card-body']//div[1]//div[2]//div[1]//div[3]//div[1]")
    private WebElement inputItFileAadhaar;
    @FindBy(xpath = "//input[@placeholder='Enter PAN Number']")
    private WebElement txtItPanNumber;
    @FindBy(xpath = "//div[@class='card card-accent-primary']//div[2]//div[2]//div[1]//div[3]//div[1]")
    private WebElement inputItFilePan;
    @FindBy(xpath = "//input[@id='driving-license']")
    private WebElement txtItDrivingLicence;
    @FindBy(xpath = "//div[@class='tab-pane active fade show']//div[3]//div[2]//div[1]//div[3]//div[1]")
    private WebElement inputItFileDrivingLicence;
    @FindBy(xpath = "//input[@id='pf-number']")
    private WebElement txtItPfNumber;
    @FindBy(id = "vehicle-number")
    private WebElement txtItVehicleNumber;
    @FindBy(xpath = "//div[@class='row form-group mt-2']//div[1]//div[1]//div[1]//div[3]//div[1]")
    private WebElement inputItVaccinationCertificate;
    @FindBy(id = "passport-number")
    private WebElement txtItPassportNumber;
    @FindBy(xpath = "//div[6]//div[2]//div[1]//div[1]//div[3]//div[1]")
    private WebElement inputItFileIDCard;
    @FindBy(xpath = "//div[@class='tab-pane active fade show']//button[@type='button'][normalize-space()='Previous']")
    private WebElement btnItPrevious;
    @FindBy(xpath = "//div[@class='tab-pane active fade show']//button[@class='float-right btn btn-primary'][normalize-space()='Save & Next']")
    private WebElement btnItSave_Next;

    //Bank details
    @FindBy(xpath = "//a[normalize-space()='Bank Details']")
    private WebElement linkBDtBankDetailTab;
    @FindBy(id = "bank-name")
    private WebElement txtBDtBankName;
    @FindBy(id="ifsc-code")
    private WebElement txtBDtIfscCode;
    @FindBy(id = "account-number")
    private WebElement txtBDtAccountNumber;
    @FindBy(xpath = "//div[@class='tab-pane active fade show']//button[@type='button'][normalize-space()='Previous']")
    private WebElement btnBDtPrevious;
    @FindBy(xpath = "//div[@class='tab-pane active fade show']//button[@type='submit'][normalize-space()='Save & Next']")
    private WebElement btnBDtSave_Next;

    //Job Details
    @FindBy(xpath = "//a[normalize-space()='Job Details']")
    private WebElement linkJDtJobDetails;
    @FindBy(xpath = "((//div[contains(@class,'css-19bb58m')]//input[@id='react-select-2-input']")
    private WebElement txtJDLevel;
    @FindBy(xpath = "(//div[contains(@class,'css-19bb58m')]//input[@id='react-select-3-input']")
    private WebElement txtJDDesignation;
    @FindBy(xpath = "(//input[@id='react-select-4-input']")
    private WebElement txtJDTeam;
    @FindBy(xpath = "(//input[@id='react-select-5-input']")
    private WebElement txtJDDepartment;
    @FindBy(xpath = "(//input[@id='react-select-6-input']")
    private WebElement txtJDRole;
    @FindBy(xpath = "(//select[@id='select'])[3]")
    private WebElement selectJDManager;
    @FindBy(xpath = "//input[@id='uan_number']")
    private WebElement txtJDUANNumber;
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Previous'])[4]")
    private WebElement btnJDtPrevious;
    @FindBy(xpath = "(//button[@class='float-right btn btn-primary'][normalize-space()='Save & Next'])[4]")
    private WebElement btnJDtSave_Next;

    //Emergency contact
    @FindBy(xpath = "//a[normalize-space()='Emergency Contact']")
    private WebElement linkECEmergencyContact;
    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement txtECtFirstName;
    @FindBy(id = "middle-name")
    private WebElement txtECtMiddleName;
    @FindBy(id = "last-name")
    private WebElement txtECtLastName;
    @FindBy(xpath = "//div[@class='col-12 col-sm-12 col-lg-12']//input[@placeholder='1 (702) 123-4567']")
    private WebElement txtECtMobileNumber;
    @FindBy(id = "email")
    private WebElement txtECtEmail;
    @FindBy(xpath = "(//select[@id='select'])[4]")
    private WebElement selectECtRelationship;
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Previous'])[5]")
    private WebElement btnECtPrevious;
    @FindBy(xpath = "(//button[@class='float-right btn btn-primary'][normalize-space()='Save & Next'])[5]")
    private WebElement btnECtSave_Next;
    //Assets
    @FindBy(xpath = "//a[normalize-space()='Assets']")
    private WebElement linkAAssets;
    @FindBy(xpath = "//h5[normalize-space()='Asset 1']")
    private WebElement linkA_Asset1;
    @FindBy(id = "asset-type")
    private WebElement txtAtAssetType;
    @FindBy(id = "asset-number")
    private WebElement txtAtAssetNumber;
    @FindBy(id="date-issued")
    private WebElement txtAtDateIssued;
    @FindBy(id = "date-returned")
    private WebElement txtAtReturnedDate;
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Previous'])[6]")
    private WebElement btnAtPrevious;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement btnAtSave_Next;
    @FindBy(xpath = "//button[normalize-space()='+ Add Asset']")
    private WebElement btnAtAddAsset;
    @FindBy(xpath = "//div[@class='float-right mr-3 mb-3']//*[name()='svg']")
    private WebElement btnAtDelete;
    //other tab
    @FindBy(xpath = "//a[normalize-space()='Other']")
    private WebElement linkOther;
    @FindBy(xpath = "(//button[@class='float-right btn btn-primary'][normalize-space()='Save'])[1]")
    private WebElement btnOtSave;
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Previous'])[7]")
    private WebElement btnOtPrevious;


    //methods
    //Basic detail
    public void setTxtFirstName(String firstName) {
        txtFirstName.sendKeys(firstName);
    }

    public void setTxtMiddleName(String middleName) {
         txtMiddleName.sendKeys(middleName);
    }

    public void setTxtLastName(String lastName) {
        txtLastName.sendKeys(lastName);
    }

    public void setTxtDateOfBirth(String dateOfBirth) {
       txtDateOfBirth.sendKeys(dateOfBirth);
    }

    public void setSelectGender(String gender) {
        Select gn=new Select(selectGender);
        gn.selectByVisibleText(gender);
    }

    public void setSelectEmployeeStatus(String employeeStatus) {
        Select empsts=new Select(selectEmployeeStatus);
        empsts.selectByVisibleText(employeeStatus);
    }

    public void setTxtEmpCode(String empCode) {
       txtEmpCode.sendKeys(empCode);
    }

    public void setTxtOfficeEmail(String officeEmail) {
       txtOfficeEmail.sendKeys(officeEmail);
    }

    public void setTxtDateOfJoining(String dateOfJoining) {
        txtDateOfJoining.sendKeys(dateOfJoining);
    }

    public void setTxtCA_FlatNumber(String ca_flatNumber) {
       txtCA_FlatNumber.sendKeys(ca_flatNumber);
    }

    public void setTxtCA_BuildingName(String ca_buildingName) {
      txtCA_BuildingName.sendKeys(ca_buildingName);
    }

    public void setTxtCA_Address(String ca_address) {
        txtCA_Address.sendKeys(ca_address);
    }

    public void setTxtCA_Landmark(String ca_landmark) {
        txtCA_Landmark.sendKeys(ca_landmark);
    }

    public void setTxtCA_City(String ca_city) {
        txtCA_City.sendKeys(ca_city);
    }

    public void setTxtCA_PostalCode(String ca_postalCode) {
        txtCA_PostalCode.sendKeys(ca_postalCode);
    }

    public void setTxtCA_State(String ca_state) {
      txtCA_State.sendKeys(ca_state);
    }

    public void setSelectCA_Country(String ca_country) {
      Select cacty=new Select(selectCA_Country);
      cacty.selectByVisibleText(ca_country);
    }

    public void clickCheckbx_PAAddSame() {
        js.executeScript("arguments[0].click();",checkbx_PAAddSame);
      //  checkbx_pmAddSame.click();
    }

    public void setTxtPM_FlatNumber(String pm_flatNumber) {
        txtPA_FlatNumber.sendKeys(pm_flatNumber);
    }

    public void setTxtPA_Buid$name(String pa_buid$name) {
       txtPA_Buid$name.sendKeys(pa_buid$name);
       //txtPA_Buid$name.submit();
    }

    public void setTxtPA_Address(String pa_address) {
       txtPA_Address.sendKeys(pa_address);
    }

    public void setTxtPA_LandMark(String pa_landMark) {
        txtPA_LandMark.sendKeys(pa_landMark);
    }

    public void setTxtPA_City(String pa_city) {
        txtPA_City.sendKeys(pa_city);
    }

    public void setTxtPA_PostalCode(String pa_postalCode) {
        txtPA_PostalCode.sendKeys(pa_postalCode);
        txtPA_PostalCode.submit();
    }

    public void setTxtPA_State(String pa_state) {
        txtPA_State.sendKeys(pa_state);
    }

    public void setSelectPA_Country(String pa_country) {
        Select paconty=new Select(selectPA_Country);
        paconty.selectByVisibleText(pa_country);
    }

    public void clickBtnBD_Save$Next() {
        js.executeScript("arguments[0].click();",btnBD_Save$Next);
    	//mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='float-right my-3 btn btn-primary']"))).click();
        //btnBD_Save$Next.click();
    }

    //Communication tab


    public void clickLinkCtCommunicationTab() {
    	js.executeScript("arguments[0].click();",linkCtCommunicationTab);
       // linkCtCommunicationTab.click();
    }

    public void setTxtCtPhoneNumber(String phoneNumber) {
       txtCtPhoneNumber.sendKeys(phoneNumber);
    }

    public void setTxtCtOtherPhoneNumber(String otherPhoneNumber) {
        txtCtOtherPhoneNumber.sendKeys(otherPhoneNumber);
    }

    public void setTxtCtPersonalEmail(String email) {
        txtCtPersonalEmail.sendKeys(email);
    }

    public void clickBtnCtPrevious( ) {
       btnCtPrevious.click();
    }

    public void clickBtnCtSave_Next() {
        btnCtSave_Next.click();
    }

    public void clickLinkItIdentityTab() {
       linkItIdentityTab.click();
    }

    public void setTxtItAadhaar(String aadhaar) {
        txtItAadhaar.sendKeys(aadhaar);
    }

    public void setInputItFileAadhaar(String fileAadhaar) {
        inputItFileAadhaar.sendKeys(fileAadhaar);
    }

    public void setTxtItPanNumber(String panNumber) {
        txtItPanNumber.sendKeys(panNumber);
    }

    public void setInputItFilePan(String filePan) {
        inputItFilePan.sendKeys(filePan);
    }

    public void setTxtItDrivingLicence(String drivingLicence) {
        txtItDrivingLicence.sendKeys(drivingLicence);
    }

    public void setInputItFileDrivingLicence(String fileDrivingLicence) {
        inputItFileDrivingLicence.sendKeys(fileDrivingLicence);
    }

    public void setTxtItPfNumber(String pfNumber) {
        txtItPfNumber.sendKeys(pfNumber);
    }

    public void setTxtItVehicleNumber(String vehicleNumber) {
       txtItVehicleNumber.sendKeys(vehicleNumber);
    }

    public void setInputItVaccinationCertificate(String vaccinationCertificate) {
        inputItVaccinationCertificate.sendKeys(vaccinationCertificate);
    }

    public void setTxtItPassportNumber(String passportNumber) {
       txtItPassportNumber.sendKeys(passportNumber);
    }

    public void setInputItFileIDCard(String fileIDCard) {
        inputItFileIDCard.sendKeys(fileIDCard);
    }

    public void clickBtnItPrevious() {
        btnItPrevious.click();
    }

    public void clickBtnItSave_Next() {
        btnItSave_Next.click();
    }

    public void clickLinkBDtBankDetailTab() {
        linkBDtBankDetailTab.click();
    }

    public void setTxtBDtBankName(String bankName) {
        txtBDtBankName.sendKeys(bankName);
    }

    public void setTxtBDtIfscCode(String ifscCode) {
        txtBDtIfscCode.sendKeys(ifscCode);
    }

    public void setTxtBDtAccountNumber(String accountNumber) {
        txtBDtAccountNumber.sendKeys(accountNumber);
    }

    public void clickBtnBDtPrevious() {
        btnBDtPrevious.click();
    }

    public void clickBtnBDtSave_Next() {
        btnBDtSave_Next.click();
    }

    public void clickLinkJDtJobDetails() {
       linkJDtJobDetails.click();
    }

    public void setTxtJDLevel(String level) {
       txtJDLevel.sendKeys(level);
    }

    public void setTxtJDDesignation(String jdDesignation) {
        txtJDDesignation.sendKeys(jdDesignation);
    }

    public void setTxtJDTeam(String jdTeam) {
        txtJDTeam.sendKeys(jdTeam);
    }

    public void setTxtJDDepartment(String jdDepartment) {
        txtJDDepartment.sendKeys(jdDepartment);
    }

    public void setTxtJDRole(String jdRole) {
        txtJDRole.sendKeys(jdRole);
    }

    public void setSelectJDManager(String jdManager) {
        selectJDManager.sendKeys(jdManager);
    }

    public void setTxtJDUANNumber(String jduanNumber) {
        txtJDUANNumber.sendKeys(jduanNumber);
    }

    public void clickBtnJDtPrevious() {
        btnJDtPrevious.click();
    }

    public void clickBtnJDtSave_Next() {
        btnJDtSave_Next.click();
    }

    public void clickLinkECEmergencyContact() {
        linkECEmergencyContact.click();
    }

    public void setTxtECtFirstName(String firstName) {
        txtECtFirstName.sendKeys(firstName);
    }

    public void setTxtECtMiddleName(String middleName) {
        txtECtMiddleName.sendKeys(middleName);
    }

    public void setTxtECtLastName(String lastName) {
        txtECtLastName.sendKeys(lastName);
    }

    public void setTxtECtMobileNumber(String mobileNumber) {
        txtECtMobileNumber.sendKeys(mobileNumber);
    }

    public void setTxtECtEmail(String email) {
        txtECtEmail.sendKeys(email);
    }

    public void setSelectECtRelationship(String relationship) {
        selectECtRelationship.sendKeys(relationship);
    }

    public void clickBtnECtPrevious() {
        btnECtPrevious.click();
    }

    public void clickBtnECtSave_Next() {
        btnECtSave_Next.click();
    }

    public void clickLinkAAssets() {
        linkAAssets.click();
    }

    public void clickLinkA_Asset1() {
        linkA_Asset1.click();
    }

    public void setTxtAtAssetType(String atAssetType) {
        txtAtAssetType.sendKeys(atAssetType);
    }

    public void setTxtAtAssetNumber(String atAssetNumber) {
        txtAtAssetNumber.sendKeys(atAssetNumber);
    }

    public void setTxtAtDateIssued(String atDateIssued) {
       txtAtDateIssued.sendKeys(atDateIssued);
    }

    public void setTxtAtReturnedDate(String atReturnedDate) {
        txtAtReturnedDate.sendKeys();
    }

    public void clickBtnAtPrevious() {
        btnAtPrevious.click();
    }

    public void clickBtnAtSave_Next() {
        btnAtSave_Next.click();
    }

    public void clickBtnAtAddAsset() {
       btnAtAddAsset.click();
    }

    public void clickBtnAtDelete() {
        btnAtDelete.click();
    }

    public void clickLinkOther() {
        linkOther.click();
    }

    public void clickBtnOtSave() {
        btnOtSave.click();
    }

    public void clickBtnOtPrevious() {
        btnOtPrevious.click();
    }
}

