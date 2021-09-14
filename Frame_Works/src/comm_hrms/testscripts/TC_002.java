package comm_hrms.testscripts;

import comm_hrms.lib.General;

public class TC_002 {
	public static void main(String[] args) throws Exception {
	 General obj=new General();
	 obj.openApplication();
	 obj.login();
	 
	 obj.logout();
	 obj.closeApplication();
	 

}
}