package Method;

public class Test4 
{
	
	public static void main(String[] args) 
	{
		//step |:Create object from same class example
		
		         Test4 s1=new Test4();//classname objectname=new classname();

		         
		         
	    //setp ||:call the method     
	   
		     s1.m1();//objectname.methodname
		     s1.m2();//objectname.methodname
		     
	}                                            // do not call directly bcz of non ststic method 
	// b)Non-Static Reguluar Method
	public void m1()
	{
		System.out.println("Good Night");
	}
	
	// b)Non-Static Reguluar Method
		public void m2()
		{
			System.out.println("Hi...Hello...Good Morning");
		}
}
