package idec;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Report.ExtentFactory;
import idecpageelements.Applicationelements;
import idecpageelements.ldecloginelements;

public class Newapplication {
	
static FirefoxDriver driver =null;
	
	static ExtentReports report;
	static ExtentTest test;
	
	
	
	@BeforeSuite

	public void Invoke_browser() {
		
		report = ExtentFactory.Instance();
		
		test = report.startTest("IDEC Registration(valid)");

	
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath :" +projectPath);

		System.setProperty("webdriver.gecko.driver", projectPath+ "\\Drivers\\GeckoDriver\\geckodriver.exe" );


		driver = new FirefoxDriver();
		
		test.log(LogStatus.INFO, "Launch Browser");
	}
	
	
	

	
	@Test
	public void New_Application() throws InterruptedException, IOException {
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
			
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		test.log(LogStatus.INFO, "Maximize and Delete Browser Cookies");
		
		driver.get("http://13.77.150.214:7400/");
		
		test.log(LogStatus.INFO, "Open IDEC webpage");
		
		
		ldecloginelements webelement = PageFactory.initElements(driver, ldecloginelements.class);
		
		Applicationelements locateElements  = PageFactory.initElements(driver, Applicationelements.class);
		
		
		webelement.loginMethod("test.parkway@gmail.com","password1");
		
		test.log(LogStatus.INFO, "Login with Valid user credentials");
	
				
		locateElements.click_NewApp();
		
		test.log(LogStatus.INFO, "Click New Applicaition");
		
		locateElements.Scroll();
		
		locateElements.NewApp2("test","MISCELLANEOUS MANUFACTURED ARTICLES","Belgium");
		
		test.log(LogStatus.INFO, "Enter and Select Product type");
		
		locateElements.NewApp3("100", "kg", "EUR", "200");
		
		test.log(LogStatus.INFO, "Enter Quantity Unit and Currency");
		
		locateElements.NewApp4("Others", "23234445555", "2387782398tn");
		
		test.log(LogStatus.INFO, "Select Benefiting Sector, Enter Tax Identification Number and Form M Number");
		
		driver.findElement(By.name("form_m")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\Oguntoye\\Document\\Selenium_AutoITScrpt.exe");
	
		//WebElement uploadElement = driver.findElement(By.name("form_m"));
		
		//uploadElement.sendKeys("C:\\Users\\Oguntoye\\Downloads\\IDEC.pdf");;
		
		//locateElements.Form_m("C:\\Users\\Oguntoye\\git\\repository\\SeleniumJavaFramework\\Doc\\Order # 200247810.pdf");
		
		//locateElements.Package_list("C:\\Users\\Oguntoye\\git\\repository\\SeleniumJavaFramework\\Doc\\Order # 200247810.pdf");
		
		//locateElements.Pro_forma("C:\\Users\\Oguntoye\\git\\repository\\SeleniumJavaFramework\\Doc\\Order # 200247810.pdf");
		
		//locateElements.Tax_Clearance("C:\\Users\\Oguntoye\\git\\repository\\SeleniumJavaFramework\\Doc\\Order # 200247810.pdf");
		
		//locateElements.Bill_Laden("C:\\Users\\Oguntoye\\git\\repository\\SeleniumJavaFramework\\Doc\\Order # 200247810.pdf");
		
		
		test.log(LogStatus.INFO, "Select Document path for Form M, Packing List, Proforma Invoice, Tax Clearance, Bill of Laden and Certificate of Incorporation");
		
		//locateElements.NewApp6("C:\\Users\\Oguntoye\\git\\repository\\SeleniumJavaFramework\\Doc\\Order # 200247810.pdf");
		
		test.log(LogStatus.INFO, "Select Document path for Certificate of Donation, then Submit");
		
		
		
	}
	
	@AfterTest
	public static void CloseBrowser() {
		
		driver.close();
		
		driver.quit();
		
		report.endTest(test);
		report.flush();
		
		
	
	}
}
	
	
