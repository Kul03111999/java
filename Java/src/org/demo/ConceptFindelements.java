package org.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptFindelements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\skuls\\eclipse-workspace\\Java\\jar\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='navFooterLinkCol navAccessibility'][3]//a"));
		System.out.println(findElements.size());
		for(WebElement eachlink :findElements )
		{
			System.out.println(eachlink.getText());
		}

	}
}
