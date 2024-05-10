package oops.finaltopic.lvari;

public class TestApp1 
{
	final int no ;
	
	public TestApp1() 
	{
		no = 10;
	}
	public TestApp1(int no) 
	{
		this.no = no;
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1(100);
		
		System.out.println("obj.no : " + obj.no);
	}
}
