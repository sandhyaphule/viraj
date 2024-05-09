package practices;

public class Test2 
{
	public static void main(String[] args) 
	{
		String s="velocity,velocity,velocity,velocity,velocity";
		
		int count=0;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			
			if(s.charAt(i)=='c')
			{
				count++;
			}
			}
			System.out.println(count);

		}
}
		
	
//		String s="sandhya,sandhya,sandhya,sandhya";
//	     int count=0;
//	 for(int i=s.length()-1;i>=0;i--)//>symbol is grather than 
//		 {
//	if(s.charAt(i)=='d')
//	{
//	count++;
//	}
//	 }
//	System.out.println(count);
//	}
//}
//
//
//
