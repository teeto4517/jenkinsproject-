package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pages.OsgofObjectpages;

public class Reg_Osgoftest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		Osgoftest();				
			
		}
	
	private static void Osgoftest() {
		// TODO Auto-generated method stub
		
	}

	public static void OsgofRegistrationpage() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath :" +projectPath);
				
		System.setProperty("webdriver.chrome.driver", projectPath+ "\\Drivers\\ChromeDriver\\chromedriver.exe" );
		
		OsgofObjectpages searchpageObj = new OsgofObjectpages(driver);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		driver.get("http://13.77.150.214:7700/osgof/c/register");
		
		searchpageObj.ClickRadioButton_Option();
		
		searchpageObj.TypeinTextbox_Name("Testname");
		
		searchpageObj.TypeinTextbox_Username("test1");
		
		searchpageObj.TypeinTextbox_Phone("2340859874225");
		
		searchpageObj.TypeinTextbox_EMail("oowojaye@packwayprojects.com");
		
		searchpageObj.TypeinTextbox_TIN("12344551121");
		
		searchpageObj.TypeinTextbox_Password("Password1");
		
		searchpageObj.TypeinTextbox_NewPassword("Password1");
		
		searchpageObj.TypeinTextbox_Address("295 Herbert Macaulay Way");
		
		searchpageObj.Button_Register();
		
		
				
	}

}

