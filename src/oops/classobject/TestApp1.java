package oops.classobject;

public class TestApp1 
{
	// 4) main function
	public static void main(String[] args) 
	{
		Student s[] = new Student[5];
		
		System.out.println("s===>"+s);
		
		for (int i = 0; i < s.length; i++)
		{
			s[i] = new Student();
			
			s[i].scanData();
		}
		for (int i = 0; i < s.length; i++)
		{
			s[i].dispData();
		}
	}
}
