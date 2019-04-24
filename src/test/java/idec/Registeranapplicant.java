package idec;

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
import idecpageelements.Idecregelements;

public class Registeranapplicant {

static WebDriver driver =null;
	
	static ExtentReports report;
	static ExtentTest test;
	
	@BeforeTest

	public void Invoke_browser() {
		
		report = ExtentFactory.Instance();
		
		test = report.startTest("IDEC Registration(valid)");

	
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath :" +projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+ "\\Drivers\\ChromeDriver\\chromedriver.exe" );


		driver = new ChromeDriver();
		
		test.log(LogStatus.INFO, "Launch Browser");
	}
	
	@Test
	public void ApplicantReg_Idec () {
		
		

		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		test.log(LogStatus.INFO, "Maximize and Delete Browser Cookies");
		
		driver.get("http://13.77.150.214:7400/");
		
		test.log(LogStatus.INFO, "Open IDEC webpage");
		
		
		Idecregelements locateElements = PageFactory.initElements(driver,Idecregelements.class);
		
		locateElements.Reg_method("individual", "test", "test.parkway@gmail.com", "admin", "070900000000");
		
		test.log(LogStatus.INFO, "Fill in Valid Registration Parameters");
		
	}
	
	@AfterTest
	public static void CloseBrowser() {
		
		driver.close();
		
		driver.quit();
		
		test.log(LogStatus.INFO, "Close Browser");
		
		report.endTest(test);
		report.flush();
		
		System.out.println("Registration Successfull");
	
	}
}
