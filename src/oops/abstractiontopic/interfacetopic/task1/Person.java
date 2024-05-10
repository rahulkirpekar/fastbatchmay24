package oops.abstractiontopic.interfacetopic.task1;

public interface Person 
{
	// Constant Variables---[public static final]
	public final int NO = 100;//---[public static final]
	
	public void getBehave();// [public abstract]
	// Non--Abstract method
	// default method---access by child object
	
	default void test1() 
	{
		System.out.println("START :: Person---default--test1()");
		test3() ;
		test3() ;
		System.out.println("EXIT :: Person---default--test1()");
	}
	// static method
	static void test2() 
	{
		System.out.println("Person---static---test2()");
	}
	// private method
	private void test3() 
	{
		System.out.println("Person---private---test3()");
	}
}
