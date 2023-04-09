//1. You are given an array of size 'n' and n elements of the same array.
//2. You are required to find and print all the subarrays of the given array. 
//3. Each subarray should be space seperated and on a seperate lines. Refer to sample input and output.
//Sample Input
//3
//10
//20
//30
//Sample Output
//10	
//10	20	
//10	20	30	
//20	
//20	30	
//30	

package FunctionAndClasses;

import java.util.Scanner;

public class SubArrays {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int []arr = new int[n];
		
		for(int i=0 ; i< arr.length ; i++)
		{
			arr[i]= scan.nextInt();
		}
		
		for(int i=0 ; i< arr.length ; i++)
		{
			for(int j=i; j< arr.length ; j++)
			{
				for(int k=i ; k<=j ; k++ )
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}


}
