package org.demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class WindowHandles {
public static void main(String[] args)throws Exception  {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\skuls\\eclipse-workspace\\Java\\jar\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");

    // Open new child window within the main window
    driver.findElement(By.id("windowButton")).click();

    //Get handles of the windows
    String mainWindowHandle = driver.getWindowHandle();
    Set<String> allWindowHandles = driver.getWindowHandles();
 /*   Iterator<String> iterator = allWindowHandles.iterator();

    // Here we will check if child window has other child windows and will fetch the heading of the child window
    while (iterator.hasNext()) {
        String ChildWindow = iterator.next();
        System.out.println(ChildWindow);
        if (mainWindowHandle.equalsIgnoreCase(ChildWindow)) { //result = false! Reverse the result, returns true
           driver.switchTo().window(mainWindowHandle);
            WebElement text = driver.findElement(By.id("sampleHeading"));
            System.out.println("Heading of child window is " + text.getText());
        }
    }
        driver.switchTo().window(mainWindowHandle);
 
		
	*/
    
    for (String window : allWindowHandles) {
		String title = driver.switchTo().window(window).getTitle();
		System.out.println(title);
	}
    }
}
	
	


