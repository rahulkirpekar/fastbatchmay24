package basic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		int no,count=0,primeCount=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 :");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 :");
		int no2 = sc.nextInt();
		
		int i = no1;//1
		do 
		{
			no = i;
			
			int j = 1;

			count = 0;
			do 
			{
				if(no%j==0) 
				{
					count++;
				}
				j++;
			}while(j<=no);
			
			if(count==2) 
			{
				primeCount++;
				System.out.print(no+"\t");
			}
			i++;
		}while(i <= no2);//10
		
		System.out.println();
		System.out.println("primeCount : " + primeCount);
	}
}
