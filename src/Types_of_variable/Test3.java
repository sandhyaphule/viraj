package Types_of_variable;

public class Test3 
{
	int c=50;             //Non-static global variable


	public static void main(String[] args) //main method 
	{
       //step |:Create object from same class example
		
		Test3 t3=new Test3();//classname.objectname=new classname();
		
		//setp ||:call the method   
		
		System.out.println(t3.c);//objectname.variablename();
		
	}
    public static void m1()//static regular method
    {
		//setp |:create object from same class  
           Test3 t4=new Test3();//classname.objectname=new classname();
           
         //objectname.variablename();
          System.out.println(t4.c);
    }
    public void m2()
    {
    	System.out.println(c);//variablename;
    }
}
  