package actionclassfeatures;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class DragAndDrop {
	WebDriver driver;
  @Test
  public void dragdropFeature() throws InterruptedException {
	  driver.get("http://www.seleniumlearn.com/drag-and-drop-html");
	  Thread.sleep(6000);
	  Actions act = new Actions(driver);
	  WebElement source = driver.findElement(By.id("draggable"));
	  WebElement target = driver.findElement(By.id("droppable"));
	  act.dragAndDrop(source, target).build().perform();
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\ABC\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

}
