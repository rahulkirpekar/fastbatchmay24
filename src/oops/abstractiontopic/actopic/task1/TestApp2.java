package oops.abstractiontopic.actopic.task1;
import java.util.Scanner;
public class TestApp2 
{
	public void getThings(Person p) 
	{
		p.getBehave();

		System.out.println("p obj : " + p);
		
		// // ClassCastException
		if ( p instanceof School) 
		{
			// Downcasting
			School s = (School)p; 
			s.getResult();
			
		}else if(p instanceof PublicPlace) 
		{
			// Downcasting
			PublicPlace pobj = (PublicPlace)p;
			pobj.getCleanEvent();
			
		}
		else if(p instanceof Org) 
		{
			// Downcasting
			Org pobj = (Org)p;
			pobj.getWorkAllocation();
		}
	} 
//	public void getThings(School s) 
//	{
//		s.getBehave();
//		s.getResult();
//	}
//	public void getThings(PublicPlace p) 
//	{
//		p.getBehave();
//		p.getCleanEvent();
//	}
//	public void getThings(Org o) 
//	{
//		o.getBehave();
//		o.getWorkAllocation();
//	}
	public static void main(String[] args) 
	{
		TestApp2 t = new TestApp2();
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
					School s  =  new School();
					t.getThings(s);
					
					break;
					
			case 2: PublicPlace p =  new  PublicPlace();
					t.getThings(p);
					
					break;
					
			case 3:	Org o = new Org();
					t.getThings(o);
					break;
		}
	}
}