package com.Namaskar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommand {

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

			getCommands();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void getCommands() {

		try {
			driver.get("http://www.amazon.in");
			String titleOfThePage = driver.getTitle();
			System.out.print("Title of the page is:" + titleOfThePage);// this command shows result on console
			driver.findElement(By.linkText("Today's Deals")).click();
			String currentUrl = driver.getCurrentUrl();
			System.out.println("The current url is:" + currentUrl);// this command shows result on console and it shows
																	// current link
			System.out.println("The current page source is:" + driver.getPageSource());
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
		// TODO Auto-generated method stub
		GetCommand get = new GetCommand();
		get.invokeBrowser();
		get.closeBrowser();
	}

}
