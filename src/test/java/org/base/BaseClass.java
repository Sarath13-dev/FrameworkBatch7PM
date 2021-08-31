package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public void getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAM SARATH KUMAR\\eclipse-workspace\\CucumberAfternoonBatch30\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void launcUrl(String url) {
		driver.get(url);
	}

	public void enterText(WebElement element, String text) {

		element.sendKeys(text);
	}

	public void buttonClick(WebElement element) {

		element.click();
	}

}
