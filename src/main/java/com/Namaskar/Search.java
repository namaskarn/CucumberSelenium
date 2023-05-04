package com.Namaskar;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Search {

	WebDriver driver;
	JavascriptExecutor jse;

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			serchCourse();
			closeBrowser();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void serchCourse() throws Throwable {

		try {
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("namaskarn@hotmail.com");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Unique05");
			
			driver.findElement(By.name("login")).click();
		} catch (Exception e) {
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

		Search myobj = new Search();
		myobj.invokeBrowser();
		// myobj.closeBrowser();
	}
}
