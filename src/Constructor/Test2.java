package Constructor;

public class Test2 
{
	//Constructor---> 2)user_defined Constructor-->To intilization Non-static global variable
	
	//1) variable declration 
        int a;//10               //Non-static global variable
        int b;//40                 //Non-static global variable
        
        
	// 2)  variable intilization
        Test2()                     //user_defined Constructor/zero parameter Constructor
        {
        	a=10;
        	b=40;
        }
        
        
        Test2(int x,int y)                     //user_defined Constructor
        {
        	a=x;//20
        	b=y;//50
        }
        
        
	  //  3)usages
        public void addition()
        {
        	int sum1 = a+b;//10+40;
        	System.out.println(sum1);//50
        }
        public void multification()
        {
        	int multivalue = a*b;//10*40;
        	System.out.println(multivalue);//400
        }

      
	

}
