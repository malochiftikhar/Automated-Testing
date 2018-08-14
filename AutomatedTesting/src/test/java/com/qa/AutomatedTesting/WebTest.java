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

public class WebTest {
	
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
	public void addNamePasswordTest() {
		myDriver.get("http://thedemosite.co.uk/");
		WebElement element = myDriver.findElement(By.linkText("3. Add a User"));
		element.click();
		WebElement element1 = myDriver.findElement(By.name("username"));
		element1.click();
		WebElement element2 = myDriver.findElement(By.name("username"));
		element2.sendKeys("ifti");
		WebElement element3 = myDriver.findElement(By.name("password"));
		element3.click();
		WebElement element4 = myDriver.findElement(By.name("password"));
		element4.sendKeys("JAVA");
		WebElement element5 = myDriver.findElement(By.name("FormsButton2"));
		element5.click();
		WebElement element6 = myDriver.findElement(By.linkText("4. Login"));
		element6.click();
		WebElement element7 = myDriver.findElement(By.name("username"));
		element7.click();
		WebElement element8 = myDriver.findElement(By.name("username"));
		element8.sendKeys("ifti");
		WebElement element9 = myDriver.findElement(By.name("password"));
		element9.click();
		WebElement element10 = myDriver.findElement(By.name("password"));
		element10.sendKeys("JAVA");
		WebElement element11 = myDriver.findElement(By.name("FormsButton2"));
		element11.click();
	}
	
	
	@After
	public void tearDown() {
		myDriver.close();
	}

}
