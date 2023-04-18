package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ViewOrganizationsPage extends BasePage {

	public ViewOrganizationsPage(WebDriver driver) {
		super(driver);

	}
	WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	// WebElements
	@FindBy(xpath = "//h3[normalize-space()='View Organization']")
	private WebElement titleViewOrganisation;
	@FindBy(xpath = "(//input[@placeholder='Search records...'])[1]")
	private WebElement txtSearchByOrgname;
	@FindBy(xpath = "//a[@data-tip='View Organization']//*[name()='svg']")
	private WebElement btnActions;
	@FindBy(xpath = "//button[normalize-space()='Create Admin User']")
	private WebElement btnCreateAdminUser;
	@FindBy(xpath = "//button[normalize-space()='Edit']")
	private WebElement btnEdit;
	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	private WebElement dataOrgName;


	// methods
	public String organizationName(){
		return dataOrgName.getText();
	}
	/*public int getAttributeValue() {
		String text = "abc(" + txtSearch.getAttribute("placeholder");
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf("records") - 1));
		return total_pages;
}*/

	public void setTxtSearchByOrgname(String orgname) {
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//th[1]//div[1]//input[1]"))).sendKeys(orgname);
		//txtSearchByOrgname.sendKeys(orgname);
		//js.executeScript("arguments[0].value='orgname';",txtSearchByOrgname);
	}

	public void clickActions() {
		//btnActions.click();
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-tip='View Organization']//*[name()='svg']"))).click();
	}

	public boolean isDisplayedViewOrganisation() {
		try {
			return titleViewOrganisation.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void clickBtnCreateAdminUser() {
		js.executeScript("arguments[0].click();",btnCreateAdminUser);
		//btnCreateAdminUser.click();

	}

	public void clickBtnEdit() {
		btnEdit.click();
	}
}
