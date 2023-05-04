package com.Namaskar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowserCommands {
	
	WebDriver driver;
	

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.get("http://www.yatra.com");
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void closeBrowser() {
		
		try {
			driver.close();
			//driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
	
		TestBrowserCommands obj=new TestBrowserCommands();
		obj.invokeBrowser();
		obj.closeBrowser();

	}

}
