package comm_hrms.testscripts;

import comm_hrms.lib.General;
import comm_hrms.lib.addcart;

public class TC_003_checkart {
    
	public static void main(String[] args) throws Exception {
		General obj=new General();
		obj.openApplication();
		 obj.login();
		 Thread.sleep(3000);
          obj.checkcart();
         Thread.sleep(3000);
         addcart obj2=new addcart();
          obj2.logout();
          
         
          
          
	}         

}
