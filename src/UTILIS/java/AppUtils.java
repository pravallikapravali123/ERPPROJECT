package UTILIS.java;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Return;

public class AppUtils {
	
 static WebDriver driver;
 
	
public  void LaunchBrowser()
	{
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	
	}
public  void LaunchERP()
	{
		driver.get("http://projects.qedgetech.com/webapp/login.php");
		
	}
public  void LoginasAdmin()
	{
		
		
		driver.findElement(By.id("username")).clear();

		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("master");
		
		driver.findElement(By.id("btnsubmit")).click();

	}
	
public  void Stock()
	{
		WebElement StockItems= 	driver.findElement(By.linkText("Stock Items"));
		
		Actions action= new Actions(driver);
			action.moveToElement(StockItems).build().perform();
			StockItems.click();
		}

public void stockpgview()

{
	

driver.findElement(By.xpath("(//a[@data-original-title='View']) [1]")).click();
		
}

public void stokcpgedit()
{
	driver.findElement(By.xpath("(//[@data-caption='Edit'])[3]")).click();
	Select edit = new Select(driver.findElement(By.id("x_Category")));
	edit.selectByValue("1286");
Select dit = new Select(driver.findElement(By.id("x_Supplier_Number")));
dit.selectByVisibleText("Akhilesnjhyfrdssu");


}
public void stockpgcopy()


{
	driver.findElement(By.xpath("//a[@data-caption='Copy']")).click();
	
}
public void stocksalesdetails(){
	
	driver.findElement(By.xpath("(//a[@data-action='list']) [1]")).click();
}

public void stockpurchasedetails()
{
	
	driver.findElement(By.xpath("(//a[@data-action='list']) [2]")).click();
}
public void stockcatpge()
{
	WebElement StockItems= 	driver.findElement(By.linkText("Stock Items"));
    Actions action= new Actions(driver);
	action.moveToElement(StockItems).build().perform();
	WebElement stockCat = driver.findElement(By.xpath("//li[@id='mmi_a_stock_categories']/following::a[@href='a_stock_categorieslist.php']"));
	Actions cat1 = new Actions(driver);
	cat1.moveToElement(stockCat).build().perform();
	stockCat.click();
}
	
public   void stockcatbutton()
	{
		driver.findElement(By.xpath("(//span[@data-caption='Add'])[1]")).click();
	}
	
public void stockitemaddbutton()
{
	
	driver.findElement(By.xpath("(//a[@data-original-title='Add']) [2]")).click();
}
public  void stockcatadd()
	{
		  
					WebElement StockItems= 	driver.findElement(By.linkText("Stock Items"));
	                Actions action= new Actions(driver);
					action.moveToElement(StockItems).build().perform();
					WebElement stockCat = driver.findElement(By.xpath("//li[@id='mmi_a_stock_categories']/following::a[@href='a_stock_categorieslist.php']"));
					Actions cat1 = new Actions(driver);
					cat1.moveToElement(stockCat).build().perform();
					stockCat.click();
					driver.findElement(By.xpath("//a[@data-caption='Add']")).click();
		            driver.findElement(By.id("x_Category_Name")).sendKeys("mobile as1");
		            driver.findElement(By.id("btnAction")).click();
		            String alterr= driver.getWindowHandle();
		            driver.switchTo().window(alterr);
		            WebElement alterrr=  driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']"));
		             alterrr.click();
		
	}
public  void umes()
	
	{
	      WebElement StockItems= driver.findElement(By.linkText("Stock Items"));
	
	      Actions action= new Actions(driver);
		  action.moveToElement(StockItems).build().perform();
	
		  WebElement unit_of_measurement = driver.findElement(By.xpath("//li[@id='mi_a_unit_of_measurement']"));
		  Actions umess= new Actions(driver);
		  umess.moveToElement(unit_of_measurement).build().perform();
		  unit_of_measurement.click();
	}
public  void export()
	{
		   driver.findElement(By.xpath("//span[@data-caption='Export']"));
		   driver.findElement(By.xpath("(//button[@data-toggle='dropdown'])[1]")).click();
		
	}
public  void mlx()    
     {
    	    driver.findElement(By.linkText("XML"));
    		driver.findElement(By.xpath("//span[@data-caption='Export to XML']")).click();
     }
     
public  void close()

