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
	ChromeOptions options=new ChromeOptions();
	options.setHeadless(true);
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\suwarna jangiti\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
	driver=new ChromeDriver(options);
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	System.out.println("Title is: " +driver.getTitle());
	driver.quit();
	}
	

}
