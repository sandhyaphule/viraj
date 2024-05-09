package Constructor;

public class Test3 {

	public static void main(String[] args) 
	{
		Test2 t2=new Test2 ();
	    t2.addition();//50
	    t2.multification();//400
	    
	    
		Test2 t3= new Test2(20,50);
		t3.addition();//50
	    t3.multification();//400
	    
	}

}
