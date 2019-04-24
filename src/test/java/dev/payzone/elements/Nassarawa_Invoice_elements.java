package dev.payzone.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Nassarawa_Invoice_elements {
	
	static WebDriver driver;
	
	@FindBy (xpath = "//a[@class='category-item text-center']//img[@class='category-icon']") WebElement Show_All_Category;
	
	@FindBy (xpath = "//a[@href='/payzone/#/categories/14']//img[@class='category-icon']") WebElement Government_Revenue;
	
	@FindBy (xpath = "//div[@class='col-12 col-md-7 pay-zone-right']//div[2]//a[1]") WebElement Nas_Invoice;
	
	@FindBy ( name = "InvoiceNumber") WebElement Invoice; 
	
	@FindBy (name = "Customer Phone Number") WebElement Phone_No;
	
	@FindBy (xpath = "//button[@class='cta primary cta-full']") WebElement Next;
	
	@FindBy (xpath = "//button[@class='cta primary cta']") WebElement Pay;
	
	@FindBy (xpath = "//div[@class='form-group card-number']//input[@type='text']") WebElement Card_Number;
	
	@FindBy (xpath ="//input[contains(@placeholder,'YY')]") WebElement Expiry_Date;
	
	@FindBy (xpath = "//input[contains(@type,'password')]") WebElement CVV;
	
	@FindBy (xpath = "//button[contains(@class,'payment-input cta')]") WebElement Payment_Confirmation;
	
	@FindBy (xpath = "//button[contains(@class,'btn btn-link')]") WebElement Reciept; 
	
	
	
	
	
	
	
	public void WebElement (WebDriver driver) {
		
		 Nassarawa_Invoice_elements.driver = driver;
		
	}
	
	
	public void Nassarawa_invoice(String invoice,String phone ) {
		
		Show_All_Category.click();
				
		Government_Revenue.click();
		
		Nas_Invoice.click();
		
		Invoice.sendKeys(invoice);
		
		Phone_No.sendKeys(phone);
		
		Next.click();
		
		Pay.click();
	}
	
	public void Payment(String card, String date, String pin) {
		
		
		
		Card_Number.sendKeys(card);
		
		Expiry_Date.sendKeys(date);
		
		CVV.sendKeys(pin);
		
		Payment_Confirmation.click();
		
		Reciept.click();
		
		
	}
}
