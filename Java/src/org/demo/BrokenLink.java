package org.demo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\skuls\\eclipse-workspace\\Java\\jar\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://bstackdemo.com/");


		// Finding all the available links on webpage
		   List<WebElement> links = driver.findElements(By.tagName("a"));
		    System.out.println(links.size());
				
		// Iterating each link and checking the response status
		      for (WebElement link : links) {

		//all links attribute starts href
		      String url = link.getAttribute("href");

		//calling the method
		      verifyLink(url);
		}
		driver.quit();

	}
		public static void verifyLink(String url ) {
		try { //URl is the supper class, Urlconnection and httpurlconnection are the subclassess of url cant access directly so cant able to create the object because both are Abstract classes. so we typecasting the httpurlconnection
		URL link = new URL(url);
		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
		httpURLConnection.connect();


		if (httpURLConnection.getResponseCode() == 200) {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage()+ "  "+ "is not a broken links");
		} else {
		System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
		}
		} catch (Exception e) {
		System.out.println(url + " - " + "is a broken link");
		}

		 
	}
}
