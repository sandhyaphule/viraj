package Inheritance1;
//3) Hierarchical Inheritance

public class Test 
{

	public static void main(String[] args) 
	{
		
		son1 s1=new son1();
		s1.Bike();
		s1.Car();
		s1.Home();
		s1.Money();
		System.out.println("---------");
		
		son2 s2=new son2();
        s2.Laptop();
        s2.Car();
        s2.Home();
        s2.Money();
        System.out.println("----------");
        
		son3 s3=new son3();
		s3.Mobile();
		s3.Car();
		s3.Home();
        s3.Money();
		
		
	}

}
