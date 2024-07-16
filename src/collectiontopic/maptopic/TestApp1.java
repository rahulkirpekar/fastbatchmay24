package collectiontopic.maptopic;

import java.util.TreeMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> map = new TreeMap<Integer,String>();
		
		map.put(10, "rahul");// entry---[K,V]
		map.put(2, "ankur");
		map.put(13, "sagar");
		map.put(46, "kunal");
		map.put(51, "jalp");
		
		for( Map.Entry<Integer, String> e : map.entrySet()) 
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
