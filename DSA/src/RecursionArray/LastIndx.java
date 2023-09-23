package RecursionArray;

import java.util.Scanner;

//1. You are given a number n, representing the count of elements.
//2. You are given n numbers.
//3. You are given a number x. 
//4. You are required to find the last index at which x occurs in array a.
//5. If x exists in array, print the last index where it is found otherwise print -1

public class LastIndx {
	
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
		
		int res= displayLasstIndx(arr , 0 , num);
		System.out.println(res);
	}

	public static int displayLasstIndx(int[] arr, int i, int num) {
		
		if(i== arr.length)
		{
			return -1;
		}
		
		int res= displayLasstIndx(arr, i+1, num);
		if(res== -1) {
			if(arr[i]== num)
			{
				return i;
			}
			else {
				return -1;
			}
		}
		return res;
	}

}
