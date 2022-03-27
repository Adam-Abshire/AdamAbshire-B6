package com.noorteck.selenium.hw3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseTwo {
	
public static void main(String[] args) throws InterruptedException {
		
		String key = "webdriver.chrome.driver";
		String path = "C:\\Users\\chefa\\Desktop\\Documents\\Noorteck\\Selenium\\chromedriver.exe";
		String url = "http://demo.guru99.com/test/newtours/";
		
		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		WebElement register = driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		String expectedTitle = "Register: Mercury Tours";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Titles Match");
		} else {
			System.out.println("Exception on Title Name");
		}
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		WebElement lastName = driver.findElement(By.name("lastName"));
		WebElement phone = driver.findElement(By.name("phone"));
		WebElement email = driver.findElement(By.name("userName"));
		WebElement address = driver.findElement(By.name("address1"));
		WebElement city = driver.findElement(By.name("city"));
		WebElement state = driver.findElement(By.name("state"));
		WebElement postalCode = driver.findElement(By.name("postalCode"));
		WebElement userName = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement confirm = driver.findElement(By.name("confirmPassword"));
		WebElement submit = driver.findElement(By.name("submit"));
		
		firstName.sendKeys("John");
		lastName.sendKeys("Cena");
		phone.sendKeys("123 456 7891");	
		email.sendKeys("JCena@gmail.com");
		address.sendKeys("123 market st.");
		city.sendKeys("Baltimore");
		state.sendKeys("MD");
		postalCode.sendKeys("12345");
		userName.sendKeys("JCena@gmail.com");
		password.sendKeys("happydog");
		confirm.sendKeys("happydog");
		submit.click();
		
		WebElement thankYou = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
		String thankYouMessage = thankYou.getText();
		System.out.println(thankYouMessage);
		
		if (thankYouMessage.contains("Thank you for registering")) {
			System.out.println("Thank you Message contains 'Thank you for registering'");
		} else {
			System.out.println("Thank you Message does NOT contain 'Thank you for registering'");
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
