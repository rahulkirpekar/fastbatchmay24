package collectiontopic.listtopic;
import java.util.PriorityQueue;
public class TestApp2 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("harshika");
		queue.add("jalp");
		queue.add("neel");
		queue.add("soham");
		queue.add("jay");
		queue.add("neel");
		queue.add("soham");
		
		while(!queue.isEmpty()) 
		{
			System.out.println(queue.poll()); 
		}
//		Iterator<String> itr = queue.iterator();
//		while (itr.hasNext()) 
//		{
//			String name = (String) itr.next();
//			
//			System.out.println(name);
//		}
	}
}
