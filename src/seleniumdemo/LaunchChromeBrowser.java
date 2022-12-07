package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChromeBrowser {
	
	static WebDriver driver;	

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karimbedu\\Documents\\Libs\\chromedriver.exe");
	driver = new ChromeDriver();
	
	}

}
