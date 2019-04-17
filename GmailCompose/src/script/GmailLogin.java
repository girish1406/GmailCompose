package script;

  import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.InboxPage;
import page.LoginPage;

public class GmailLogin extends BaseTest {
	   
      @Test
      public void testgmailLogin() throws InterruptedException{
    	  String un = XL.getData(XL_PATH, "GmailLogin", 1, 0);
    	  String pw = XL.getData(XL_PATH, "GmailLogin", 1, 1);
    	  String to = XL.getData(XL_PATH, "ComposeMail", 1, 0);
    	  String sub = XL.getData(XL_PATH, "ComposeMail", 1, 1);
    	  String msg = XL.getData(XL_PATH, "ComposeMail", 1, 2);
    	  LoginPage lp=new LoginPage(driver);
    	  lp.setUN(un);
    	  lp.clickNext();
    	  Thread.sleep(2000);
    	  lp.setPW(pw);
    	  lp.clickNext2();
    	  InboxPage ip=new InboxPage(driver);
    	  ip.clickCompose();
    	  ip.setTO(to);
    	  ip.setSub(sub);
    	  ip.WriteMsg(msg);
    	  ip.clickSend();
      }
}
