package DessSys;

import java.util.Scanner;

public class SecondLarget {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int arr[]= new int[n];
		
		for(int i=0 ; i< arr.length ; i++)
		{
			arr[i]= scan.nextInt();
		}
		
			int res= findSecondLarg( arr,n);
			System.out.println(res);
					
	}

	private static int findSecondLarg(int[] arr, int n) {
//		int first_large= Integer.MIN_VALUE;
//		for(int i=0 ; i< arr.length ; i++)
//		{
//			if(arr[first_large] < arr[i])
//				first_large= arr[i];
//			
//		}
//		
//		int sec_large = Integer.MIN_VALUE;
//		for(int i=0; i<arr.length ;i++)
//		{
//			if(arr[i]> sec_large && arr[i]< first_large)
//				sec_large= arr[i];
//		}
//		return sec_large;
		
		
		
		int first_largest= 0;
		int second_largest= -1;
		
		for(int i=0 ; i<n ; i++)
		{
			if(arr[i] > arr[first_largest])
			{
				second_largest = first_largest;
				first_largest=i;
			}
			else if(arr[i]< first_largest)
			{	
				if(second_largest== -1 || arr[second_largest]<arr[i])
					second_largest=i;
			}
		}
		return arr[second_largest];
	}

}
