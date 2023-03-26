package FunctionAndClasses;

import java.util.Scanner;

//1.You are given a number n, representing the size of array a.
//2.You are given n distinct numbers, representing elements of array a.
//3. You are given another number d.
//4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.

//Sample Input
//6
//15
//30
//40
//4
//11
//9

//Sample Output
//2
public class FindAnElement {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int n= scan.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0 ; i< arr.length ; i++)
		{
			arr[i] = scan.nextInt();
		}
		int d = scan.nextInt();
		
		int res= FindAnElement(arr , d);
		System.out.println(res);
	}

	private static int FindAnElement(int[] arr , int d) {
		
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]== d)
			{
				return i;
			}

		}
		return -1;
	}

}
