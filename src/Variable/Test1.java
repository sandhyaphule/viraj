package Variable;

public class Test1 {

	public static void main(String[] args) 
	{
		//data type 
		//primitive--->byte,short,int,long,float,double,char,boolean
		//primitive--->float,double(numaric+decimal)---->45.67
		//non primitive--->string
		
		//variable declration and intilization
		String studentname = "virat";
		int studentRollNo = 20;
		char studentgrade = 'a';//
		float studentpracentage =70.43f;
				
	    //usages
		//System.out.println(studentname);//virat
		//System.out.println(studentRollNo);//20
		//System.out.println(studentgrade);
		//System.out.println(studentpracentage);
		        
		//proper way exceution
		System.out.println("studentname:"+studentname);//virat
		System.out.println("studentRollNo:"+studentRollNo);//20
		System.out.println("studentgrade:"+studentgrade);//a
		System.out.println("studentpracentage:"+studentpracentage+"% " );//70.43f
	}
}