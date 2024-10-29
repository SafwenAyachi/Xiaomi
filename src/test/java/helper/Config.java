package helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	
	public static WebDriver driver;
	public static Actions action;
	public static void confChrome() {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
	}
 
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	
	public static void waitForLoad(int s) {
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	public static void closeBrowser() {
		driver.quit();
	}
}
