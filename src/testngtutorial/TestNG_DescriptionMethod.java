package testngtutorial;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_DescriptionMethod {
	WebDriver driver;

	@Test(enabled=false,priority=0,description="Home,Projects,Help Menus")
	public void TestCase1() {
		driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[3]/a")).click();		
	}
	
	@Test(description="Register and Sign-in",enabled=false,priority=1)
	public void TestCase2() {
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();				
	}
	
	@Test(priority=3,description="Search",enabled=true)
	public void TestCase3() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("Java"+Keys.ENTER);
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys(Keys.ENTER);
				
	}
	
	@Test(priority=4,description="Search",enabled=true)
	public void TestCase4() throws Exception {
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Selenium Training institute in Tirupati");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);				
	}
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\ABC\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://www.redmine.org");
	}

	@AfterTest
	public void afterTest() {
	}

}
