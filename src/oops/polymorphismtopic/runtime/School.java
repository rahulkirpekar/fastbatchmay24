package oops.polymorphismtopic.runtime;
public class School extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("School---Student--getBehave()");
	}
	public void getResult() 
	{
		System.out.println("School---Student--getResult()");
	}
}
