package loginpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginpom1 
{
	

	public static WebDriver driver;

	public static String URL = "http://projects.qedgetech.com/webapp/login.php";

			
	public static  void launchbrowsererp()

	{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}

	public static void launcherp(String URL )
	{
		
	driver.get("URL");
	}
		

	public static void LoginasAdmin(String UID, String PWD)
	{
		
		
		driver.findElement(By.id("username")).clear();

		driver.findElement(By.id("username")).sendKeys(UID);

		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(PWD);
		
		driver.findElement(By.id("btnsubmit")).click();
	}


	}


