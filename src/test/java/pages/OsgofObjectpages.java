package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OsgofObjectpages {

	private static WebDriver driver = null;
	
	

	By RadioButton_Option = By.id("1");

	By Textbox_Name = By.id("RegisterCBSUserModel_Name");

	By Textbox_Username = By.id("RegisterCBSUserModel_UserName");

	By Textbox_Phone = By.id("RegisterCBSUserModel_PhoneNumber");

	By Textbox_EMail = By.name("RegisterCBSUserModel.Email");

	By Textbox_TIN = By.id("RegisterCBSUserModel_TIN");

	By Textbox_Password = By.name("RegisterCBSUserModel.Password");

	By Textbox_NewPasssword = By.name("RegisterCBSUserModel.ConfirmPassword");

	By Textbox_Address = By.id("RegisterCBSUserModel_Address");

	By Botton_Register = By.className("btn");
	
	By Display_Message = By.className("field-validation-error tiny-caption, message");
	
	By Display_Message1 = By.xpath("//small[contains(text(),'Registration successful. You can now login.')]");
	
	public OsgofObjectpages(WebDriver driver) {

		OsgofObjectpages.driver = driver;

	}

	public void ClickRadioButton_Option() {

		driver.findElement(RadioButton_Option).click();
	}

	public void TypeinTextbox_Name(String text) {

		driver.findElement(Textbox_Name).sendKeys(text);
	}

	public void TypeinTextbox_Username(String text) {

		driver.findElement(Textbox_Username).sendKeys(text);
	}

	public void TypeinTextbox_Phone(String Number) {
		driver.findElement(Textbox_Phone).sendKeys(Number);
	}
	

	public void TypeinTextbox_EMail(String text) {

		driver.findElement(Textbox_EMail).sendKeys(text);
	}

	public void TypeinTextbox_TIN(String Number) {

		driver.findElement(Textbox_TIN).sendKeys(Number);
	}

	public void TypeinTextbox_Password(String text) {

		driver.findElement(Textbox_Password).sendKeys(text);
	}

	public void TypeinTextbox_NewPassword(String text) {

		driver.findElement(Textbox_NewPasssword).sendKeys(text);
	}

	public void TypeinTextbox_Address(String text) {

		driver.findElement(Textbox_Address).sendKeys(text);
	}

	public void Button_Register() {

		driver.findElement(Botton_Register).click();
	}
	
	public String Display_Message() {
		
		return driver.findElement(Display_Message).getText();
	}
	
	public String Display_Message1() {
		
		return driver.findElement(Display_Message1).getText();
	}
}
