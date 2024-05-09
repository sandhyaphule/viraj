package session10;

public class Test3 
{

	public static void main(String[] args) 
	{
		Test2 t3= new Test2();
		t3.m1();
		//t3.m2(); do not access in other class bcz of scope of within  class
	
		
		System.out.println(t3.a);
		//System.out.println(t3.b);do not access in other class bcz of scope of within  class
	}

}
