package Types_of_variable;

public class Test2 
{
    static int b=20;//static global variable

	public static void main(String[] args) //main method 
	{
       System.out.println(b);//variablename();
       
	}
    public static void m1()//static regular method
    {
    	System.out.println(b);//variablename();
    }
    public void m2()
    {
    	System.out.println(b);//variablename();
    }
}
