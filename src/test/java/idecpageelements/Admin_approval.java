package idecpageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_approval {
	
	static WebDriver driver;
	
	
	@FindBy (xpath = "//input[@id='Pending']") WebElement Processing;
	
	@FindBy (xpath = "//tr[1]//td[8]//label[1]") WebElement View;
	
	@FindBy (name = "comment") WebElement Comment;
	
	@FindBy (xpath = "//input[@value='approve']" ) WebElement Approve; 
	
	@FindBy (xpath ="//input[@value='query']") WebElement Query; 
	
	@FindBy (xpath = "//input[@value='decline']") WebElement Decline; 
	
	
	


	public void WebElement(WebDriver driver) {
		
		Admin_approval.driver = driver;
	
	}
	
	public void Approve_application (String approved) {
		
		Processing.click();
		
		View.click();
		
		Comment.sendKeys(approved);
		
		Approve.click();
		
		
	}
}

