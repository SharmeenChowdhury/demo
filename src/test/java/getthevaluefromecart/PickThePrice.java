package getthevaluefromecart;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utility.ActionDriver;
import utility.CaptureScreenShot;

public class PickThePrice extends ActionDriver{
	
	
	public static String loc_Woman="//a[@title='Women']";
	public static String loc_cart="//img[@class='replace-2x img-responsive'][@title='Faded Short Sleeve T-shirts']";
	public static String loc_addtocart="//a[@data-id-product='1'][@class='button ajax_add_to_cart_button btn btn-default']";
	public static String loc_procedtocheckout="//a[@title='Proceed to checkout']";
	public static String loc_qty="//a[@title='Add']";
	public static String loc_price="//span[@id='total_price']";
	
	
	//@Test
	public static void clickinwoman() throws Exception
	{
		Thread.sleep(2000);
		ActionDriver.Click(loc_Woman);
		Thread.sleep(2000);
		
		
		ActionDriver.horvermouse(loc_cart, loc_addtocart);
		Thread.sleep(2000);
		ActionDriver.Click(loc_procedtocheckout);
		Thread.sleep(2000);
		ActionDriver.Click(loc_qty);
		Thread.sleep(2000);
		
	String Price=	ActionDriver.text(loc_price);
	
		System.out.println(Price);
		Assert.assertEquals(Price,"$35.02");
				
		
		
		
	}
	
	@Test
	public static void clickinwomancolths() throws Exception
	{
		Thread.sleep(2000);
		ActionDriver.Click(loc_Woman);
		Thread.sleep(2000);
		
		
		ActionDriver.horvermouse(loc_cart, loc_addtocart);
		Thread.sleep(2000);
		ActionDriver.Click(loc_procedtocheckout);
		Thread.sleep(2000);
		ActionDriver.Click(loc_qty);
		Thread.sleep(2000);
		
	String Price=	ActionDriver.text(loc_price);
	
		System.out.println(Price);
		Assert.assertEquals(Price,"22.00");
				
	}
	
	
	
	
	
	@AfterMethod
	public static  void Teardown(ITestResult result) throws Exception
	{
		if( ITestResult.FAILURE==result.getStatus())
		{
			CaptureScreenShot.screenShotname(result.getName());
		
	}
	
	
	}
	
	
	

}
