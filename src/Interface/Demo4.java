package Interface;

public interface Demo4 //1.8
{
	//1.7 version-->public abstract(method) ,variable
	//1.8 version-->static method ,defualt method
	//1.9 version -->private method are parmition
     void m1();//abstarct public void m1();
	
	
     public void m2();//abstarct public void m2();

      abstract void m3();//abstarct public void m3();
      
      abstract public void m4();//abstarct public void m4();
      
      //complate method
      default void m5()//method declaration
      {
    	               //method defination and implimention
      }
     
       
       public static void m6()  ////method declaration
       {
    	   System.out.println("Hi");//method defination and implimention

       }
       
       public static void main(String[] args) 
       {
    	   
		
	  }
       
       
       private void m7()
       {
    	 System.out.println("Hello");  
       }
	
      int a= 10;//final public static int a=10;
	//	//constructer concept is  not paresent inside  Interface

}




