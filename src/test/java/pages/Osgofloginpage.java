package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Osgofloginpage {

	static WebDriver driver = null;
	
	
	
	By Button_Signin = By.xpath("//a[contains(text(),'Sign In')]");
	
	By Textbox_Username = By.id("CBSUserName");
	
	By Textbox_Password = By.id("password");
	
	By Btn_Signin = By.className("btn");
	
	By DropDown_Revenue = By.id("revenueHeadData");
	
	//DropDown_Option1 = By.xpath("//option[@value='REGISTRATION OF CELL SITE (OSGOF)']");
	
	// DropDown_Option2 = By.xpath("//option[@value='RENEWAL OF CELL SITE (OSGOF)'])");
	
	By Button_Proceed = By.id("proceedbtn");
	
	By Textbox_Cellstate = By.className("custom-select mb-4");
	
	By Textbox_LGA = By.id("LGA");
	
	By Textbox_SiteID = By.id("cellsite");
	
	By Textbox_Year = By.id("year");
	
	By Button_Add = By.className("btn");
	
	public Osgofloginpage(WebDriver driver) {
		
		Osgofloginpage.driver = driver;
		
	}
	
	
	public void Button_Signin() {
		
		driver.findElement(Button_Signin).click();
	}
	
	
	public void Textbox_Username() {
		
		driver.findElement(Textbox_Username).sendKeys("dcpladmin");
		
	}
	
	public void Textbox_Password() {
		
		driver.findElement(Textbox_Password).sendKeys("password");
		
	}
	
	
	public void Btn_Signin() {
		
		driver.findElement(Btn_Signin).click();
		
	}
	
	public void Dropdown_Revenue() {
		
		driver.findElement(DropDown_Revenue).sendKeys("REGISTRATION OF CELL SITE (OSGOF)", Keys.RETURN);
		

	}
	
	public void Button_Proceed () {
		
		driver.findElement(Button_Proceed);
	}
	
	
	public void Textbox_Cellstate () {
		
		driver.findElement(Textbox_Cellstate).sendKeys("Lagos");
	}
	
	public void Textbox_LGA () {
		
		driver.findElement(Textbox_LGA).sendKeys("Yaba");
	}
	
	public void Textbox_SiteID () {
		
		driver.findElement(Textbox_SiteID).click();
	}
	
	public void Textbox_Year () {
		
		driver.findElement(Textbox_Year).sendKeys("2019");
	}
	
	public void Button_Add() {
		
		driver.findElement(Button_Add).click();
	}
}
