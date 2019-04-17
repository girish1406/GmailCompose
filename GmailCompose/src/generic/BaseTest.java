package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConst {
       static{
    	   System.setProperty(CHROME_KEY, CHROME_VALUE);
       }
       
       public WebDriver driver;
       
       @BeforeMethod
       public void openApplication(){
    	      driver=new ChromeDriver();
    	      driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
    	      driver.get(URL);
       }
       
       @AfterMethod
       public void closeApplication(ITestResult testResult) throws InterruptedException{
    	   String name = testResult.getName();
    	   int status = testResult.getStatus();
    	       if(status==1){
    	    	   Reporter.log("Test " +name+ "is PASSED",true);
    	       }
    	       else{
    	    	   Reporter.log("Test " +name+ "is FAILED/SKIPPED",true);
    	    	   String path=IMG_PATH+name+".png";
    	    	   FWutil.getPhoto(driver, path);
    	       }
    	       Thread.sleep(5000);
    	       driver.close();
       }
      
       
}
