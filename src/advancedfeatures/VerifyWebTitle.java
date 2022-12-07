package advancedfeatures;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class VerifyWebTitle {
	WebDriver driver;

	@Test(enabled=true)
	public void verifygoogleTitle() {
		driver.get("https://www.google.com");
		
		String exp = "Google";
		System.out.println("Google Expected Web Title is :"+exp);
		
		String act= driver.getTitle();
		System.out.println("Google Actual Web Title is :"+act);
		
		Assert.assertEquals(act, exp);		
	
	}
	
	@Test(enabled=true)
	public void verifygoogleURL() {
		driver.get("https://www.google.com");
		
		String expurl = "https://www.google.com/";
		
		String acturl = driver.getCurrentUrl();
		
		Assert.assertEquals(acturl, expurl);		
	
	}
	
	@Test
	public void verifyText() {		
		driver.get("https://www.redmine.org/");
		
		String exphome = "Home";
		
		String acthome = driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[1]/a")).getText();
		
		Assert.assertEquals(acthome, exphome);
		
		String expproject = "Projects";
		
		String actproject = driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[2]/a")).getText();
		
		Assert.assertEquals(actproject, expproject);	
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\ABC\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
