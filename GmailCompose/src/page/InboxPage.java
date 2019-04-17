package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InboxPage {
       @FindBy(xpath="//div[text()='Compose']")
       private WebElement compBTN;
       
       @FindBy(xpath="//textarea[@name='to']")
       private WebElement toTB;
       
       @FindBy(xpath="//input[@name='subjectbox']")
       private WebElement subTB;
       
       @FindBy(xpath="//div[@role='textbox']")
       private WebElement msgTB;
       
       @FindBy(xpath="//div[text()='Send']")
       private WebElement sendBTN;
       
       public InboxPage(WebDriver driver){
    	   PageFactory.initElements(driver, this);
       }
       
       public void clickCompose(){
    	   compBTN.click();
       }
       
       public void setTO(String to){
    	   toTB.sendKeys(to);
       }
       
       public void setSub(String sub){
    	   subTB.sendKeys(sub);
       }
       
       public void WriteMsg(String msg){ 
       msgTB.sendKeys(msg);
       }
       
       public void clickSend(){
    	   sendBTN.click();
       }
       
}
