package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
       @FindBy(xpath="//input[@type='email']")
       private WebElement unTB;
       
       @FindBy(xpath="//span[text()='Next']")
       private WebElement nextBTN;
       
       @FindBy(name="password")
       private WebElement pwTB;
       
       @FindBy(xpath="//span[text()='Next']")
       private WebElement nextBTN2;
       
       public LoginPage(WebDriver driver){
    	   PageFactory.initElements(driver, this);
       }
       
       public void setUN(String un){
    	   unTB.sendKeys(un);
       }
       public void clickNext(){
    	   nextBTN.click();
       }
       public void setPW(String pw){
    	   pwTB.sendKeys(pw);
       }
       public void clickNext2(){
    	   nextBTN2.click();
       }
}
