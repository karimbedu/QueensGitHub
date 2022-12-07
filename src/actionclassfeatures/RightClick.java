package actionclassfeatures;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RightClick {
	WebDriver driver;

	@Test
	public void rightclickonmenu() throws Exception {
		driver.get("http://www.seleniumlearn.com/");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//*[@id=\"menu-386-1\"]/a"))).build().perform();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\ABC\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
