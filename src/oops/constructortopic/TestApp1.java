package oops.constructortopic;

public class TestApp1 
{
	void test() 
	{
		System.out.println("this : " + this);
	}
	
	public static void main(String[] args) 
	{
		TestApp1 obj1 = new TestApp1();
		TestApp1 obj2 = new TestApp1();
		TestApp1 obj3 = new TestApp1();
		
		System.out.println("obj1 : " + obj1);////oops.constructortopic.TestApp1@24d46ca6
		System.out.println("obj2 : " + obj2);
		System.out.println("obj3 : " + obj3);
		
		obj1.test();		
		obj2.test();		
		obj3.test();
	}
}
