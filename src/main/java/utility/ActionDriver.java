package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import config.StartBrowser;

public class ActionDriver extends StartBrowser {
	
	public static void Click(String locator)
	{
		WebElement element= driver.findElement(By.xpath(locator));
		element.click();
	}
	
public static void horvermouse(String locator, String value)


{
	WebElement element=	 driver.findElement(By.xpath(locator));
	Actions act = new Actions(driver);
	act.moveToElement(element).perform();
	driver.findElement(By.xpath(value)).click();

}

public static String text(String locator)
{
	WebElement element = driver.findElement(By.xpath(locator));
	String taxt=element.getText();
	return taxt;
}

}
