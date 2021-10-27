package TESTNGDEMO;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import UTILIS.java.AppUtils;

public class LOGInPG extends AppUtils
{
	
@BeforeMethod
public void TC_1() 
  {
	LOGInPG Verify_Launch_browser = new LOGInPG();
	Verify_Launch_browser.LaunchBrowser();
  }
@Test

public void TC_2()
{
	LOGInPG verify_Launch_app = new LOGInPG();
	
	verify_Launch_app. LaunchERP();
}

@Test
public void TC_3()
{
	LOGInPG verify_admin_login_with_valid = new  LOGInPG();
	verify_admin_login_with_valid. LaunchERP();
	verify_admin_login_with_valid.LoginasAdmin();
}

@AfterMethod
public void TC_4()
{
	LOGInPG close = new LOGInPG();
	close.close();

}
}

