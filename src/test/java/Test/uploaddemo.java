package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class uploaddemo {
	
	WebDriver driver;
	@Test
public void Invoke_browser() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath :" +projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath+ "\\Drivers\\ChromeDriver\\chromedriver.exe" );


		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/upload/");
		 
	    driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Oguntoye\\Documents\\Lightshot");;
	    
	    driver.findElement(By.id("terms")).click();

	    driver.findElement(By.name("send")).click();
		
	}
	
	

}
