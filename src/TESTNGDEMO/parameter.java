package TESTNGDEMO;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import UTILIS.java.AppUtilis1;
import UTILIS.java.AppUtils;

public class parameter extends AppUtilis1{

		
		@Parameters({ "browser" })
		@Test
		public void testCaseOne(String browser) {
			System.out.println("browser passed as :- " + browser);
			if (browser.equals("Chrome")) {
				
				parameter brow = new parameter();
				brow.LaunchBrowser();
				
			}
			else {
				
				//base.launchFirefox();
				System.out.println("No Method is available to invoke the non-chorme browser..");
			}
		}
/*
		@Parameters({ "username", "password" })
		@Test
		public void testCaseTwo(String username, String password) {
			System.out.println("Parameter for User Name passed as :- " + username);
			System.out.println("Parameter for Password passed as :- " + password);
		}
		*/
		
		@Parameters({"URL"})
		@Test
		public void testlaunch(String URL)
		{
			parameter lauc = new parameter();
			lauc.LaunchERP(URL);
		}
		
		@Parameters({"username", "password"})
		@Test
		public void testlaunch(String username, String Password)
		{
			parameter lauc = new parameter();
			lauc.LoginasAdmin(username, Password);
		}
		}
	
