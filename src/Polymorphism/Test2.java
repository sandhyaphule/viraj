package Polymorphism;

public class Test2 
{
	//compiletime Polymorphism-->Method overloading
//method overloading-->Declaring multiple method + same methodname + different argument/parameter

	//public private deafult protected overload kar shkate he
public static void m1()//method declaration
{
	System.out.println("Hi");//method defination and implimention
}
public static void m(int a)//method declaration
{
	System.out.println("Hello");//method defination and implimention
}
public void m1(String studentname)//method declaration
{
	System.out.println("Good Morning");//method defination and implimention
}


public static void m1(int x, int b)//methodname +datatype(argu type) is called method singture..
{
	System.out.println("hello");
}

//same class madhe phije
public void m1(float z)
{
	System.out.println();
}

private void m1(double D)
{
	System.out.println();
}

void m1(double s,int x)
{
	System.out.println();
}

protected void m1 (String sutdentname,double s,int x)
{
	System.out.println();
}
}


