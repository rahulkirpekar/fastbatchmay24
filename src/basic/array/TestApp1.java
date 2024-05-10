package basic.array;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		int a[] = new int[5]; 	//	int a[5];
//		int[] a = new int[5];
//		int []a = new int[5];
//		------------------------------
//		int []a = null;
//		a = new int[5];
//		------------------------------
//		int a[] = {10,20,30,40,50};
//		------------------------------

		int a[] = new int[5]; 	//	int a[5];

		System.out.println("a.length : " + a.length);
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+ i +"] : ");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("A["+ i +"] : " + a[i]);
		}
	}
}