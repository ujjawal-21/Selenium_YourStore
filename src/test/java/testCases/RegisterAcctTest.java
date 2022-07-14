package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import libraries.Base;
import pages.RegisterPage;

public class RegisterAcctTest extends Base {
	
	RegisterPage registerPage;
	
	@BeforeMethod
	public void initial()
	{
		init();
		registerPage=new RegisterPage(driver);
	}
	
	@Test
	public void registersuccess()
	{
		registerPage.btn_myacct.click();
		registerPage.btn_register.click();
		registerPage.txtbox_firstname.sendKeys("Ujjawal");
		registerPage.txtbox_lastname.sendKeys("Anand");
		registerPage.txtbox_email.sendKeys(prop.getProperty("emailId"));
		registerPage.txtbox_telephone.sendKeys("123456798");
		registerPage.txtbox_password.sendKeys("password");
		registerPage.txtbox_cnfrmpasswd.sendKeys("password");
		registerPage.radiobtn_no.click();
		registerPage.chkbox_policy.click();
		registerPage.btn_continue.click();
		Assert.assertEquals(registerPage.text_success.getText(), prop.getProperty("text"));
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
