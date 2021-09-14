package oops;

public class Overloading   extends Encapsulation      implements  Interface 

{      //Override syntax 
    public int venky(int a,int b)
    {
    System.out.println(a+b );
    	return 0;
    }
     public int venky (int b )
     {
    	 System.out.println("override float " +(b));
		return 0;
	}
     
   final   public void venky(String name,int a)
     {
    	 System.out.printf( name,  (+a)); 
    	
     }
    
    
     public void mani()
     {
    	 System.out.println("absract class method called");
     }
     
     public void interface1()
     {
    	 
     }
     @java.lang.Override
     public void inerface2() 
     {
     	
     }
     public  class Encapsulation
     {

		
     }
     
     
         
public static void main(String[] args)
{
       Overloading obj=new Overloading();
      obj.venky(10,20);
      obj.venky(10,60);
      obj.venky(10);
      obj.venky(100);
      
       obj.venky("yamaha" , 20);
       obj.mani();
        Interface.tharun();
       
        
        
        Encapsulation ride2 = new Encapsulation();
        ((Encapsulation) ride2).main(args);
        
}
}
    
     
        



