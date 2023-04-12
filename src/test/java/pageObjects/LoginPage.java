package pageObjects;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
JavascriptExecutor js =(JavascriptExecutor)driver;
WebDriverWait mywait=new WebDriverWait (driver, Duration.ofSeconds(10));
	// WebElements
	@FindBy(id = "login_username_input")
	private WebElement txtUsername;
	@FindBy(id = "loging_password_input")
	private WebElement txtPassword;
	@FindBy(id = "login_submit_button")
	private WebElement btnLogin;

	// Methods
	public void clearUsername(){
		txtUsername.sendKeys(Keys.CONTROL + "a");
		txtUsername.sendKeys(Keys.DELETE);
	}
	public void clearPassword(){
	txtPassword.sendKeys(Keys.CONTROL + "a");
		txtPassword.sendKeys(Keys.DELETE);
	}
	public void setUsername(String username) {
		txtUsername.sendKeys(username);
	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void cickLogin() {
		WebElement btLogin=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_submit_button")));
	      js.executeScript("arguments[0].click();", btLogin);
		//btnLogin.click();
	}

	
	
}
