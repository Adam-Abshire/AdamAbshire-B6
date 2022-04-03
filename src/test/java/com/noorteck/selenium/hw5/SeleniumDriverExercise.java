package com.noorteck.selenium.hw5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDriverExercise {
	
	public static void main(String[] args) throws InterruptedException {
		

		String url = "http://demo.automationtesting.in/Alerts.html";
		String key = "webdriver.chrome.driver";
		String path = "C:\\Users\\chefa\\Desktop\\Documents\\Noorteck\\Selenium\\chromedriver.exe";
		
		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Step 1. Verify the page is "Alerts"
		String title = driver.getTitle();
		if (title.equals("Alerts")) {
			System.out.println("Title is Correct -- Alerts");
		} else {
			System.out.println("Title is incorrect...");
		}
		// Step 2. Click "Alert with Text-box"
		driver.findElement(By.xpath("//a[text() = 'Alert with Textbox ']")).click();
		// Step 3. click the "click the button to demonstrate the prompt box" button
		driver.findElement(By.xpath("//button[text() = 'click the button to demonstrate the prompt box ']")).click();
		// Step 4. Enter your name in the Alert Field
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("John Cena");
		// Step 5. Click OK
		alert.accept();
		// step 6. refresh the page
		driver.navigate().refresh();
		// Step 7. Click "alert with ok & cancel" button
		driver.findElement(By.xpath("//a[text() = 'Alert with OK & Cancel ']")).click();
		// Step 8. click "click the button to display a confirm box" button
		driver.findElement(By.xpath("//button[text() = 'click the button to display a confirm box ']")).click();
		// Verify the text in the alert contains "Press a Button !"
			// if true, then click "Cancel"
			// if false, then click "OK"
		String alertText = alert.getText();
		if (alertText.equals("Press a Button !")) {
			System.out.println("Alert is correct");
			alert.dismiss();
		} else {
			System.out.println("Actualy the alert says: " + alertText);
			alert.accept();
		}
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
