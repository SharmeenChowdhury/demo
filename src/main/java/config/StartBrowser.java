package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser {
	
	
	public static WebDriver driver;
	
	public static String url="http://automationpractice.com";
	
	
	@BeforeTest
	public static void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.get(url);
	}
			
	
	

}
