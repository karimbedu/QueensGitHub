package log4jdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jTutorial {
	WebDriver driver;

	@Test
	public void Redmine() throws InterruptedException {
		Logger log = Logger.getLogger("Menus");
		PropertyConfigurator.configure("Log4j.properties");

		System.setProperty("webdriver.chrome.driver", "E:\\ABC\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Launching the Chrome Browser");
		driver.manage().window().maximize();
		log.info("Browser window Maximized");
		driver.get("https://www.redmine.org/");
		log.info("Enter the redmine url in browser");
		driver.findElement(By.linkText("Home")).click();
		log.info("Click on Home Menu");
		driver.findElement(By.linkText("Register")).click();
		log.info("Click on Register Link");
		Thread.sleep(3000);
		log.info("Wait for 3 Seconds");
		Thread.sleep(3000);
		driver.quit();
		log.info("Browse closed");
		
		

	}

}
