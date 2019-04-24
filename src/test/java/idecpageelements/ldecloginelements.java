package idecpageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ldecloginelements {

	static WebDriver driver;

	@FindBy(xpath ="//a[@class='btn call btn-lg btn-block']") WebElement AccessIDEC;

	@FindBy(name ="email") WebElement Username;

	@FindBy(name = "password")WebElement Password;

	@FindBy(xpath = "//button[contains(text(),'Login')]") WebElement Login;

	@FindBy(xpath = "//div[@class='alert alert-danger']") WebElement Invalid;

	@FindBy(id = "toast-contain") WebElement Login_Successful;

	public boolean WebElement(WebDriver driver) {

		ldecloginelements.driver = driver;
		return false;
	}


	
	
	public void loginMethod (String email, String password) {

		AccessIDEC.click();

		Username.sendKeys(email);

		Password.sendKeys(password);

		Login.click();
			
		}



	
	public boolean InvalidLogin() {

		try {

			this.Invalid.getTagName();
			
			return true;

		}catch(java.util.NoSuchElementException e) {

		}
		return false;
	}




}	