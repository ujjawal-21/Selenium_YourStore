package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import libraries.Base;
import pages.LoginPage;
import pages.RegisterPage;

public class LoginTest extends Base {
	
	RegisterPage registerPage;
	LoginPage loginPage;
	
	@BeforeMethod
	public void initial()
	{
		init();
		registerPage=new RegisterPage(driver);
		loginPage=new LoginPage(driver);
	}
	
	@Test
	public void loginSuccess()
	{
		registerPage.btn_myacct.click();
		registerPage.btn_login.click();
		loginPage.txtbox_emailid.sendKeys(prop.getProperty("emailId"));
		loginPage.txtbox_password.sendKeys(prop.getProperty("password"));
		loginPage.btn_login.click();
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}


}
