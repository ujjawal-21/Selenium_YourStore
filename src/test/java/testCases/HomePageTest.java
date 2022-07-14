package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import libraries.Base;
import libraries.Utilities;
import pages.HomePage;

public class HomePageTest extends Base {

	Utilities utils;
	HomePage home;
	
	@BeforeMethod
	public void initialization() {
		init();
		utils = new Utilities();
	}
	
	@Test
	public void homePageElementsTest() {
		
	}
}
