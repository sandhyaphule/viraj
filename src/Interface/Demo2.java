package Interface;

public class Demo2 implements Demo1
{
	//implimention class/complate class
	//m1()   m2()  int a=10;
	
public void m1()	
{
	System.out.println("Hi");//method defination and implimention
}

public void m2()   
{
	System.out.println("Hello");//method defination and implimention
}


public static void main(String[] args) 
{
	Demo2 D2=new Demo2();
	D2.m1();
	D2.m2();
	
	
}

}
