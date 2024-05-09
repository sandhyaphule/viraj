package Casting;

public class Test 
{
	public static void main(String[] args) 
	{
		son s1= new son();
		s1.Car();
		s1.Home();
		s1.Mobile();
		s1.Money();
		System.out.println("**************");
		
	//upcasting-->create the object of son class and provide referance of father class;
		
		father s2= new son();
		s2.Car();
		s2.Home();
		s2.Money();
	}

}
