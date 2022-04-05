package com.noorteck.selenium.hw7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise02 {

	public static void main(String[] args) throws InterruptedException {
		
		String key = "webdriver.chrome.driver";
		String path = "C://Users//chefa//Desktop//Documents//Noorteck//Selenium//chromedriver.exe";
		String url = "http://demo.automationtesting.in/Frames.html";
		
		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
			
		// create my WebElement objects for each iframe
		WebElement iframeOne = driver.findElement(By.id("singleframe"));
		WebElement iframeTwo = driver.findElement(By.xpath("//iframe[@src = 'MultipleFrames.html']"));
		driver.switchTo().frame(iframeTwo);
		WebElement iframeThree = driver.findElement(By.xpath("//*[contains(@style, 'float: left;height: 250px;width: 400px')]"));
		driver.switchTo().defaultContent();
		
		// 1. switch to iframeOne
		driver.switchTo().frame(iframeOne);
		// 2. enter "Accessing Iframe" in the text field 
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("Accessing Iframe");
		// 3. wait 2 seconds
		Thread.sleep(2000);
		// 4. Click "Iframe with in an Iframe" button
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@href = '#Multiple']")).click();		
		// 5. switch to inner i frame		
		driver.switchTo().frame(iframeTwo);
		driver.switchTo().frame(iframeThree);
		// 6. enter value "iframe is easy" in the test field 
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("iframe is easy");
		// 7. click "home" link
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@href = 'Index.html']")).click();
		// 8. verify the title is "Index"
		String expTitle = "Index";
		String title = driver.getTitle();
		if (title.equals(expTitle)) {
			System.out.println("Title is Index");
		} else {
			System.out.println("nope...");
		}
		// 9. quit driver
		Thread.sleep(3000);
		driver.quit();
		
	}
	
}
