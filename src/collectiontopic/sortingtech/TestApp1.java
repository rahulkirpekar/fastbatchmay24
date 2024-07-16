package collectiontopic.sortingtech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		
		Iterator<Integer> itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		Collections.sort(list);
		
		System.out.println("After Sorting : ");
		
		itr =	list.iterator();
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}
}
