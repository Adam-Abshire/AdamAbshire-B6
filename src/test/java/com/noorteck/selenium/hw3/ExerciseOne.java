package com.noorteck.selenium.hw3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseOne {
	
	public static void main(String[] args) throws InterruptedException {
		
		String url = "http://demoqa.com/text-box/";
		String key = "webdriver.chrome.driver";
		String path = "C:\\Users\\chefa\\Desktop\\Documents\\Noorteck\\Selenium\\chromedriver.exe";
		
		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		WebElement nameInput = driver.findElement(By.id("userName"));
		WebElement emailInput = driver.findElement(By.id("userEmail"));
		WebElement addressInput = driver.findElement(By.id("currentAddress"));
		WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
		WebElement submitButton = driver.findElement(By.xpath("//*[@id=\'submit\']"));
		
		nameInput.sendKeys("Adam Abshire");
		emailInput.sendKeys("adam.abshire@gmail.com");
		addressInput.sendKeys("1 West Pratt Street Baltimore MD 21201");
		permanentAddressInput.sendKeys("10 Mt. Washington Blvd Baltimore MD 21202");
		Thread.sleep(10000);
		submitButton.click();
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
