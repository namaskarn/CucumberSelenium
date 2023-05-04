package com.Namaskar;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	
	@Test
	public void titleTest()
	{
		String expectedtitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		WebDriver driver = new  FirefoxDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle=driver.getTitle(); //it will open ebay and store title in actualtitle
		
		Assert.assertEquals(actualtitle, expectedtitle);
		driver.close();
		
	}
	
	

}
