package idecpageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Resetpasswordelement {
	
	static WebDriver driver; 
	
	@FindBy (xpath ="//a[@class='btn call btn-lg btn-block']") WebElement AccessIDEC;
	
	@FindBy (xpath = "//a[contains(text(),'Forgot Password?')]") WebElement Forget_Password;
	
	@FindBy (name = "email") WebElement Enter_Email_ID;
	
	@FindBy (xpath ="//button[contains(text(),'Reset Password')]") WebElement Reset_Password;
	
	@FindBy (xpath = "//p[contains(text(),'Password reset link sent to your email address')]") WebElement Verify_Rst_Pwd;
	

	public void WebElement (WebDriver driver) {

		Resetpasswordelement.driver = driver;
	}

	
	public void Reset_password_Method (String email) {
		
		AccessIDEC.click();
		
		Forget_Password.click();
		
		Enter_Email_ID.sendKeys(email);
		
		Reset_Password.click();
		
		
	}
	
	public boolean Verify() {

		try {

			this.Verify_Rst_Pwd.getTagName();
			
			return true;

		}catch(java.util.NoSuchElementException e) {

		}
		return false;
	}
}

