package oops.abstractiontopic.interfacetopic.task1;
import java.util.Scanner;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Person person = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter beloww choice : ");
		System.out.println("1) For School");
		System.out.println("2) For PublicPlace");
		System.out.println("3) For Org");
		int choice = sc.nextInt();
		switch(choice) 
		{
			case 1:
					// Polymorphic Object
					// Parent reference--->Child obj--->Upcasting
					person =  new School();
					person.getBehave();
					
					// Downcasting
					School s = (School)person;
					s.getResult();
					break;
					
			case 2: person =  new  PublicPlace();
					person.getBehave();
					
					PublicPlace  p = (PublicPlace)person;
					p.getCleanEvent();
					break;
					
			case 3:	person = new Org();
					person.getBehave();
					
					Org o = (Org)person;
					o.getWorkAllocation();
					
					o.test1();
					break;
		}
		Person.test2();
	}
}