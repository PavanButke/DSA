package RecursionArray;

import java.util.Scanner;

//1. You are given a number n, representing the count of elements.
//2. You are given n numbers.
//3. You are given a number x. 
//4. You are required to find the first index at which x occurs in array a.
//5. If x exists in array, print the first index where it is found otherwise print -1.

public class FirstIndex {
	
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int []arr = new int[n];
		
		for(int i=0 ; i< arr.length ; i++)
		{
			arr[i] = scan.nextInt();
			
		}
		int num = scan.nextInt();
		
		int res= displayFirstIndx(arr , 0 , num);
		System.out.println(res);
	}

		public static int displayFirstIndx(int[] arr, int idx, int num) {
			
			if(idx== arr.length)
			{
				return -1;
			}
			
			if(arr[idx]== num)
			{	
				return idx;
			}else {
				return displayFirstIndx(arr, idx+1 , num);
			}
		}
}
