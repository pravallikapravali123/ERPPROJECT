package Test;

import org.openqa.selenium.By;
import loginpom.loginpom1;


public class testClass {

	public static void main(String[] args) {
		
		
loginpom1.launchbrowsererp();
loginpom1.launcherp(loginpom1.URL);
loginpom1.LoginasAdmin("admin", "master");

	}

}
