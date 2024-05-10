package oops.polymorphismtopic.cp;

public class TestApp1 
{
	void addFun()
	{
		System.out.println("addFun()");
	}
	void addFun(float no1,float no2)
	{
		System.out.println("addFun(float no1,float no2)");
	}
	void addFun(double no1,double no2)
	{
		System.out.println("addFun(double no1,double no2)");
	}
	void addFun(int no1,int no2,int no3)
	{
		System.out.println("addFun(int no1,int no2,int no3)");
	}
	void addFun(int no1,int no2,int no3,int no4)
	{
		System.out.println("addFun(int no1,int no2,int no3,int no4)");
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1();
		
		obj.addFun('a', 'b');
		
	}
}
