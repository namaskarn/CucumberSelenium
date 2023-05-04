package com.Namaskar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class UseElementLocatorTechniques {
	

	WebDriver driver;
	
//here we are giving url because in this page we are going to use different url so if we do this it will invoke all url
	public void invokeBrowser(String url) {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.get("url"); //here we are doing like this because we already mention url on the invoke method
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	public void closeBrowser() {
		
		driver.close();
	}
	
	public void elementLocatorTechniques() {
		try {
			invokeBrowser("http://www.amazon.com.in");
			driver.findElement(  By.id("twotabsearchtextbox")).sendKeys("Lenovo Laptops");
			driver.findElement(By.className("nav-input)")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public static void main(String[] args) {
		UseElementLocatorTechniques obj = new UseElementLocatorTechniques(); // under we do not have to give url as its given above
		obj.elementLocatorTechniques();
		
	

	}

}
