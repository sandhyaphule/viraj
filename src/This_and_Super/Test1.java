package This_and_Super;

public class Test1 extends Test2
{
	//sub class and child class
	//int a=40;
	int a=20;
	int b=30;//this golable non_static variable
	
	
	public void m1()
	{
		int a=10;//non_local variable
		System.out.println(a);//10
		System.out.println(a);//10
		System.out.println(this.a);//this it is access the current object.
		
		System.out.println(this.b);//boyh way are right
		System.out.println(b);
		
		System.out.println(a);
		System.out.println(super.a);
		}
	public static void main(String[] args) 
	{
		Test1 t1=new Test1();
		t1.m1();
	
		//super its keyword access the non staic global variable call into the child class in super keyword
	}

}
