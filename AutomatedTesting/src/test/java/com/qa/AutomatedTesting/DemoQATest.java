package com.qa.AutomatedTesting;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQATest {
	
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
	
//	@Test
//	public void testDroppable() {
//		myDriver.get("http://demoqa.com/");
//		WebElement element  = myDriver.findElement(By.linkText("Droppable"));
//		element.click();
//		WebElement element2 = myDriver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Shopping cart demo'])[1]/following::p[1]"));
//		element2.click();
//	}
	
//	@Test 
//	public void testSelectable() {
//		myDriver.get("http://demoqa.com/");
//		WebElement element  = myDriver.findElement(By.linkText("Selectable"));
//		element.click();
//		WebElement selectable1 = myDriver.findElement(By.cssSelector("#selectable > li:nth-child(1)"));
//		WebElement selectable2 = myDriver.findElement(By.cssSelector("#selectable > li:nth-child(2)"));
//		WebElement selectable3 = myDriver.findElement(By.cssSelector("#selectable > li:nth-child(3)"));
//		WebElement selectable4 = myDriver.findElement(By.cssSelector("#selectable > li:nth-child(4)"));
//		WebElement selectable5 = myDriver.findElement(By.cssSelector("#selectable > li:nth-child(5)"));
//		WebElement selectable6 = myDriver.findElement(By.cssSelector("#selectable > li:nth-child(6)"));
//		WebElement selectable7 = myDriver.findElement(By.cssSelector("#selectable > li:nth-child(7)"));
//		Actions action = new Actions(myDriver);
//		action.keyDown(Keys.LEFT_CONTROL).perform();
//		action.moveToElement(selectable1).click().moveToElement(selectable2).click().moveToElement(selectable3).click().moveToElement(selectable4).click()
//		.moveToElement(selectable5).click().moveToElement(selectable6).click().moveToElement(selectable7).perform();
//	}
	
	@Test
	public void testAccordion() {
		myDriver.get("http://demoqa.com/");
		WebElement element = myDriver.findElement(By.linkText("Accordion"));
		element.click();
		WebElement collaps1 = myDriver.findElement(By.id("ui-id-4"));
		collaps1.click();
		WebElement collaps2 = myDriver.findElement(By.id("ui-id-5"));
		collaps2.click();
	}
	
	@After
	public void tearDown() {
//		myDriver.close();
	}
}
