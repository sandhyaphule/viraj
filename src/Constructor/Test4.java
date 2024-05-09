package Constructor;

public class Test4 
{
	//why do we need Constructor
     String studentname;         //Non-static global variable
     int studentRollnum;      //Non-static global variable
     
     Test4(String studentname,int studentRollnum )
     {
    	 this.studentname=studentname;
    	 this.studentRollnum=studentRollnum;
     }

	public static void main(String[] args) 
	{
      Test4 t4=new Test4("sandhya" ,19);
      Test4 t5=new Test4("madhura" ,24);
      Test4 t6=new Test4("manoj", 04);
      

      
	}

}
