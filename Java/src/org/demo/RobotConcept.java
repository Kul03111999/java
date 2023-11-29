package org.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RobotConcept {

public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\skuls\\eclipse-workspace\\Java\\jar\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement element=driver.findElement(By.xpath("//a[@class = 'gb_E'][1]"));
	Actions act = new Actions(driver);
	act.contextClick(element).build().perform();
	Robot r=new Robot();
	for (int i = 0; i < 1; i++) {
	
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
}


	
}
