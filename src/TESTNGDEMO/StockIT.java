package TESTNGDEMO;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import UTILIS.java.AppUtils;

public class StockIT extends AppUtils {
  @BeforeMethod()
  
  public void TC_5() 
  {
	  StockIT Launch = new StockIT();
	  Launch.LaunchBrowser();
	  Launch.LaunchERP();
	  Launch.LoginasAdmin();
	 
  }
  @AfterMethod()
  public void logout()
  {
	  StockIT close = new StockIT();
	  close.close();
  }
  
 @Test()
 
 public void TC6_Verify_admin_is_able_to_access_StockItems_page() throws Throwable 
 {
	 StockIT stp = new StockIT();
	 stp.Stock();

}
 
 @Test()
 
 public void TC_7_stkad()
 {
	 StockIT stkad1 = new StockIT();
	 stkad1.Stock();
	 stkad1.stockitemaddbutton();
	 stkad1.addstock();
 }

 @Test()
 public void TC_8_Seacrhsat()
 
 {
	 StockIT catsea = new StockIT();
	 catsea.Stock();
	 catsea.stockcat_search();
 }
 }

