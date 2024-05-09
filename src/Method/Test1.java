package Method;

public class Test1 {
    
	//Method : 1)Main method 
	         //2)Reguluar Method----->a)Static Reguluar Method  b)Non-Static Reguluar Method
	         //a)Static Reguluar Method----->Static Reguluar Method from same class
	         //b)Static Reguluar Method----> Static Reguluar Method from differnt class  
	
	public static void main(String[] args) 
	{
		
            m1();
            m2();
            m3();//methodname
	}
	           //Static Reguluar Method infinite method write it in this class
	
	public static void m1()
	{
		System.out.println("Hi");
		
	}
	
	public static void m2()
	{
		System.out.println("Hello");
		
	}
	
	public static void m3()
	{
		System.out.println("How Are You");
		
	}
}
