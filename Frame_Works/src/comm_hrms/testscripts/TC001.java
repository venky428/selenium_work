package comm_hrms.testscripts;

import comm_hrms.lib.General;

import comm_hrms.lib.logout;

public class TC001

{
 public static void main(String[] args)  throws Exception {
	//Test Case Steps
	 General obj=new General();
		obj.openApplication();
		Thread.sleep(3000);
		obj.login();
		Thread.sleep(3000);
	    obj.checkcart();
      
     // logout obj2=new logout();
     //  obj2.logout1();

}
}
