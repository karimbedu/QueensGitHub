package junitdemo;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitTestScript {
	
static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\ABC\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Disabled
	@Test
	void redmine() throws Exception {
		driver.get("https://www.redmine.org/login");
		Thread.sleep(4000);		
		driver.findElement(By.id("username")).sendKeys("poojitha");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Hello@123");
		Thread.sleep(2000);
		driver.findElement(By.id("autologin")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		
	}
	@Disabled
	@Test
	void prakampanam() throws Exception {
		driver.get("http://prakampanam.com/user");
		Thread.sleep(3000);		
		driver.findElement(By.id("edit-name")).sendKeys("Sindhu"); // id 
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Hello");     // name
		Thread.sleep(2000);
		//driver.findElement(By.className("form-submit")).click();   // className
	//	driver.findElement(By.cssSelector("input.form-submit")).click();  // cssSelector
		driver.findElement(By.cssSelector(".form-submit")).click();
	}
	
	@Disabled
	@Test
	void linkTextandpartialLinkText() throws Exception {
		driver.get("http://hyderabadreport.com/");
		Thread.sleep(3000);	
		driver.findElement(By.linkText("Photos")).click(); // linkText
		Thread.sleep(3000);	
		driver.findElement(By.partialLinkText("Greater")).click(); // partialLinkText
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Us")).click();		
	}
	
	@Disabled
	@Test
	void totalnumoflinks() throws Exception {
		driver.get("http://hyderabadreport.com/");
		Thread.sleep(3000);			
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Number Of Links on HydReport Website :"+totallinks.size());
		
	}
	
	@Test
	void xpathtraining() throws Exception {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(5000);	
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("poojitha");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("QueensAreSuperBatch");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[3]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu-375-3\"]/a")).click();
		
		
		
	}
	

}
