package testngtutorial;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Skip_Disable_Ignore {
	WebDriver driver;

	@Test(priority=1)
	public void redmine() {
		driver.get("https://www.redmine.org");
	}
	@Test(priority=4,enabled=true)
	public void google() {
		driver.get("https://www.google.com");		
	}	
	
	@Test(enabled=false, priority=2)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Test(enabled=false)
	public void gmail() {
		driver.get("https://www.gmail.com");
	}
	
	@Test(priority=0)
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
	}

}
