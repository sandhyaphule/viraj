package string;

public class Test3 
{
//string()string is imutable in nature-->non_changeable vs StringBuffer(StringBuffer mutable in nature)-changeable

	public static void main(String[] args) 
	{
		String s1= new String("Rhoit");
		
		s1.concat("sharma");//Rhoit+sharma concat method is used to add  the string
		
		System.out.println(s1);//Rhoit exsting object change karu shkat nahi 
		
       //Q)what is differnce == & .equals vs  StringBuffer(== .equals())
		String s2= new String("KL Rahul"); //s2 madhe store honar KL Rahul
		
		String s3= new String("KL Rahul");
		
		System.out.println(s2==s3);//false  referance campaire karte == method
		
		System.out.println(s2.equals(s3));//KL Rahul KL Rahul-->true .equlas method content comp karte

	}

}
