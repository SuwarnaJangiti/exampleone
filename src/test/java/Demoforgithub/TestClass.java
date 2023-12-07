package Demoforgithub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
//	public static void main(String[] args) {
//		System.out.println("hellow world");
//	}
	
	WebDriver driver;

	@Test
	public void verifyTitle() {
		// System.out.println("hello");
	// ons.setHeadless(true);
	// WebDrivChromeOptions options=new ChromeOptions();
	// optierManager.chromedriver().setup();
	// //System.setProperty("webdriver.chrome.driver","C:\\Users\\suwarna jangiti\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
	// driver=new ChromeDriver(options);
	// //driver=new ChromeDriver();
	// driver.get("https://www.google.com/");
	// System.out.println("Title is: " +driver.getTitle());
	// driver.quit();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");

		WebDriver driver = new ChromeDriver(options);
		driver.get("http://142.93.213.197");
		System.out.println("Actual Title : "+driver.getTitle());
		driver.quit();
	}
	

}
