package login;

import UTILIS.java.AppUtils;

public class email1 extends AppUtils{

	public static void main(String[] args) throws InterruptedException {
		email1 mail1 = new email1();
		mail1.LaunchBrowser();
		mail1.LaunchERP();
		mail1.LoginasAdmin();
		mail1.Stock();
		mail1.export();
		mail1.mail();
	

	}

}