package exceptiontopic.customexception;

public class TestApp1 
{
	public static void isValidForVote(int age) //throws InvalidAgeException
	{
		if(age < 18) 
		{
			// raise exception
			throw new InvalidAgeException("Invalid age,\n\tPlease enter valid Age");
		}else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("START :: Main Method");
		try 
		{
			isValidForVote(10);
		} catch (InvalidAgeException e) 
		{
			System.out.println("Catch Block handled");
			e.printStackTrace();
		}
		System.out.println("General Statements");
		System.out.println("EXIT :: Main Method");
	}
}