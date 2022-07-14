package libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Base {

	public static WebDriver driver;
	public static Properties prop;
	

	public static Logger logger = LoggerFactory.getLogger(Base.class);
	
	public Base(){
		FileInputStream fin;
		try {
			prop = new Properties();
			fin = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/other/config.properties");
			try {
				prop.load(fin);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logger.info("Launched browser successfully");
	}
	
	
}
