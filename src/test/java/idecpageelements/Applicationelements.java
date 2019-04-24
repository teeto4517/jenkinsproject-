package idecpageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Applicationelements {

	static WebDriver driver;
	
	

	@FindBy(xpath = "//span[contains(text(),'New Application')]")WebElement New_Application;

	@FindBy(id = "next-1")WebElement Next1;

	@FindBy(name = "product_name")WebElement Product_Name;

	@FindBy(name = "product_type")WebElement Product_Type;

	@FindBy(name = "country")WebElement Country_Origin;

	@FindBy(name = "quantity")WebElement Quantity;

	@FindBy(name = "unit")WebElement Unit;

	@FindBy(name = "currency")WebElement Currency;

	@FindBy(name = "unit_price")WebElement Unit_Price;

	@FindBy(name = "sector")WebElement Benefit_Factor;

	@FindBy(name = "form")WebElement Form_M;

	@FindBy(name = "comment")WebElement Comment;
	
	@FindBy(xpath = "//input[@name='form_m']")WebElement Upload_Form_M;

	@FindBy(name = "packing_list")WebElement Package_list;

	@FindBy(name = "pro_forma_invoice")WebElement Pro_forma_Invoice;

	@FindBy(name = "tax_clearance_certificate")WebElement Tax_Clearance_Cert;

	@FindBy(name = "bill_of_laden")WebElement Bill_Laden;

	@FindBy(name = "certificate_of_incorporation")WebElement Certificate_Incorp;

	@FindBy(xpath = "//a[contains(text(),'Specific')]")WebElement Specific; 

	@FindBy(name = "certidficate_of_donation")WebElement Certificate_Donation;

	@FindBy(name = "certificate_of_safety_of_drug_use")WebElement Certification_Safety;

	@FindBy(name = "gas_sale_and_purchase_agreement")WebElement Gas_Agreement;

	@FindBy (name = "nnpc_approval_for_award_of_contract")WebElement NNPC_Approval;

	@FindBy(name = "contractual_agreement")WebElement Contractual_Agreement;

	@FindBy(name = "confirmation_of_gas_supply_and_purchase_commitment")WebElement Confirmation_Gas_Commitment;

	@FindBy(name = "statement_of_proposed_utilization_of_product")WebElement Statement_Utilization_Product;

	@FindBy (xpath = "//div[@class='text-center']//button[@type='button'][contains(text(),'Next')]") WebElement Next_2;

	@FindBy(xpath = "//span[contains(text(),'Next')]")WebElement Nexxt_3;
	
	@FindBy (xpath = "//html//body")WebElement Body_1;
	
	
	public void WebElement (WebDriver driver) {

		Applicationelements.driver = driver;
		
	}

	public void click_NewApp() {
		
		New_Application.click();
		
	}
	
	
	public void Scroll () {
		
		Next1.click();
	}

	
	public void NewApp2 (String name, String option, String Country) {

		Product_Name.sendKeys(name);

		Select select = new Select(Product_Type);
		select.selectByValue(option);


		Select select1 = new Select(Country_Origin);
		select1.selectByVisibleText(Country);


	}

	public void NewApp3 (String qty, String unit, String option, String Num ) {

		Quantity.sendKeys(qty);

		Unit.sendKeys(unit);

		Select select = new Select(Currency);
		select.selectByValue(option);

		Unit_Price.sendKeys(Num);
	}

	public void NewApp4 (String option, String num, String sen ) {

		Select select = new Select(Benefit_Factor);
		select.selectByVisibleText(option);


		Tax_Clearance_Cert.sendKeys(num);

		Form_M.sendKeys(sen);

		Comment.sendKeys(sen);


	}

		
		
	
	
	public void NewApp6(String upload) {
		
		
		Specific.click();
		
		Certificate_Donation.sendKeys(upload);
		
		Next_2.click();
		
		Nexxt_3.click();
		
	}

}
