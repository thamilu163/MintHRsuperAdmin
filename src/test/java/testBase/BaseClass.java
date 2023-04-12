package testBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	public static Logger logger; // for logging
	public ResourceBundle rb; // to read

	@BeforeClass
	//@BeforeTest
	@Parameters("browser") // getting browser parameter from testng.xml
	public void setup(String br) {

		rb = ResourceBundle.getBundle("config"); // Load config.properties
		logger = LogManager.getLogger(this.getClass()); // for logger

		// launch right browser based on parameter
		if (br.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (br.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new FirefoxDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(rb.getString("appURL")); // get url from config.properties file
		driver.manage().window().maximize();
	}

    @AfterClass
	public void tearDown() {
		driver.quit();
	}
   /*@BeforeClass (dependsOnMethods="setup")
	public void  Login() {	
	LoginPage lp=new LoginPage(driver);
	lp.setUsername(rb.getString("email"));
	lp.setPassword(rb.getString("password"));
	lp.cickLogin();
		} */


	public String randomeString() {
		String generatedString = RandomStringUtils.randomAlphabetic(8);
		return (generatedString);
	}

	public String randomeNumber() {
		String generatedString2 = RandomStringUtils.randomNumeric(10);
		return (generatedString2);
	}

	public String randomAlphaNumeric() {
		String st = RandomStringUtils.randomAlphabetic(4);
		String num = RandomStringUtils.randomNumeric(3);
		return (st + "*#" + num);
	}

	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;

	}
	
	
}
