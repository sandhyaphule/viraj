package Inheritance;

public class Whatsapp 
{
	public static void main(String[] args) 
	{
		Whatsappv1 v1=new Whatsappv1();
		v1.Textmsg();
		System.out.println("-----------");
		
		Whatsappv2 v2=new Whatsappv2();
		v2.Textmsg();
		v2.AudioCalling();
		
		System.out.println("-----------");

		Whatsappv3 v3=new Whatsappv3();
		v3.Textmsg();
		v3.AudioCalling();
		v3.AudioCalling();
		
	}

}
