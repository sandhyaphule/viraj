package Inheritance;

public class son extends Father
{
	//sub class/child class
	//car() money() home()
	public void Mobile()
	{
		System.out.println("Samsung A50");


	}
	public static void main(String[] args) 
	{
		son s1= new son();
		s1.Mobile();
		s1.Car();
		s1.Home();
		s1.Money();
		
	}


}
