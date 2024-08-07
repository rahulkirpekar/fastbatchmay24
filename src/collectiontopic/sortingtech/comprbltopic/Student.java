package collectiontopic.sortingtech.comprbltopic;

public class Student implements Comparable<Student>
{
	int rno;
	String name;
	int std;
	
	public Student() 
	{
	}
	public Student(int rno, String name, int std) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
//	@Override
//	public int compareTo(Student s2) 
//	{
//		//   s1         s2
//		if(std > s2.std) 
//		{
//			return 1;
//			
//		}else if(std < s2.std) 
//		{
//			return -1;
//		}else 
//		{
//			return 0;
//		}
//	}
	@Override
	public int compareTo(Student s2) 
	{
		return name.compareTo(s2.name);
	}
}