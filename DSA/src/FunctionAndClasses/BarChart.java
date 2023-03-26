package FunctionAndClasses;

import java.util.Scanner;

//1. You are given a number n, representing the size of array a.
//2. You are given n numbers, representing elements of array a.
//3. You are required to print a bar chart representing value of arr a.

public class BarChart {

	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i< arr.length ; i++)
		{
			arr[i]= scan.nextInt();
		}
		
		int max=arr[0];
		for(int i=0; i<arr.length ;i++)
		{
			if(arr[i]>max)
				max= arr[i];
		}
		
		for(int ht=max ; ht>=1 ; ht--)
		{
			for(int j=0 ; j< arr.length ; j++)
			{
				if(arr[j]>=ht)
				{
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
			
			System.out.println();
		}	
		
	}
}

