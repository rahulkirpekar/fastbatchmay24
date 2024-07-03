package collectiontopic.listtopic.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestApp1 
{
	public static Object isRecordAvailable(ArrayList<Student> list,int rno) 
	{
		boolean flag = false;
		int i = 0;
		Student s = null;
		for (i = 0; i < list.size(); i++) 
		{
			s = list.get(i);
			
			if(s.getRno() == rno) 
			{
				flag=true;
				return i;// index
//				break;//i--index
			}
		}
		return flag;//false
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student s = null;
		ArrayList<Student> list = new ArrayList<Student>();
 		int choice = 0 ;
		do 
		{		
			System.out.println("Enter below choice : ");
			System.out.println("1) For Insert Student");
			System.out.println("2) For Update Student");
			System.out.println("3) For Delete Student");
			System.out.println("4) For Search Student");
			System.out.println("5) For Display All records");
			System.out.println("6) For Exit Student Application");
			choice = sc.nextInt();
			
			switch (choice) 
			{
				case 1: s = new Student();
						s.scan();
						list.add(s);
						System.out.println("Studnet record succssfully inserted");
						break;
				case 2:
						System.out.println("Enter Rno whch you want to Update :  "); 
						int upno = sc.nextInt();
						boolean flag = false;
						
						Object obj = isRecordAvailable(list, upno);
						
						System.out.println("Update obj : " + obj);
						if (obj instanceof Integer) 
						{
							int index = (Integer)obj;
							System.out.println("update index : " + index );

							s = list.get(index);
							
							s.update();
							
							list.set(index, s);
							System.out.println("Student record succssfully updated");
						}else 
						{
							System.out.println("Given "+upno+" not found in records");
						}
						break;
				case 3:
						System.out.println("Enter Rno whch you want to Delete :  "); 
						
						int dlno = sc.nextInt();
						
						flag = false;

						int i = 0;
						
						for (i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							
							if(s.getRno() == dlno) 
							{
								flag=true;
								break;//i--index
							}
						}
						if(flag) 
						{
							list.remove(i);
							s.disp();
						}else 
						{
							System.out.println("Given "+dlno+" not found in records");
						}
						break;
				case 4:
						System.out.println("Enter Rno whch you want to search :  "); 
						int srno = sc.nextInt();
						
						flag = (boolean) isRecordAvailable(list, srno);
						
						if(flag) 
						{
							s.disp();
						}else 
						{
							System.out.println("Given "+srno+" not found in records");
						}
						break;
			
				case 5: 
						for ( i = 0; i < list.size(); i++) 
						{
							s = list.get(i);
							s.disp();
						}
						break;
				case 6: 
						break;
			
				default:
						break;
			}
	   }while(choice != 6);	
	}	
}
