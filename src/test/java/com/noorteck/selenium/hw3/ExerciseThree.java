package com.noorteck.selenium.hw3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseThree {

public static void main(String[] args) throws InterruptedException {
		
		String key = "webdriver.chrome.driver";
		String path = "C:\\Users\\chefa\\Desktop\\Documents\\Noorteck\\Selenium\\chromedriver.exe";
		String url = "https://www.amazon.com/";
		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		String expectedTitle = "Amazon.com. Spend less. Smile more.";
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Titles Match");
		} else {
			System.out.println("Title DON'T Match");
		}
		
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement submitButton = driver.findElement(By.id("nav-search-submit-button"));
		searchBar.sendKeys("Head First Java, 2nd Edition");
		submitButton.click();
		
		WebElement book = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		book.click();
		
		WebElement addToCart = driver.findElement(By.xpath("//*[@id='rentButton']"));
		addToCart.click();
		
		String expectedTitleTwo = "Amazon.com Shopping Cart";
		String actualTitleTwo = driver.getTitle();
		
		if (expectedTitleTwo.equals(actualTitleTwo)) {
			System.out.println("Titles Match");
		} else {
			System.out.println("Title DON'T Match");
		}
		
		WebElement checkOut = driver.findElement(By.xpath("//*[@id='sc-buy-box-ptc-button']/span/input"));
		checkOut.click();
		
		String expectedTitleThree = "Amazon Sign-In";
		String actualTitleThree = driver.getTitle();
		
		if (expectedTitleThree.equals(actualTitleThree)) {
			System.out.println("Titles Match");
		} else {
			System.out.println("Title DON'T Match");
		}
		
		
		WebElement emailInput = driver.findElement(By.id("ap_email"));
		WebElement continueButton = driver.findElement(By.id("continue"));
		emailInput.sendKeys("Hello World");
		continueButton.click();
		
		String expectedErrorMessage = "There was a problem";
		String actualErrorMessage = driver.findElement(By.xpath("//*[@id=\'auth-error-message-box\']/div")).getText();
		if (actualErrorMessage.contains(expectedErrorMessage)) {
			System.out.println("The testcase passed.");
		} else {
			System.out.println("The testcase failed");
		}
		
		
		Thread.sleep(5000);
		driver.quit();		
		
	}
	
}
