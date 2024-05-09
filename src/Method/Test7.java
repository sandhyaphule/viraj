package Method;

public class Test7 
{

	public static void main(String[] args) 
	{
		addition();//methodname
		addition();//methodname
	}
	//Static Reguluar Method--->zero argument/parmeter

	public static void addition ()
	{
		int a=10;
		int b=20;
		int sum1 = a+b;//30
		System.out.println(sum1);//30

	}
	//Static Reguluar Method--->with 2 argument/parmeter

	public static void addition(int c,int d)
	{
		int sum1 = c+d;
		System.out.println(sum1);

	}


}
