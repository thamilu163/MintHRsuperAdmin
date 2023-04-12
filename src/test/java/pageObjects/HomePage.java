package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	JavascriptExecutor js = (JavascriptExecutor) driver;
	// WebElements
	@FindBy(xpath = "//a[normalize-space()='Dashboard']")
	private WebElement btnDashboard;
	@FindBy(xpath = "//a[normalize-space()='Organizations']")
	private WebElement btnOrganisation;
	@FindBy(xpath = "//a[normalize-space()='Add Organization']")
	private WebElement btnAddOrganisation;
	@FindBy(xpath = "//a[normalize-space()='View Organizations']")
	private WebElement btnViewOrganisation;
	@FindBy(xpath="//div[@class='c-avatar']//*[name()='svg']")
	private WebElement icoMyAccount;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement linkLogout;
	
	@FindBy(xpath="//div[@class='modal-footer']//button[normalize-space()='Yes']")
	private WebElement btnYESpopup;
	

	// Methods
	public void clickDashboard() {
		btnDashboard.click();
	}
	public boolean isDashboardExists() {
		try {
			return btnDashboard.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void clickOrganisation() {
		btnOrganisation.click();
	}

	public void clickAddOrganisation() {
		btnAddOrganisation.click();
	}

	public void clickViewOrganisation() {
		btnViewOrganisation.click();
	}
	public void clickicoMyAccount() {
		icoMyAccount.click();
	}
	public void clicklinkLogout() {
		linkLogout.click();
	}
	public void clickbtnYESpopup() {
		js.executeScript("arguments[0].click();", btnYESpopup);
		}
	/*public void superAdminLogout() {
		icoMyAccount.click();
		
          linkLogout.click();
		
		js.executeScript("arguments[0].click();", btnYESpopup);
	}*/
}
