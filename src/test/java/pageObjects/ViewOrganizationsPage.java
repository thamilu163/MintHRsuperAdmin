package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewOrganizationsPage extends BasePage {

	public ViewOrganizationsPage(WebDriver driver) {
		super(driver);
		
	}

	// WebElements
	@FindBy(xpath="//h3[normalize-space()='View Organization']")
	WebElement titleViewOrganisation;
	@FindBy(xpath="//input[@id='filter-input-focus']")
	WebElement txtSearch;
	@FindBy(xpath="//a[@data-tip='View Organization']//*[name()='svg']")
	WebElement btnActions;
	
	
	//methods
	public int getAttributeValue() {
		String text="abc("+ txtSearch.getAttribute("placeholder");
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("records")-1));
		return total_pages;
		
	}
	public void setSearch(String orgname) {
		txtSearch.sendKeys(orgname);
	}
	public void clickActions() {
		btnActions.click();
	}
	public boolean isDisplayedViewOrganisation() {
		try{
			return titleViewOrganisation.isDisplayed();
		}catch (Exception e) {
			return false;
		}
	}
	
	
}
