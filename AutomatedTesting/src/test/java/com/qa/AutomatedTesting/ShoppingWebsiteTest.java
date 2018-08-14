package com.qa.AutomatedTesting;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingWebsiteTest {
	
	static WebDriver myDriver;

	@BeforeClass 
	public static void init() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\chromedriver.exe");
	}
	
	@Before 
	public void setUp() {
		myDriver = new ChromeDriver();
		myDriver.manage().window().maximize();
	}
	
	@Test
	public void searchDress() {
	myDriver.get("http://automationpractice.com/index.php");
	WebElement element = myDriver.findElement(By.id("search_query_top"));
	element.click();
	element.sendKeys("dress");
	WebElement submit = myDriver.findElement(By.id("searchbox"));
	submit.submit();
	WebElement produt = myDriver.findElement(By.cssSelector("#center_column > ul > li:nth-child(1)"));
	assertTrue(produt.isDisplayed());
	}
	
	@After
	public void tearDown() {
		myDriver.close();
	}

}
