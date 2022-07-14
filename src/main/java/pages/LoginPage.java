package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='input-email']")
	public WebElement txtbox_emailid;
	
	@FindBy(xpath="//input[@id='input-password']")
	public WebElement txtbox_password;
	
	@FindBy(xpath="//input[@value='Login']")
	public WebElement btn_login;
	
	@FindBy(xpath="//div[@class='form-group']//a[normalize-space()='Forgotten Password']")
	public WebElement link_forpass;
}
