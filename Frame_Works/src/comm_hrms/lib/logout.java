package comm_hrms.lib;


import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class logout extends Global
{   
	
	 public void logout1() throws IOException, InterruptedException 
	 {   
		
		 try {
			
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 
	WebElement element=driver.findElement(By.className(logout));
	 Actions actions=new Actions(driver);
	 actions.moveToElement(element).perform();
	 driver.findElement(By.linkText(logout2)).click();
	
	 }catch(Exception e)
		 {
		 System.out.println("not executed lgout");
	 }finally
		 {
		
		 }
	
		
	}
}