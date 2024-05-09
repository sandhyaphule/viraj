package Abstract_class;

public class Test3 extends Test2
{
	//complete/concernt class
	//m1()  m2()  m3()  m4()
	
	public void m1()//method declaration
	{
		System.out.println("Hi..Hello...Good Morning");//method defination and implimention
	}
	
	//complete method 
	public void m2()//method declaration
	{
		System.out.println("Good Afternon");//method defination and implimention
	}
	
	//Abstract/Incomplete method 
	public void m3()//method declaratio
	{
		System.out.println("Method M3 is completed in concernt class ");
		
	}
	
	//abstract/Incomplete method 
	public void m4()//method declaratio
	{
		System.out.println("Method M4 is completed in concernt class ");

	}
	
	public static void main(String[] args) 
	{
		Test3 t3= new Test3();
		t3.m1();
		t3.m2();
		t3.m3();
		t3.m4();
		
	}

}
