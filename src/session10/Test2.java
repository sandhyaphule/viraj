package session10;

public class Test2 
{
	//super class 
	
	//access modifier/specifiers-->public,private,protected,defult
	//member of class-->method,variable,constructor
	//public-->within project
	//private-->within class
	//default-->within package
	//protected-->within package+outside package(inheritance)
	public int a=10;//non_static global variable 
	public void m1()
	{
       System.out.println("hi");
	}
	public static void main(String[] args) 
	{
		Test2 t2= new Test2();
		t2.m1();
		t2.m2();
		t2.m3();
		t2.m4();
		System.out.println(t2.a);
		System.out.println(t2.b);
		System.out.println(t2.c);
		System.out.println(t2.d);
	}
	private int b=20;//non_static global variable
	private void m2()
	{
       System.out.println("hello");
	}
	int c=30;
	 void m3()
	{
       System.out.println("Good morning");
	}
	 
	 protected int d=40;
	 protected void m4()
		{
	       System.out.println("Good afternoon");
		}
	}


