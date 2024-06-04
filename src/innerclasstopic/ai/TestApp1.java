package innerclasstopic.ai;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//	2) Anonymous Innerclass --[Abstract class / interface]
		A obj = new A() 
		{
			public void test1() 
			{
				System.out.println("B : test1()");
			}
		};
		
		obj.test1();
	}
}
