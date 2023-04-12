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

public class AddOrganizationPage extends BasePage {

	public AddOrganizationPage(WebDriver driver) {
		super(driver);
	}

	WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	JavascriptExecutor js = (JavascriptExecutor) driver;

	// WebElements
	// Basic data

	@FindBy(id = "company")
	private WebElement txtOrganizationName;
	@FindBy(id = "gst_number")
	WebElement txtGSTnumber;
	private @FindBy(id = "bd-email")
	WebElement txtBasicDataEmail;
	@FindBy(id = "company_code")
	private WebElement txtOrganizationCode;
	@FindBy(id = "bd-pan-number")
	private WebElement txtPANnumber;
	@FindBy(id = "bd-tan-number")
	private WebElement txtTANnumber;

	// Communication address
	@FindBy(xpath = "//div[@class='tab-pane active fade show']//div[5]//input[1]")
	private WebElement txtCA_Address;
	@FindBy(xpath = "//div[@class='tab-pane active fade show']//div[6]//input[1]")
	private WebElement txtCA_Landmark;
	@FindBy(xpath = "//div[@class='tab-pane active fade show']//div[7]//div[1]//div[1]//input[1]")
	private WebElement txtCA_City;
	@FindBy(xpath = "//div[7]//div[2]//div[1]//input[1]")
	private WebElement txtCA_PostalCode;
	@FindBy(xpath = "//div[8]//div[1]//div[1]//input[1]")
	private WebElement txtCA_State;
	@FindBy(xpath = "//div[8]//div[2]//div[1]//select[1]")
	private WebElement seleCA_Country;
	@FindBy(xpath = "//input[@type='checkbox'][@class='jss4']")
	private WebElement chekRegSameCom_address;

	// Registered address
	@FindBy(xpath = "//div[10]//input[1]")
	private WebElement txtRA_Address;
	@FindBy(xpath = "//div[11]//input[1]")
	private WebElement txtRA_Landmark;
	@FindBy(xpath = "//div[12]//div[1]//div[1]//input[1]")
	private WebElement txtRA_City;
	@FindBy(xpath = "//div[12]//div[2]//input[1]")
	private WebElement txtRA_PostalCode;
	@FindBy(xpath = "//div[13]//div[1]//input[1]")
	private WebElement txtRA_State;
	@FindBy(xpath = "//div[13]/div[2]//div[1]/select[1]")
	private WebElement seleRA_Country;
	@FindBy(xpath = "//button[@type='submit'][normalize-space()='Save & Next']")
	private WebElement btnBS_Save_Next;
	// Contact person
	// @FindBy(xpath="//li[@data-tip='Contact Person']")
	// WebElement btnContactPerson;
	@FindBy(xpath = "//div[@class='row form-group my-0']//input[@id='cp_first_name']")
	private WebElement txtCP_Firstname;
	@FindBy(xpath = "//div[@class='row form-group my-0']//input[@id='cp_middle_name']")
	private WebElement txtCP_Middlename;
	@FindBy(xpath = "//div[@class='card-body']/div[@class='row form-group my-0']/div[3]/div[1]/input[1]")
	private WebElement txtCP_Lastname;
	@FindBy(xpath = "//div[@class='tab-pane active fade show']//div[@class='col-12 col-lg-6']//input[@placeholder='Enter email']")
	private WebElement txtCP_Email;
	@FindBy(xpath = "//div[@class='tab-pane active fade show']//div[@class='col-12 col-sm-6 col-lg-6']//input[@placeholder='1 (702) 123-4567']")
	private WebElement txtCP_PhoneNumber;
	// Account manager
	@FindBy(xpath = "//input[@id='am_first_name']")
	private WebElement txtAMFirstname;
	@FindBy(xpath = "//input[@id='am_middle_name']")
	private WebElement txtAMMiddlename;
	@FindBy(xpath = "//form[@action='#']//div[@class='card-body']//div//div[@class='row form-group my-0']//input[@placeholder='Enter last name']")
	private WebElement txtAMLastname;
	@FindBy(xpath = "//input[@placeholder='Enter designation']")
	private WebElement txtAMDesignation;
	@FindBy(xpath = "//div[@class='col-12 col-lg-4']//input[@placeholder='Enter email']")
	private WebElement txtAMEmail;
	@FindBy(xpath = "//div[@class='col-12 col-sm-6 col-lg-4']//input[@placeholder='1 (702) 123-4567']")
	private WebElement txtAMPhoneNumber;
	@FindBy(xpath = "//button[@type='suubmit'][contains(@class,'btn-primary')]")
	private WebElement btnCP_Save_Next;
	@FindBy(xpath = "//button[@class='mr-2 mt-3 btn']")
	private WebElement btnCP_Privious;

