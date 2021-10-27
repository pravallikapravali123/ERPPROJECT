package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exportoption {

	public static void main(String[] args) {
		System.setProperty("weddriver.gecko.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://projects.qedgetech.com/webapp/login.php");

		driver.findElement(By.id("username")).clear();

		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("master");
		
		driver.findElement(By.id("btnsubmit")).click();
WebElement StockItems= 	driver.findElement(By.linkText("Stock Items"));
		
		Actions action= new Actions(driver);
			action.moveToElement(StockItems).build().perform();
			StockItems.click();
			driver.findElement(By.xpath("//span[@data-caption='Export']"));
			   driver.findElement(By.xpath("(//button[@data-toggle='dropdown'])[1]")).click();
			   
			   driver.findElement(By.xpath("//a[@data-caption='CSV']")).click();
			  

	}

}
