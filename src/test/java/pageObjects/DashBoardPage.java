package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {

	public DashBoardPage(WebDriver driver) {
		super(driver);
	}
	//WebElement
	@FindBy(xpath="//h4[normalize-space()='Total Organizations']")
	WebElement titleTotalOrganization;
	@FindBy(xpath="//h4[normalize-space()='Total Users']")
	WebElement titleTotalUsers;
	@FindBy(xpath="//h4[normalize-space()='Total Leaves']")
	WebElement titleTotalLeaves;
	@FindBy(xpath="//h4[normalize-space()='Total Attendence']")
	WebElement titleTotalAttendence;
	@FindBy(xpath="//h4[normalize-space()='Total Holidays']")
	WebElement titleTotalHolidays;
	@FindBy(xpath="//p[@class='text-center card-text']")
	List <WebElement> data;

	//Methods
	public boolean isTotalOrganizationDisplayed() {
		try {
			return titleTotalOrganization.isDisplayed();
		}catch (Exception e) {
			return false;
		}
	}
	public boolean isTotalUsersDisplayed() {
		try {
			return titleTotalUsers.isDisplayed();
		}catch (Exception e) {
			return false;
		}
	}
	public boolean isTotalLeavesDisplayed() {
		try {
			return titleTotalLeaves.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	public boolean isTotalAttendanceDisplayed() {
		try {
			return titleTotalAttendence.isDisplayed();
		}catch (Exception e) {
			return false;
		}
	}
	public boolean isTotalHolidaysDisplayed() {
		try {
			return titleTotalHolidays.isDisplayed();
		}catch (Exception e) {
			return false;
		}
	}
	public boolean isAllDataDisplayed() {
		try {
			return data.isEmpty();//false
		}catch (Exception e) {
			return false;
		}
		
	}
}
