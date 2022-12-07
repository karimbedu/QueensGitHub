package alertwindow;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class PromptDialogBox {
	WebDriver driver;

	@Test
	public void sendtextokbutton() throws Exception{
		driver.get("http://seleniumlearn.com/prompt-dialog-box");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Deepti");
		Thread.sleep(3000);
		alt.accept();		
		
	/*	driver.switchTo().alert().sendKeys("Queens");
		driver.switchTo().alert().accept(); */
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\ABC\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}

}
