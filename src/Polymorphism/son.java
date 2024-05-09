package Polymorphism;
//method_overrding
public class son extends Father
{
	//sub class
	//car()  Money() home()
	//Access the parent method into child class with the help of extend keywords & changining implimention
	//defination according to the child class is called method_overrding..
	
	public void Mobile()//method declaration
	{
		System.out.println("Samsung A50");//method defination and implimention
	}
	public void Car()//method declaration
	{
		System.out.println("kia seltoo");//method defination and implimention
	}
	public void Money()//method declaration
	{

	System.out.println("15 Lakhs");//method defination and implimention

	}
	
	//access modifier
	public void Home()//method declaration
	{
		System.out.println("3 BHK");//method defination and implimention
	}
	 void Gold()
	{
		System.out.println("10 kg");
	}
	 
	 
    protected  void Bike()
	    {
	    	System.out.println("shine");
	    }
   public static void Laptop ()//static method is do not applicable override
    {                          // static method is applicable for overload method
    	System.out.println("Sumsung");
    }
    
}