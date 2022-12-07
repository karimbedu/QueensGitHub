package testngtutorial;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_AlphabaticalOrder {
	WebDriver driver;

	@Test
	public void redmine() {
		driver.get("https://www.redmine.org");
	}
	@Test
	public void google() {
		driver.get("https://www.google.com");		
	}	
	
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void gmail() {
		driver.get("https://www.gmail.com");
	}
	
	@Test
	public void seleniumdev() {
		driver.get("https://www.selenium.dev");
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\ABC\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
