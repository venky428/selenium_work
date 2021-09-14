package oops;

import java.util.Scanner;

public class Encapsulation2
{  
	private int   branchid;
	private String branch_name;
	private String customer_name;
	private int balance;
	
	
	
	

	
	public int getBranchid()
	{
		return branchid;
	}
	public void setBranchid(int branchid) 
	{
		this.branchid = branchid;
	}
	public String getBranch_name()
	{
		return branch_name;
	}
	public void setBranch_name(String branch_name)
	{
		this.branch_name = branch_name;
	}
	public String getCustomer_name()
	{
		return customer_name;
	}
	public void setCustomer_name(String customer_name)
	{
		this.customer_name = customer_name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int i)
	{
		this.balance = i;
	}
	
	
	
	public  static void main (String args[])
	{
		Encapsulation2 bank=new Encapsulation2();
		Scanner  input =new Scanner(System.in);
		System.out.println("enter branch id ");  
		bank.setBranchid(input.nextInt());
		System.out.println("enter branch name");
		bank.setBranch_name(input.next());
		
		System.out.println("you name ");
		bank.setCustomer_name(input.next());
		
		System.out.println("your deposite balance please");
	bank.setBalance(input.nextInt());
		
		
		
		System.out.println("branch name is" +bank.getBranchid());
		System.out.println("your branch name is" +bank.getBranch_name());
		System.out.println("yourname   "+bank.getCustomer_name());
		System.out.println("you eposited balance"+bank.getBalance());
		
			
	}
	
	
}	
	
	
	
	
	
	
	
	
	
	

