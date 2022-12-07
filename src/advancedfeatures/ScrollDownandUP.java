package advancedfeatures;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class ScrollDownandUP {
	WebDriver driver;

	@Test
	public void ScrollDown() throws Exception{
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
         jse.executeScript("scroll(0, 1000)"); // Y value is scroll down
         Thread.sleep(3000);
		
	}
	
	@Test
	public void ScrollUp() throws Exception{		
		Thread.sleep(3000);		
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
         jse.executeScript("scroll(1000, 0)"); // Y value is scroll down
		
	}
	
	@Test 
    public void IndentifyLoacatorElement() throws Exception {
    driver.get("https://www.selenium.dev/downloads/");
  
    {
        WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[10]/div/div/p/a"));
        Coordinates coordinate = ((Locatable)element).getCoordinates(); 
        coordinate.onPage(); 
        coordinate.inViewPort();
         }    
      }

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\ABC\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
