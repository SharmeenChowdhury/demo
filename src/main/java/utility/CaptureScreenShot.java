package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import config.StartBrowser;

public class CaptureScreenShot extends StartBrowser {
	
	
	public static void screenShotname(String ScreenShotname) throws Exception
	{
		TakesScreenshot tk =  (TakesScreenshot)driver;
		
		
		File source= tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(source, new File( "./GetScreenShot/"+ScreenShotname+".png" ));
		
		
		
		
	}
	
	
	
	
	
	

}
