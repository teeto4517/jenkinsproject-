package dev.payzone.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Report.ExtentFactory;
import dev.payzone.elements.Nassarawa_Invoice_elements;

public class Nassarawa_Invoice_test {
	
static WebDriver driver =null;
	
	static ExtentReports report;
	static ExtentTest test;
	
	@BeforeTest

	public void Invoke_browser() {
		
		report = ExtentFactory.Instance();
		
		test = report.startTest("IDEC Login Verification (Valid)");

	
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath :" +projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+ "\\Drivers\\ChromeDriver\\chromedriver.exe" );


		driver = new ChromeDriver();
		
		test.log(LogStatus.INFO, "Launch Browser");
	}
	
	@Test
	public void Nassarawa_Invoice() {
		
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		test.log(LogStatus.INFO, "Maximize and Delete Browser Cookies");
		
		driver.get("https://staging.parkwayprojects.xyz/payzone/#/");
		
		test.log(LogStatus.INFO, "Open Payzone webpage");
		
		
		Nassarawa_Invoice_elements locateElements = PageFactory.initElements(driver, Nassarawa_Invoice_elements.class);
		
		locateElements.Nassarawa_invoice("1000010400","08079098682");
		
		locateElements.Payment("4225677330332707", "0712","427");
				
	}
	
	@AfterTest
	
	public static void CloseBrowser() {

		driver.close();

		driver.quit();
		
		report.endTest(test);
		report.flush();
	}
	
}
