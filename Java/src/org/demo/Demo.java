package org.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\skuls\\eclipse-workspace\\Java\\jar\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		int rows = driver.findElements(By.xpath("//div[@class='hmbseindicestable show'] //ul")).size();
		System.out.println(rows);
		int Columns = driver.findElements(By.xpath("//div[@class='hmbseindicestable show'] //ul[1]/li")).size();
		System.out.println(Columns);

		for (int r = 1; r <= rows; r++) {
			for (int c = 1; c <= Columns; c++) {
				String data = driver
						.findElement(By.xpath("//div[@class='hmbseindicestable show'] //ul[" + r + "]/li[" + c + "]"))
						.getText();
				System.out.print(data+ "     ");
				
			}
			System.out.println();
			
			

		}
driver.close();
	}
}