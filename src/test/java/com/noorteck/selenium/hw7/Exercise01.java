package com.noorteck.selenium.hw7;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise01 {
	
	public static void main(String[] args) throws InterruptedException {
		

		String key = "webdriver.chrome.driver";
		String path = "C://Users//chefa//Desktop//Documents//Noorteck//Selenium//chromedriver.exe";
		String url = "http://demo.automationtesting.in/Windows.html";
		
		System.setProperty(key, path);
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
		// Set parentWindow
		String parentWindow = driver.getWindowHandle();
		
		// 1. Verify the page title equals "Frames & windows"
			// if true --> "we are in correct page"
			// if false--> "we are in wrong page, but I will continue with my automation"
		String expTitle = "Frames & windows";
		String title = driver.getTitle();
		if (title.equals(expTitle)) {
			System.out.println("we are in correct page");
		} else {
			System.out.println("we are in wrong page, but I will continue with my automation");
		}
		
		// 2. Open Separate Multiple Windows Button
		driver.findElement(By.xpath("//a[@href = '#Multiple']")).click();
				
		// 3. Click "Click" Button
		driver.findElement(By.xpath("//button[text() = 'click ']")).click();
		Thread.sleep(2000);
		
		// 4. Click "Open New Tabbed Windows" Button
		driver.findElement(By.xpath("//a[text() = 'Open New Tabbed Windows ']")).click();
		
		// 5. Click "Click" Button
		driver.findElement(By.xpath("//button[text() = '    click   ']")).click();
		
		// 6. Switch control to page that has page title as "Index"
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			driver.switchTo().window(window);
			String currTitle = driver.getTitle();
			if (currTitle.equals("Index")) {
				break;
			}
		}
		
		// 7. Verify the page title is equal to "Index"
			//if true	--> print "We are in index page"
			//if false	--> print "not all elements display"
		title = driver.getTitle();
		expTitle = "Index";
		if (title.equals(expTitle)) {
			System.out.println("we are in index page");
		} else {
			System.out.println("not in index page");
		}
		
		// 8. verify the sign in button & skip button are displayed
		WebElement signInButton = driver.findElement(By.cssSelector("#btn1"));
		WebElement skipButton = driver.findElement(By.cssSelector("#btn2"));
		
		boolean signIsDisplayed = signInButton.isDisplayed();
		boolean skipIsDisplayed = skipButton.isDisplayed();
		
		if (signIsDisplayed == true && skipIsDisplayed == true) {
			System.out.println("all elements displayed");
		} else {
			System.out.println("not all elements displayed");
		}
		
		// 9. close only index page
		driver.close();
		
		// 10. Switch control to page that has page title as "Selenium"
		for (String window : allWindows) {
			driver.switchTo().window(window);
			String currTitle = driver.getTitle();
			if (currTitle.equals("Selenium")) {
				break;
			}
		}
		
		// 11. Verify the page title is equal to "Selenium"
		title = driver.getTitle();
		expTitle = "Selenium";
		if (title.equals(expTitle)) {
			System.out.println("Page title is Selenium");
		} else {
			System.out.println("Nope");
		}
		
		// 12. Click on the "Documentation" Link
		driver.findElement(By.xpath("//span[text() = 'Documentation']")).click();
		
		
		// 13. Verify if "The Selenium Browser Automation Project" is displayed on the page
				// if true "Woooow, once I am done here I will raed all the availbable documents
				// otherwise "I am still going to read all the available documents"
		String statement = "The Selenium Browser Automation Project";
		List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(), 'The Selenium Browser Automation Project')]"));
		if (!elements.isEmpty()) {
			System.out.println("Woooow, once I am done here I will read all the available documents");
		} else {
			System.out.println("I am still going to read all the available documents");
		}

		// 12. Close the Selenium Window
		driver.close();
		
		// 13. Switch control to the parent window
		driver.switchTo().window(parentWindow);
		
		// 14. Verify the parent window page title equals "Frames & windows"
			// if true "I am done, now need to read Selenium documentation"
			// otherwise "Selenium Documentation..."
		expTitle = "Frames & windows";
		title = driver.getTitle();
		if (title.equals(expTitle)) {
			System.out.println("I am done, now need to read Selenium documentation");
		} else {
			System.out.println("Selenium Documentation....");
		}
		
		// 15. quit driver
		Thread.sleep(3000);
		driver.quit();
				
	}

}
