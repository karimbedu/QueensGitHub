package sikulidemo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class SikuliTutorial {
	Screen s = new Screen();
	WebDriver driver;

	@Test(enabled = false)
	public void desktopAutomation() throws FindFailed, Exception {

		s.click("F:\\Techlearn\\Sikuli\\Start.PNG");

		Thread.sleep(6000);

		s.click("F:\\Techlearn\\Sikuli\\Wifi.PNG");

		Thread.sleep(3000);

		s.type("F:\\Techlearn\\Sikuli\\Search.PNG", "Sikuli");

		s.dragDrop("F:\\Techlearn\\Sikuli\\AnyDesk.PNG", "F:\\Techlearn\\Sikuli\\Queens.PNG");

	}

	@Test(enabled = true)
	public void WebAutomation() throws Exception {
		driver.get("http://seleniumlearn.com/");
		Thread.sleep(5000);
		s.click("F:\\Techlearn\\Sikuli\\Mysql.PNG");
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\ABC\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
