package com.Namaskar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestNavigateCommands {
	
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

			navigateCommands();
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public void navigateCommands() {
		try {
			driver.navigate().to("http://www.flipkart.com");//this will open the page
			driver.findElement(By.linkText("Advertise")).click();//this will go to Advertise means it shows this link url 
			driver.findElement(By.xpath("//span[contains(text),'Microwave Ovens')]")).click();//this will go under Appliance where Microwave oven is
			Thread.sleep(5000);
			driver.navigate().back();//after showing Advertise this url go back to previous url
			Thread.sleep(5000);
			driver.navigate().forward();// this means this url again go forward to show Advertise page
			Thread.sleep(5000);
			driver.navigate().refresh();// this means on webpage first you can see X sign which will turn into refresh sign
		} catch (InterruptedException e) {
			
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
		// TODO Auto-generated method stub
		
		TestNavigateCommands myobj =new TestNavigateCommands();
		myobj.invokeBrowser();
		myobj.closeBrowser();
	}

}