	// Billing details
	@FindBy(id = "bank_name")
	private WebElement txtBD_Bankname;
	@FindBy(id = "ifsc_code")
	private WebElement txtBD_IFSCcode;
	@FindBy(id = "account_number")
	private WebElement txtBD_AccountNumber;
	@FindBy(id = "plan_validity")
	private WebElement txtBD_PlanValidity;
	@FindBy(id = "number_of_users")
	private WebElement txtBD_Numb_User;

	// Billing contact person;
	@FindBy(xpath = "//div[@class='row form-group my-0 mt-2']//input[@id='cp_first_name']")
	private WebElement txtBCP_Firstname;
	@FindBy(xpath = "//div[@class='row form-group my-0 mt-2']//input[@id='cp_middle_name']")
	private WebElement txtBCP_Middlename;
	@FindBy(xpath = "//div[@class='row form-group my-0 mt-2']//input[@placeholder='Enter last name']")
	private WebElement txtBCP_Lastname;
	@FindBy(xpath = "//div[@class='tab-pane active fade show']//input[@placeholder='Enter email']")
	private WebElement txtBCP_EmailAddress;
	@FindBy(xpath = "//input[@value='+91']")
	private WebElement txtBCP_PhoneNumber;
	@FindBy(xpath = "//div[@class='tab-pane active fade show']//input[@id='street']")
	private WebElement txtBA_Address;
	@FindBy(xpath = "//div[@class='tab-pane active fade show']//input[@id='landmark']")
	private WebElement txtBA_Landmark;
	@FindBy(xpath = "//div[@class='tab-pane active fade show']//input[@id='city']")
	private WebElement txtBA_City;
	@FindBy(xpath = "//div[@class='tab-pane active fade show']//input[@id='postal-code']")
	private WebElement txtBA_PostalCode;
	@FindBy(xpath = "//div[@class='tab-pane active fade show']//input[@id='state']")
	private WebElement txtBA_State;
	@FindBy(xpath = "//div[@class='tab-pane active fade show']//select[@id='country']")
	private WebElement seleBA_Country;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	private WebElement btnDB_Save;
	@FindBy(xpath = "//button[@class='mr-2 mt-3 btn btn-primary']")
	private WebElement btnBD_Privious;

	// Methods
	// Basic data
	public void setOrganizationName(String name) {
		txtOrganizationName.sendKeys(name);
		txtOrganizationName.submit();
	}

	public void setGSTnumber(String gst) {
		txtGSTnumber.sendKeys(gst);
		txtGSTnumber.submit();
	}

	public void setBasicDataEmail(String email) {
		txtBasicDataEmail.sendKeys(email);
		txtBasicDataEmail.submit();
	}

	public void setOrganizationCode(String code) {
		txtOrganizationCode.sendKeys(code);
		txtOrganizationCode.submit();
	}

	public void setPANNumber(String pan) {
		txtPANnumber.sendKeys(pan);
		txtPANnumber.submit();
	}

	public void setTANNumber(String tan) {
		txtTANnumber.sendKeys(tan);
		txtTANnumber.submit();
	}

	// Communication address

	public void setCA_Address(String address) {
		txtCA_Address.sendKeys(address);
		txtCA_Address.submit();
	}

	public void setCA_Landmark(String landmark) {
		txtCA_Landmark.sendKeys(landmark);
		txtCA_Landmark.submit();
	}

	public void setCA_City(String city) {
		txtCA_City.sendKeys(city);
		txtCA_City.submit();
	}

	public void setCA_PostalCode(String PinCode) {
		txtCA_PostalCode.sendKeys(PinCode);
		txtCA_PostalCode.submit();
	}

	public void setCA_State(String state) {
		txtCA_State.sendKeys(state);
		txtCA_State.submit();
	}

	public void setCA_Country(String country) {
		Select dropCountry = new Select(seleCA_Country);
		dropCountry.selectByVisibleText(country);
		seleCA_Country.submit();
	}

	public void clickRegSameCom_address() {
		chekRegSameCom_address.click();
	}

	// Registered address
	public void setRA_Address(String address) {
		txtRA_Address.sendKeys(address);
		txtRA_Address.submit();
	}

	public void setRA_Landmark(String landmark) {
		txtRA_Landmark.sendKeys(landmark);
		txtRA_Landmark.submit();
	}

	public void setRA_City(String city) {
		txtRA_City.sendKeys(city);
		txtRA_City.submit();
	}

	public void setRA_PostalCode(String code) {
		txtRA_PostalCode.sendKeys(code);
		txtRA_PostalCode.submit();
	}

	public void setRA_State(String state) {
		txtRA_State.sendKeys(state);
		txtRA_State.submit();
	}

	public void setRA_Country(String country) {
		Select drpCtry = new Select(seleRA_Country);
		drpCtry.selectByVisibleText(country);
		seleRA_Country.submit();
	}

	public void clickBS_Save_Next() {
		js.executeScript("arguments[0].click();", btnBS_Save_Next);
	}

	/*
	 * public boolean isDisplayedContactPerson() { try{ return
	 * btnContactPerson.isDisplayed(); }catch(Exception e){ return false; } }
	 */

