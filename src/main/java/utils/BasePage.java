package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePage {

  private static WebDriver driver;

    // Visible constructor
    public BasePage() {
        initializeDriver();
    }

    @BeforeClass
    public static WebDriver getDriver() {
        if (driver == null) {
            initializeDriver();
        }
        return driver;
    }

<<<<<<< HEAD
    private static void initializeDriver() {
        String chromedriverPath = System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromedriverPath);
        driver = new ChromeDriver();
    }
=======
		String chromedriverPath = System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe";        
		// Set the system property
	System.out.println("chrome");
	System.out.println(chromedriverPath);
		
		System.setProperty("webdriver.chrome.driver", chromedriverPath);
		this.driver = new ChromeDriver();
		System.out.println("End of Base Page!!!");
>>>>>>> 0131448872e7321723165bec9fa55743a27a5470

    public void takeScreenshot(String fileName) {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotFile, new File(fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @AfterClass
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
