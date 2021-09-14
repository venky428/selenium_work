package comm_hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	
	//Test Data available here
	public WebDriver driver;
	public   String  url = "https://www.flipkart.com";
	public String un="9948543132";
	public String pw="15051995";
	
	//objects available here
	public String loginbutton="Login";
	
	public String loginname  =   "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input";
	public String Password   ="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input";
	
	public String btn_login="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button";
	
	//public String link_logout="logout";
	
	
	//Add Items to Cart 
	
	public String addcart="/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/a";
	
	
	//checkcart
	
	public String checkcart= "YUhWwv";
	
	
	//place order
	public String order="//html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1] ";
	
	
	//logout
	
	public String logout="_2gTTdy";
	public String logout2="logout";
	
	
	
	
	
	
	
}
