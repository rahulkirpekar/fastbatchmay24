package stringtopic.basic;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) throws Exception 
	{
//		1)
//		   System.out.println("Enter Character : ");
//		   int value = System.in.read();// A--65
		   
//		   System.out.println("Value : " + value);//65

//		   char a = (char)value;// SOP(value);---6
		   
//		   System.out.println("Value : " + a);//A
//		   -------------------------------------------
//		   System.out.println("Enter Character : ");
			
//		   char value = (char)System.in.read();// A

//		   System.out.println("value : " + value);// A
//	----------------------------------------------------------------------------------
			Scanner sc = new Scanner(System.in);	
//		2) 
		   System.out.println("Enter Character : ");
		   char value = sc.next().charAt(0);//t
		   
		   System.out.println("value : " + value);// t
	}
}