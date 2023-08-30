package com.journaldev.maven.classes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class AppTest {
	private WebDriver driver;
	
	@Test
	public void test () throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://testautomationu.applitools.com/" );
        driver.manage().window().maximize();         
        String title = driver.getTitle();
        AssertJUnit.assertTrue(title.equals("Test Automation University | Applitools"));
		
	}
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
