package UTILIS.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppUtilis1 {

	static WebDriver driver;
	
	
	public  void LaunchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public  void LaunchERP(String URL)
	{
		driver.get(URL);

	}

	public  void LoginasAdmin(String UID, String PWD)
	{
		
		
		driver.findElement(By.id("username")).clear();

		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("master");
		
		driver.findElement(By.id("btnsubmit")).click();
}
}