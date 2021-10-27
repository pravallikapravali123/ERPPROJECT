package login;

import UTILIS.java.AppUtils;

public class csv1 extends AppUtils {

	public static void main(String[] args) {
		csv1 scv = new csv1();
		scv.LaunchBrowser();
		scv.LaunchERP();
		scv.LoginasAdmin();
		scv.Stock();
		scv.export();
		scv.csv();


	}

}
