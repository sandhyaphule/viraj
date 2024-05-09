package string;

public class Test1 
{
//string()string is imutable in nature-->non_changeable vs StringBuffer(StringBuffer mutable in nature)-changeable

	public static void main(String[] args) 
	{
		StringBuffer B1= new StringBuffer("Rohit");//rohit b1 madhe store honar 
		
		B1.append("sharma");//using append method rohit+ shrama add kele
		
		System.out.println(B1);//Rohit+sharma
		
		
		 //Q)what is differnce == & .equals vs  StringBuffer(== .equals())
		String s2= new String("Hardhik"); //
		
		String s3= new String("Hardhik");
		
		System.out.println(s2==s3);//false  referance campaire karte == method
		
		System.out.println(s2.equals(s3));//Hardhik  Hardhik-->true .equlas method referance comp karte

		
		

	}

}
