package org.demo;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrowdownHandling {
	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\skuls\\eclipse-workspace\\Java\\jar\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//single dropdown without using select method
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement findElement = driver.findElement(By.tagName("select"));
		Select s = new Select(findElement);
		List<WebElement> options = s.getOptions();
		for(WebElement option : options) 
		{
		if(option.getText().equals("Angola"))
		{
			option.click();
			break;

			}
		}*/
//mutiple dropdown handling
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\skuls\\eclipse-workspace\\Java\\jar\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formstone.it/components/dropdown/demo/");
		driver.manage().window().maximize();
		WebElement label = driver.findElement(By.id("demo_basic"));
		WebElement multiplelabel = driver.findElement(By.id("demo_multiple"));
		selectdropdown(label,"Two");
		Thread.sleep(2000);
		selectdropdown(multiplelabel, "Five");
		
		
	}
	public static void selectdropdown(WebElement ele, String value ) 
	{
	Select s = new Select(ele);
	List<WebElement> alloptions = s.getOptions();
	for (WebElement option : alloptions) {
		if(option.getText().equals(value))
		{
			option.click();
			break;
		}
	}
	
		
	}
}
