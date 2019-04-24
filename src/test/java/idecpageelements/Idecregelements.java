package idecpageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Idecregelements {

	static WebDriver driver;
	
	

	@FindBy(xpath ="//a[@class='btn alt-call btn-lg btn-block']") WebElement AccessIDEC;

	@FindBy(name = "email")WebElement Email;

	@FindBy(name = "password" )WebElement Password;

	@FindBy (name = "confirm_password")WebElement ConfirmPassword;

	@FindBy (name = "applicant_type")WebElement Select_User; 

	@FindBy (name = "first_name")WebElement Enter_Name;

	@FindBy (name = "phone")WebElement Phone_Number;

	@FindBy (name= "guidline")WebElement Check;
	
	@FindBy (xpath = "//button[contains(text(),'Register')]" )WebElement Register;
	
	
	public void WebElement (WebDriver driver) {

		Idecregelements.driver = driver;
	}




	public void Reg_method(String value, String name, String email, String password, String Phone) {

		

		AccessIDEC.click();

		Email.sendKeys(email);

		Password.sendKeys(password);

		ConfirmPassword.sendKeys(password);

		Select select = new Select(Select_User);
		select.selectByValue(value);

		Enter_Name.sendKeys(name);

		Phone_Number.sendKeys(Phone);
		
		Check.click();
		
		Register.click();


	}


}
