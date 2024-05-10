package oops.constructortopic;

public class Student 
{
	// 1) Data members
	int rno;
	String name;
	int std;
	String schoolName;
	int marks;
	
	// DEFAULT--Constructor
	public Student() 
	{
		rno = 1;
		name = "rahul";
		std=12;
		schoolName = "DPS";
		marks=56;
	}
	// PARA-Constructor
	public Student(int rno,String name,int std) 
	{
		this();
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	// PARA-Constructor
	public Student(int rno,String name,int std,String schoolName) 
	{
		this(rno,name,std);
		this.schoolName=schoolName;
	}
	// PARA-Constructor
	public Student(int rno,String name,int std,String schoolName,int marks) 
	{
		this(rno,name,std,schoolName) ;
		this.marks=marks;
	}
	// Copy Constructor
	public Student(Student s) 
	{
		this.rno =  s.rno;
		this.name = s.name;
		this.std =  s.std;
		this.schoolName =  s.schoolName;
		this.marks =  s.marks;
	}
	public void dispData() 
	{
		System.out.println(rno + " " + name +" " + std+ " " +schoolName +" " + marks +"--------------"+this);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student(2, "kunal", 12, "ABC", 100);
		
		s1.dispData();
	}
}