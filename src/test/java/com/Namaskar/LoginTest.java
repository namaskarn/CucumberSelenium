package com.Namaskar; // in TestNG we donot need main method because we are using annotations

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	@BeforeTest
	public void loginToApplication()
	{
		
	System.out.println("Login to Application");	
	}
	
	@AfterTest
	public void logoutToApplication()
	{
		System.out.println("Logout from Application");
		
	}
	
	@BeforeMethod
	public void connectToDB()
	{
		
		System.out.println("DB Connected");
	}
	
	
	@AfterMethod
	public void disconnectToDB()
	{
		
		System.out.println("DB Disconnected");
	}
	
	
	@Test
	public void loginTest()
	

 {
		System.out.println("Login is successful");

	}
	@Test
	public void logoutTest()
	{
		
		System.out.println("Logout is successful");
		
	}
	@Test(priority=1,description="This is a login test")
	public void bloginTest()
	{
		System.out.println("Login is successful");
		
	}
	
	@Test(priority=2)
	public void alogoutTest()
	{
		System.out.println("Logout is successful");
		
	}
}
