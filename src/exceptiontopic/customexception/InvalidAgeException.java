package exceptiontopic.customexception;

// Unchecked Exception
public class InvalidAgeException extends RuntimeException

//Checked Exception
//public class InvalidAgeException extends Exception
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
