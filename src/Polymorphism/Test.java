package Polymorphism;

public class Test 
{
	//overriding concept
//in run time Polymorphism method declaration is binded to the its a method defination 
//at the run time based on object creation so also called late binding & dynamic 
	public static void main(String[] args) 
	{
		son s1=new son();//access the father property method name same but argument differnt depends object
		s1.Mobile();
		s1.Car();
		s1.Home();
		s1.Money();
		
		System.out.println("-----------------");
		
		Father F1=new Father();
		F1.Car();
		F1.Home();
		F1.Money();
		
		

	}

}
