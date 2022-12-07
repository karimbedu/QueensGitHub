package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitTutorial {
	
	static WebDriver driver;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\ABC\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}		

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		//driver.close();
		driver.quit();
	}

	@Disabled // Junit 5
	@Test
	void testcase1() {
		driver.get("https://www.google.com");
	}
	
	@Test
	void testcase2() {
		driver.get("https://www.facebook.com");		
	}
	
	@Ignore  // Junit 3 & 4
	@Test
	void testcase3() {
		driver.get("https://www.redmine.org");		
	}
	
	@Test
	void testcase4() {
		driver.get("https://www.jira.com");		
	}	

}
