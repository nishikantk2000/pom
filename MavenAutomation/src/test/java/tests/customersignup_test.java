package tests;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AppleIdCreate;
import pages.BasePage;

public class customersignup_test extends BasePage{
	AppleIdCreate appleidcreate;
	
	@BeforeMethod
	public void setup() {
		init();
		appleidcreate = new AppleIdCreate();
	}
	@AfterMethod
	public void teardow() {
		driver.close();
	}
	@Test
	public void searchsignupPage() {
		 appleidcreate.getBagPage();
		 driver.getPageSource();
		String expUrl = "https://appleid.apple.com/account";
		Assert.assertEquals(expUrl,"AppleID page title is not matching with"+ expUrl);
	}


}	
	
	
	
	
	
	
	
	
	
	

