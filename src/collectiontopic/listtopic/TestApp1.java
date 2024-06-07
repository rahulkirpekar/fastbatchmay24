package collectiontopic.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList listObj  = new ArrayList();
		
		listObj.add(10);//0 	[int----Integer object]--[Auto Boxing]
		listObj.add('R');//1<==itr	
		listObj.add(true);//2
		listObj.add(24353L);//3
		listObj.add(32434.345);//4
		listObj.add(10.34f);//5
		listObj.add("royal");//6
		
		Student s = new Student(1, "rahul", 12);
		listObj.add(s);//7

		
		System.out.println("listObj.size() : " + listObj.size());
//		System.out.println("listObj.get(0) : " + listObj.get(0));
//		System.out.println("listObj.get(1) : " + listObj.get(1));

		// 1) simple for loop
//		for(int i = 0 ; i < listObj.size() ; i++) 
//		{
//			Object obj = listObj.get(i);
//			
//			if(obj instanceof Student) 
//			{
//				Student s1 = (Student)obj;
//				
//				System.out.println(s1.getRno()+" " + s1.getName() + " "+s1.getStd());
//
//			}else 
//			{
//				System.out.println(obj);
//			}
//		}
		// 2) for:each loop / Advanced for loop / Enhanced for loop
//		for(Object obj : listObj) 
//		{
//			if(obj instanceof Student) 
//			{
//				Student s1 = (Student)obj;
//				
//				System.out.println(s1.getRno()+" " + s1.getName() + " "+s1.getStd());
//
//			}else 
//			{
//				System.out.println(obj);
//			}			
//		}
		// 3) Traditional way By Iterator method
		
		Iterator itr =	listObj.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();

			if(obj instanceof Student)                                                 
			{                                                                          
				Student s1 = (Student)obj;                                             
				                                                                       
				System.out.println(s1.getRno()+" " + s1.getName() + " "+s1.getStd());  
			                                                                           
			}else                                                                      
			{                                                                          
				System.out.println(obj);                                               
			}			                                                               
		}
	}
}