     {
    	     driver.close();
     }
     
public  void mail() 
     {
    	    driver.findElement(By.linkText("Email")).click();
    		driver.findElement(By.xpath("//input[@id='sender']")).sendKeys("pravallikapravali123@gmail.com");
    		driver.findElement(By.xpath("//input[@id='recipient']")).sendKeys("abhinavboyapally@gmail.com");
    		driver.findElement(By.xpath("(//input[@type='text']) [6]")).sendKeys("abhinavboyapally@gmail.com");
    		driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("ExportEmail");
    		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Hello Please find the attached stock items");
    		driver.findElement(By.xpath("(//button[@class='btn btn-primary ewButton'])[6]")).click();
    	
     }
public  void html()
     {
    	      driver.findElement(By.linkText("HTML")).click();
     }
     
public  void csv()
     {
    	     driver.findElement(By.xpath("//a[@data-caption='CSV']")).click();
     }
public  void print()
{
             driver.findElement(By.xpath("//a[@data-caption='Printer Friendly']")).click();
      
}
public  void excel()
    {
    	     driver.findElement(By.xpath("//a[@data-caption='Excel']")).click();
    }

public   void word()
{
	         driver.findElement(By.xpath("//a[@data-caption='Word']")).click();
}

public  void Stockpages()
{
	Select page = new Select(driver.findElement(By.name("recperpage")));
	page.selectByValue("1");
	
	
}

public  void addstock()
{
	
	
	Select add = new Select(driver.findElement(By.id("x_Category")));
	add.selectByVisibleText("LAPTOP");
	

	Select sup = new Select(driver.findElement(By.id("x_Supplier_Number")));
	sup.selectByVisibleText("Reliance");
	
	driver.findElement(By.id("x_Stock_Name")).sendKeys("HATESTORY2");
	Select uom = new Select(driver.findElement(By.id("x_Unit_Of_Measurement")));
	uom.selectByVisibleText("commercial");
	
	driver.findElement(By.id("x_Purchasing_Price")).sendKeys("50000");
	driver.findElement(By.id("x_Selling_Price")).sendKeys("20000");
	driver.findElement(By.id("x_Selling_Price")).sendKeys("20000");
	
	driver.findElement(By.id("x_Notes")).sendKeys("Sam as 12");
    driver.findElement(By.id("btnAction")).click();
    String alter= driver.getWindowHandle();
    driver.switchTo().window(alter);
     WebElement alt=  driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']"));
     alt.click();
   

}
public  void pgno()
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//input[@name='pageno'or @value='1'])[1]")).clear();
	driver.findElement(By.xpath("(//input[@name='pageno'or @value='1'])[1]")).sendKeys("2");
	driver.findElement(By.xpath("(//input[@name='pageno'or @value='1'])[1]")).sendKeys(Keys.RETURN);
} 
public  void savecat()
{
	driver.findElement(By.xpath("//a[@class='ewSaveFilter']")).click();
}

public  void logout()
{
	driver.findElement(By.id("logout")).click();
	String alte= driver.getWindowHandle();
    driver.switchTo().window(alte);
  WebElement altte = driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']"));
  altte.click();
  
}
public void stockcat_search()
{
	WebElement StockItems= 	driver.findElement(By.linkText("Stock Items"));
    Actions action= new Actions(driver);
	action.moveToElement(StockItems).build().perform();
	WebElement stockCat = driver.findElement(By.xpath("//li[@id='mmi_a_stock_categories']/following::a[@href='a_stock_categorieslist.php']"));
	Actions cat1 = new Actions(driver);
	cat1.moveToElement(stockCat).build().perform();
	stockCat.click();
	driver.findElement(By.xpath("//button[@data-caption='Search Panel']")).click();
	driver.findElement(By.name("psearch")).sendKeys("Mobile");
	driver.findElement(By.id("btnsubmit")).click();
}
	
public void auto_serach()
	
	{
		
		driver.findElement(By.xpath("//button[@data-caption='Search Panel']")).click();
		driver.findElement(By.name("psearch")).sendKeys("keyboards");
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.linkText("Exact match")).click();
	    driver.findElement(By.id("btnsubmit")).click();
	}


}







