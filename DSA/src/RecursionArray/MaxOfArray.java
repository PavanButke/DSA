package RecursionArray;

import java.util.Scanner;

//1. You are given a number n, representing the count of elements.
//2. You are given n numbers.
//3. You are required to find the maximum of input. 
//4. For the purpose complete the body of maxOfArray function. Don't change the signature.

public class MaxOfArray {
	
	public static void main(String ...args)
	{
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		int []arr= new int[n];
		
		for(int i=0 ; i< arr.length ; i++)
		{
			arr[i]= scan.nextInt();
		}
		displayMax(arr , 0);
	}

	public static int displayMax(int[] arr, int i) {
		
		 if(i== arr.length- 1) {
				return arr[i] ;
		}
		 int max= displayMax(arr, i+1);
		if(  arr[i]> max )
		{
			return arr[i];
		}
		else {
			return max;
		}
	}
}
