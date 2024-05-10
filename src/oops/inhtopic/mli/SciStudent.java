package oops.inhtopic.mli;

import java.util.Scanner;

public class SciStudent extends Student
{
	String specialSubject;
	public void scanData() 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Special Subject : ");
		specialSubject = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(rno +" " + name +" " + std+" " + specialSubject);
	}
	public static void main(String[] args) 
	{
		SciStudent s = new SciStudent();
		
		s.scanData();
		s.dispData();
	}
}
