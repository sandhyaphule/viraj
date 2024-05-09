package Interface;

public class testing3 implements Testing1,Testing2
{
    //m1()
	//m1()  multiple inheritnce possible nahi
	public void m1() 
	{
		//Testing1.super.m1();
		Testing2.super.m1();
	}
	
	public static void main(String[] args) 
	{
		testing3 t3=new testing3();
		t3.m1();
		
	}
}
//default method override karto  public write karo 