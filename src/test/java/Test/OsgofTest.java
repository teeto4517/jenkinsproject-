package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Report.ExtentFactory;
import pages.Osgofloginpage;

public class OsgofTest {

	static WebDriver driver =null;
	
	static ExtentReports report;
	static ExtentTest test;
	
	@BeforeSuite

	public void Invoke_browser() {
		
		report = ExtentFactory.Instance();
		
		test = report.startTest("Osgof Login Verification");

	



		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath :" +projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+ "\\Drivers\\ChromeDriver\\chromedriver.exe" );


		driver = new ChromeDriver();
	}

	@Test
	public static void Osgof_Login () {

		

		
		


		Osgofloginpage PageObjects = new Osgofloginpage (driver);

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		test.log(LogStatus.INFO, "Launch, Maximize and Delete Browser Cookies");


		driver.get("http://13.77.150.214:7700/osgof/");
		
		test.log(LogStatus.INFO, "Web Site Opened");

		//Login page 



		PageObjects.Button_Signin();
		
		test.log(LogStatus.INFO, "Click the Signin Button");

		PageObjects.Textbox_Username();
		test.log(LogStatus.INFO, "Enter Valid Username");

		PageObjects.Textbox_Password();
		test.log(LogStatus.INFO, "Enter Valid Password");

		PageObjects.Btn_Signin();
		test.log(LogStatus.INFO, "Signin Completed");




		//Select Site Registration option



		PageObjects.Dropdown_Revenue();
		
		test.log(LogStatus.INFO, "Register a New Site)");



	}

	@AfterSuite
	public static void CloseBrowser() {

		driver.close();

		driver.quit();
		
		report.endTest(test);
		report.flush();
		
	
		System.out.println("Test Completed Successfully");


	}


}