package generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FWutil {
       public static void getPhoto(WebDriver driver,String path){
    	   try {
    	   TakesScreenshot tc=(TakesScreenshot) driver;
    	   File srcFile = tc.getScreenshotAs(OutputType.FILE);
    	   File destFile=new File(path);
		   FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
       }
}
