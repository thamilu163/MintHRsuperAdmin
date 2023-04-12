package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutDDTpage extends BasePage{

	public LogoutDDTpage(WebDriver driver) {
		super(driver);
	}
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//WebElement Login page
	//Employee
	@FindBy(xpath="//a[@aria-label='Dropdown toggle']//div[@class='c-avatar']//*[name()='svg']")
	WebElement icnEmpMyAccount;
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement linkEmpLogout;
	@FindBy(xpath="//button[normalize-space()='Yes']")
	WebElement btnEmpYES;
	public void employeeLogout() {
		icnEmpMyAccount.click();
		linkEmpLogout.click();
		btnEmpYES.click();
	}
	//admin
	@FindBy(xpath="//a[@aria-label='Dropdown toggle']//div[@class='c-avatar']//*[name()='svg']")
	WebElement incAdmMyAccount;
	@FindBy(xpath="//div[@role='menu']//a[4]")
	WebElement linkAdmLogout;
	@FindBy(xpath="//button[normalize-space()='Yes']")
	WebElement btnAdmYES;
	public void adminLogout() {
		incAdmMyAccount.click();
		linkAdmLogout.click();
		btnAdmYES.click();
	}
	//HR
	@FindBy(xpath="//a[@aria-label='Dropdown toggle']//div[@class='c-avatar']//*[name()='svg']")
	WebElement incHrMyAccount;
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement linkHrLogout;
	@FindBy(xpath="//button[normalize-space()='Yes']")
	WebElement btnHrYES;
	public void hrLogout() {
		incHrMyAccount.click();
		linkHrLogout.click();
		js.executeScript("arguments[0].click();",btnHrYES);
	}

}
