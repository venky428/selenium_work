package comm_hrms.lib;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class General extends Global {
	
	
	
	
	//Re-Usable functions:
	public   void openApplication() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("application opened");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	System.out.println("k");

	
	}
	public void login() 
	{
	System.out.println("ready for login");
	driver.findElement(By.linkText(loginbutton)).click();
	System.out.println("ready for login1");
	driver.findElement(By.xpath(loginname)).sendKeys(un);
	driver.findElement(By.xpath(Password)).sendKeys(pw)	;
	driver.findElement(By.xpath(btn_login)).click()	;
	System.out.println("log in completed");

	
	}
	public void checkcart()  throws Exception
	{ 
	          try {
	        	  System.out.println("ready for checkcart");  
	        	 driver.findElement(By.className(checkcart)).click();
	        	 Thread.sleep(3000);
	        	 driver.findElement(By.xpath("//img[@title='Flipkart']")).click();
	        	 Thread.sleep(3000);
	        	 Actions a1 = new Actions(driver);
	        	  a1.moveToElement(driver.findElement(By.xpath("//li[@data-key='men']/a/span"))).build().perform();
	        	  Thread.sleep(3000L);
		
	          }catch(Exception e) {
		 File snap=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap,new File ("C:\\FFOutput\\Screen Record\\photo.jpeg"));
			
         }
	}
	public void logout()  
	{
		//driver.findElement(By.linkText(link_logout)).click();
		System.out.println("logout");
	}
		public void closeApplication() 
		{
			driver.close();
		}		}

