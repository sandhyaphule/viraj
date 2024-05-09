package Polymorphism;

public class Test3 
{
	public void m1(int a)
	{
		System.out.println(a);
		System.out.println("Hi");
	}
	public void m1(float x)
	{
		System.out.println(x);
		System.out.println("Hello");
	}
	public static void main(String[] args) 
	{
		
		Test3 t3=new Test3();
		t3.m1(10);
		
		t3.m1(20.25f);
		
		t3.m1('a');
		t3.m1('b');//range unicode value=97
	}
}
