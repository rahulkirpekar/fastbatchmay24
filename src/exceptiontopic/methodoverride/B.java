package exceptiontopic.methodoverride;

import java.io.IOException;

public class B  extends A
{
	public void test1() throws ArithmeticException
	{
		System.out.println("B---test1()");
	}
}
