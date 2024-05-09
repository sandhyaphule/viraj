package Interface;

public interface Sample2 
{
	default void m1()//abstarct public void m2();
	{
		System.out.println("Good night");
			m3();
		}
	
	
	default void m2()//abstarct public void m2();
	{
		System.out.println("Good afternoon");
         m3();
         
			
		}
	
	
	
	private void m3()//abstarct public void m2();
	{
		   System.out.println("Hi");
			System.out.println("Hello");//method defination and implimention
			System.out.println("Good Morning");
			System.out.println("Good night");
			
		}
	
	}


