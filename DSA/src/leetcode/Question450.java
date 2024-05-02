package leetcode;

import java.util.Scanner;

//Input: nums = [1,1,2,3,3,4,4,8,8]
//Output: 2

public class Question450 {
	
	public static void main(String ...args)
	{
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
		    int arr[] = new int[n];
			for(int i=0 ; i<n ; i++)
			{
				 arr[i] = scan.nextInt();
			}
			
			int result = getSingleElement(arr);

				System.out.println(result);
	}

	private static int getSingleElement(int []arr) {
		
		
	     if(arr.length == 1) {
	            return arr[0];
	     }
	    int count=0;
		for(int i=0 ; i <= arr.length ; i++)
		{
			
			if(arr[i]== arr[0]) 
				i++; 
			if((i > 0 && arr[i]== arr[i-1]) || (i< arr.length && arr[i] == arr[i+1]) )
			{
				 count++;
			}else {
				return arr[i];
			}
		}
		return 0;
	}
}
