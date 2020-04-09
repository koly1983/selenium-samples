/**
 * 
 */
package ru;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author adi09
 *
 */
public class GoogleSearchOperations {
	
	String url="https://www.google.com";
	ChromeDriver driver = null;
	WebElement element = null;
	String result = "";

	public String performSearch(String keyword) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\driver\\chrome\\chromedriver.exe");
		System.out.println("url::::" + url);
		System.out.println("keyword::::" + keyword);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("about://blank");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		element = driver.findElement(By.name("q"));
		element.sendKeys(keyword);
		// element.sendKeys(keyword);
		element.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		element = driver.findElement(By.id("result-stats"));
		if (element != null)
			result = element.getText();
		Thread.sleep(2000);
		driver.close();
		return result;

	}
}
