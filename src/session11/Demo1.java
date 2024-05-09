package session11;

import session10.Test2;

public class Demo1 extends Test2
{
	//sub class
	public static void main(String[] args) 
	{
		Test2 t4= new Test2();
		t4.m1();
		//t4.m3();default
		
		System.out.println(t4.a);
		//System.out.println(t4.c);
		
		Demo1 d1= new Demo1();
		d1.m4();
		System.out.println(d1.d);
		
		
	}

}
