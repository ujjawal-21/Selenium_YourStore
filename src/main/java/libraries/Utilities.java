package libraries;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {

	public void syncElements(WebDriver driver, WebElement element, String condition) {
		switch(condition) {
			case "To Clickable":
				new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(element));
				break;
		}
	}
	
	public void clickEvent(WebDriver driver, WebElement element) {
		syncElements(driver, element, "To Clickable");
	}
}
