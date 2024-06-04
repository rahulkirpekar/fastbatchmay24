package innerclasstopic.mi;

public class A 
{
	private int no1= 100;

	// Member Innerclass
	class B
	{
		void disp() 
		{
			System.out.println("No1 : " + no1);
		}
	}
	public static void main(String[] args) 
	{
		A objA = new A();

		A.B objB = objA. new B();
		
		objB.disp();
	}
}
