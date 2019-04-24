import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OSGOF {
	
	
	
		
	public static void main(String[] args) {
		
		try {
			
			
			String projectPath = System.getProperty("user.dir");
			System.out.println("projectPath :" +projectPath);
					
			System.setProperty("webdriver.chrome.driver", projectPath+ "\\Drivers\\ChromeDriver\\chromedriver.exe" );
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			
			driver.get("http://13.77.150.214:7700/osgof/c/register");
			
			driver.findElement(By.id("1")).click();
			
			driver.findElement(By.id("RegisterCBSUserModel_Name")).sendKeys("Testname");
			Thread.sleep(3000);
			
			driver.findElement(By.id("RegisterCBSUserModel_UserName")).sendKeys("Test1");
			Thread.sleep(3000);
			
			driver.findElement(By.id("RegisterCBSUserModel_PhoneNumber")).sendKeys("23480000000");
			Thread.sleep(3000);
			
			driver.findElement(By.name("RegisterCBSUserModel.Email")).sendKeys("oowojaye@packwayprojects.com");
			Thread.sleep(3000);
			
			driver.findElement(By.id("RegisterCBSUserModel_TIN")).sendKeys("12344551121");
			Thread.sleep(3000);
			
		
			
			
			
			driver.findElement(By.name("RegisterCBSUserModel.Password")).sendKeys("Password1");
			Thread.sleep(3000);
			
			driver.findElement(By.name("RegisterCBSUserModel.ConfirmPassword")).sendKeys("Password1");
			Thread.sleep(3000);
			
			driver.findElement(By.id("RegisterCBSUserModel_Address")).sendKeys("295 Herbert Macaulay Way");
			Thread.sleep(3000);
			
			
			driver.findElement(By.className("btn")).click();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
