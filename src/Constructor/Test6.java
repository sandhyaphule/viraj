package Constructor;
//one class multiple Constructor can declared
public class Test6 
{



	Test6()//zero Constructor
	{
		this(10);//this is meaning  current class  call the Constructor using this keyword and excute the current class
	}

	Test6(int a)//one arg Constructor
	{
		this("Virat");
		System.out.println("Hi");
	}

	Test6(String studentname)//string arg Constructor
	{
		this('a');
		System.out.println("hello");
	}
	Test6(char x)//char arg Constructor
	{
		System.out.println("Good morning");
	}

//Constructor name same argu differnt nothing but Constructor overloading

//we can create multiple constuter inside a class and called to be construter
	//with differnt argument
	public static void main(String[] args) 
	{
       Test6 t6= new Test6();
	}

}
