package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasic {
	
	@BeforeSuite
	public void setup() {
		System.out.println("setup system property for chrome");
	}
	
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println(" launch chrome browser");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("login to app");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
	
	}
	
	@Test
	public void googleTitleTest() {
		System.out.println("google title test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("google logo test");
	}
	
	@AfterMethod
	public void LogOut() {
		System.out.println("logout from app");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("deleteAllCookies");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generateTestReport");
	}
	
	
	
	
	
}

