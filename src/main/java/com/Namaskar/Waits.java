package com.Namaskar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Waits {
	
	


	private static FirefoxOptions timeout;




	public static void main(String[] args) throws InterruptedException {
		
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			try {
				driver.get("https://katalon-demo-cura.herokuapp.com/");
				driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]")).click();
				
			// using of visible text 					//a[text()="Make Appointment"]
				
			// for partial text use contains method   //a[contains(text(),"Appointment")]
			
		// for inner text 							//a[starts-with(text(),"Make")]
				
		//for visible elements					//input[@value="John Doe"]
				
		// for multiple 						//input[@type="text"][@placeholder="Username"]
				
		// for dynamic Attribute				//*[contains(@href,'./profile.php#login')]
				
		//for element relative to known element	
				// to find out parent of make appointment <div> 	//*[contains(@href,'./profile.php#login')]/parent::div
				
	//if you want to go up means <a to <div to <header 				//*[contains(@href,'./profile.php#login')]/../..
				
				
	//if you want to go up means <i to <a to <div to <header to <body	//*[contains(@href,'./profile.php#login')]/../../..
			
//if you go down means Parent to child means <i to <a		//a[@id="menu-close"]/child::i	
				
//if you want to go <ul from <i							//a[@id="menu-close"]/ancestor::ul
				
// if you want to go <nav from <i						//a[@id="menu-close"]/ancestor::nav

//if you want to go down <li from <i				//a[@id="menu-close"]/following::li
				
// if you want to go up where <a is above nav		//*[@class="sidebar-nav"]/preceding::a
				
// for sibling 								 		//*[@id="sidebar-wrapper"]/preceding-sibling::a
				
// Locating an element by position means next td 	//td[text()="Smith"}/following-sibling::td[1] 1 means value smith
				// Locating an element by position means next td 	//td[text()="Smith"}/following-sibling::td[2] 2 means value email				
				
				
				
				driver.findElement(By.xpath("//input[@value=\"John Doe\"]"));
				driver.findElement(By.xpath("//input[@value=\"ThisIsNotAPassword\"]"));
				
				
				
				driver.findElement(By.name("login")).click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		
}


			
		
		
	}
