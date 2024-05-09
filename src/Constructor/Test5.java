package Constructor;
//method vs Constructor
public class Test5 
{

	Test5()//Constructor
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) 
	{
		Test5 t5=new Test5();
		t5.m1();
		
	}
	
	public void m1()
	{
		System.out.println("Hi");
	}

}
