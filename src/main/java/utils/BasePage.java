package utils;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class BasePage {

	protected WebDriver driver;


	public BasePage() {
		
		System.out.println("Start of Base Page");

		String chromedriverPath = System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe";        
		// Set the system property
	System.out.println("chrome");
	System.out.println(chromedriverPath);
		
		System.setProperty("webdriver.chrome.driver", chromedriverPath);
		this.driver = new ChromeDriver();
		System.out.println("End of Base Page!!!");

	}

	public WebDriver getDriver() {

		return driver;

	}

}
