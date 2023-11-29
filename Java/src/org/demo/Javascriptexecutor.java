package org.demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {
	

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\skuls\\eclipse-workspace\\Java\\jar\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://demo.guru99.com/V4/index.php");
		 * driver.manage().window().maximize(); WebElement findElement =
		 * driver.findElement(By.name("uid")); WebElement findElement2 =
		 * driver.findElement(By.name("password")); WebElement findElement3 =
		 * driver.findElement(By.name("btnLogin"));
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].setAttribute('value','kulsum')", findElement);
		 * js.executeScript("arguments[0].setAttribute('value','kulsum')",
		 * findElement2); Thread.sleep(2000); js.executeScript("history.go(0)"); // used
		 * to refresh the page Thread.sleep(2000);
		 * js.executeScript("window.scrollBy(0,1000)"); // used to scroll down the page
		 * Thread.sleep(2000); js.executeScript("window.scrollBy(0,-1000)"); //used to
		 * scroll up the page Thread.sleep(2000);
		 * js.executeScript("window.scrollBy(2000,0)");
		 * js.executeScript("arguments[0].click()", findElement3); Alert alert =
		 * driver.switchTo().alert(); alert.accept();
		 * js.executeScript("alert('wrong id and password')");
		 * 
		 */
		/*
		 * driver.get(
		 * "https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=676742234347&hvpos=&hvnetw=g&hvrand=10073728129715225752&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061939&hvtargid=kwd-10573980&hydadcr=14453_2367553&gclid=CjwKCAiAjfyqBhAsEiwA-UdzJL0VdExGTQhX-CTByLl_E6T4YAfgzr_q2tv7pKl4joWhpszQ977bABoCkSAQAvD_BwE"
		 * ); driver.manage().window().maximize(); Thread.sleep(1000); WebElement
		 * findElement = driver.findElement(By.xpath("//a[text()='Careers']"));
		 * JavascriptExecutor js = (JavascriptExecutor) driver; Thread.sleep(2000);
		 * js.executeScript("window.scrollBy(0,1000)" ); Thread.sleep(2000);
		 * js.executeScript("window.scrollBy(0,-1000)"); Thread.sleep(2000);
		 * js.executeScript("arguments[0].scrollIntoView(true)", findElement);
		 * 
		 * // js.executeScript("arguments[0].scrollIntoView(true)", findElement); //
		 * Thread.sleep(2000); // js.executeScript("arguments[0].click()", findElement);
		 * // js.executeScript("window.scrollBy(-2000,0)");
		 */
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");

		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox'] "));
		int totalcheckboxes = checkboxes.size();
		for (int i = 0; i < totalcheckboxes; i++) {
			if (i < 2) {
				checkboxes.get(i).click();
			}
		}
	}
}
