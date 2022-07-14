package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//i[@class='fa fa-user']")
	public
	WebElement btn_myacct;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	public
	WebElement btn_register;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	public WebElement btn_login;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	public
	WebElement txtbox_firstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	public
	WebElement txtbox_lastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	public
	WebElement txtbox_email;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	public WebElement txtbox_telephone;
	
	@FindBy(xpath="//input[@id='input-password']")
	public WebElement txtbox_password;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	public WebElement txtbox_cnfrmpasswd;
	
	@FindBy(xpath="//input[@value='0']")
	public WebElement radiobtn_no;
	
	@FindBy(xpath="//input[@value='1']")
	public WebElement radiobtn_yes;

	@FindBy(xpath="//input[@name='agree']")
	public WebElement chkbox_policy;
	
	@FindBy(xpath="//input[@value='Continue']")
	public WebElement btn_continue;
	
	@FindBy(xpath="//a[normalize-space()='Continue']")
	public WebElement btn_successcont;
	
	
}
