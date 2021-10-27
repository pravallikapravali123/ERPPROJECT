package login;

import UTILIS.java.AppUtils;

public class stockad extends AppUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stockad pge = new stockad();
		pge.LaunchBrowser();
		pge.LaunchERP();
		pge.LoginasAdmin();
        pge.stockcatadd();
		
	}

}