	public boolean isDisplayedCP_Firstname() {
		try {
			WebElement firstName = mywait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//div[@class='row form-group my-0']//input[@id='cp_first_name']")));
			return firstName.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void setCP_Firstname(String name) {
		txtCP_Firstname.sendKeys(name);
		txtCP_Firstname.submit();
	}

	public void setCP_Milddlename(String middle) {
		txtCP_Middlename.sendKeys(middle);
		txtCP_Middlename.submit();
	}

	public void setCP_Lastname(String last) {
		txtCP_Lastname.sendKeys(last);
		txtCP_Lastname.submit();
	}

	public void setCP_Email(String email) {
		txtCP_Email.sendKeys(email);
		txtCP_Email.submit();
	}

	public void setCP_PhoneNumber(String phNumber) {
		txtCP_PhoneNumber.sendKeys(phNumber);
		txtCP_PhoneNumber.submit();
	}

	// Account manager
	public void setAMFirstname(String fname) {
		txtAMFirstname.sendKeys(fname);
		txtAMFirstname.submit();
	}

	public void setAMMiddlename(String mname) {
		WebElement middlename = mywait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='am_middle_name']")));
		middlename.sendKeys(mname);
		txtAMMiddlename.submit();
	}

	public void setAMLastname(String lname) {
		txtAMLastname.sendKeys(lname);
		txtAMLastname.submit();
	}

	public void setAMDesigmation(String dgnation) {
		txtAMDesignation.sendKeys(dgnation);
		txtAMDesignation.submit();
	}

	public void setAMdEmail(String email) {
		txtAMEmail.sendKeys(email);
		txtAMEmail.submit();
	}

	public void setAMPhoneNumber(String number) {
		txtAMPhoneNumber.sendKeys(number);
		txtAMPhoneNumber.submit();
	}

	public void clickCP_Save_Next() {
		js.executeScript("arguments[0].click();", btnCP_Save_Next);

	}

	public void clickCP_Privious() {
		js.executeScript("arguments[0].click();", btnCP_Privious);
	}

	// Billing details
	public boolean isDisplayedBD_Bankname() {
		WebElement bankname = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bank_name")));
		return bankname.isDisplayed();
	}

	public void setBD_Bankname(String bankname) {
		txtBD_Bankname.sendKeys(bankname);
		txtBD_Bankname.submit();
	}

	public void setBD_IFSCcode(String ifsc) {
		txtBD_IFSCcode.sendKeys(ifsc);
		txtBD_IFSCcode.submit();
	}

	public void setBD_AccountNumber(String accountnumber) {
		txtBD_AccountNumber.sendKeys(accountnumber);
		txtBD_AccountNumber.submit();
	}

	public void setBD_PlanValidity(String planvalidty) {
		txtBD_PlanValidity.sendKeys(planvalidty);
		txtBD_PlanValidity.submit();
	}

	public void setBD_Numb_User(String numUser) {
		txtBD_Numb_User.sendKeys(numUser);
		txtBD_Numb_User.submit();
	}

	// Billing contact person detail
	public void setBCP_Firstname(String fname) {
		txtBCP_Firstname.sendKeys(fname);
		txtBCP_Firstname.submit();
	}

	public void setBCP_Middlename(String mname) {
		txtBCP_Middlename.sendKeys(mname);
		txtBCP_Middlename.submit();
	}

	public void setBCP_Lastname(String lname) {
		txtBCP_Lastname.sendKeys(lname);
		txtBCP_Lastname.submit();
	}

	public void setBCP_EmailAddress(String email) {
		txtBCP_EmailAddress.sendKeys(email);
		txtBCP_EmailAddress.submit();
	}

	public void setBCP_PhoneNumber(String phonenumber) {
		txtBCP_PhoneNumber.sendKeys(phonenumber);
		// txtBCP_PhoneNumber.submit();
	}

	public void setBA_Address(String address) {
		txtBA_Address.sendKeys(address);
		txtBA_Address.submit();
	}

	public void setBA_Landmark(String landmark) {
		txtBA_Landmark.sendKeys(landmark);
		txtBA_Landmark.submit();
	}

	public void setBA_City(String city) {
		txtBA_City.sendKeys(city);
		txtBA_City.submit();
	}

	public void setBA_PostalCode(String pcode) {
		txtBA_PostalCode.sendKeys(pcode);
		txtBA_PostalCode.submit();
	}

	public void setBA_State(String state) {
		txtBA_State.sendKeys(state);
		txtBA_State.submit();
	}

	public void setBA_Country(String country) {
		Select cntry = new Select(seleBA_Country);
		cntry.selectByVisibleText(country);
		seleBA_Country.submit();
	}

	public void clickDB_Save() {
		js.executeScript("arguments[0].click()", btnDB_Save);

	}

	public void clickBD_Privious() {
		js.executeScript("arguments[0].click()", btnBD_Privious);
	}
}
