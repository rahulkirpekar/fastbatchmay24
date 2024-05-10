package oops.polymorphismtopic.runtime;

public class PublicPlace extends Person
{
	@Override
	public void getBehave() 
	{
		System.out.println("PublicPlace---Citizen--getBehave()");
	}
	public void getCleanEvent() 
	{
		System.out.println("PublicPlace---Citizen--getCleanEvent()");
	}
}
