package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.OsgofObjectpages;

public class TestNGReg_Osgoftest {
	
	private static WebDriver driver = null;
	
	
	@BeforeTest
	public void SetUpTest () {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath :" +projectPath);
				
		System.setProperty("webdriver.chrome.driver", projectPath+ "\\Drivers\\ChromeDriver\\chromedriver.exe" );
		
		
		driver = new ChromeDriver();
		
	}
		
	@Test
	public static void OsgofRegistrationpage() {
		
		OsgofObjectpages searchpageObj = new OsgofObjectpages(driver);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		driver.get("http://13.77.150.214:7700/osgof/c/register");
		
		searchpageObj.ClickRadioButton_Option();
		
		searchpageObj.TypeinTextbox_Name("Testname");
		
		searchpageObj.TypeinTextbox_Username("test1");
		
		searchpageObj.TypeinTextbox_Phone("2340859874225");
		
		searchpageObj.TypeinTextbox_EMail("test@xyz.com");
		
		searchpageObj.TypeinTextbox_TIN("12344551121");
		
		searchpageObj.TypeinTextbox_Password("Password1");
		
		searchpageObj.TypeinTextbox_NewPassword("Password1");
		
		searchpageObj.TypeinTextbox_Address("295 Herbert Macaulay Way");
		
		searchpageObj.Button_Register();
		
		try {
			Thread.sleep(20000);
			
			Assert.assertEquals("Display_Message", "Display_Message1");
						
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	public static void Message() {
		
		
	
	}

	@AfterTest
	public static void CloseBrowser() {
		
		driver.close();
		
		driver.quit();
		
		System.out.println("Test Completed Successfully");
	
	}
	
	
	
}

