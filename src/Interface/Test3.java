package Interface;

public class Test3 implements Sample2//simple java class
{
	public void m1()//abstarct public void m2();
	{
		
		Sample2.super.m1();  
		System.out.println("*********************************");
			
		}
	
	
	public void m2()//abstarct public void m2();
	{
		Sample2.super.m2();  
 
			
		}
	
	
	
	public static void main(String[] args) 
	{
		Test3 t3=new Test3();
		t3.m1();
		t3.m2();
		//t3.m3();
		
	}
	
	
	
	private void m3()//abstarct public void m2();
	{
		   System.out.println("Hi");
			System.out.println("Hello");//method defination and implimention
			System.out.println("Good Morning");
			System.out.println("Good night");
			
		}

}
