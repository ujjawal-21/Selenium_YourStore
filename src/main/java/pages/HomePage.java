package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Your Store']")
	WebElement link_home;
	
	@FindBy(name = "search")
	WebElement TextBox_search;
	
	@FindBy(xpath = "//div[@id='search']//following::button")
	WebElement button_search;
	
	@FindBy(xpath = "//div[@id='cart']//following::button")
	WebElement button_cart;
	
	
}
