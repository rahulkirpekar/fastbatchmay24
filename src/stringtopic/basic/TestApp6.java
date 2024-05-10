package stringtopic.basic;

public class TestApp6 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("royal");

		System.out.println(sb.hashCode() + "---"+sb );

		sb.append(" technosoft pvt ltd");

		System.out.println(sb.hashCode() + "---"+sb );

		sb.reverse();
		
		System.out.println(sb.hashCode() + "---"+sb );
	}
}
