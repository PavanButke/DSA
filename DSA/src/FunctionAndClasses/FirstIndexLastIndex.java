package FunctionAndClasses;

import java.util.Scanner;

public class FirstIndexLastIndex {

	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int [] arr = new int[n];
		
		for(int i=0 ; i<arr.length ; i++ )
		{
			arr[i]= scan.nextInt();
		}
		
		int data = scan.nextInt();
		
		int left= 0;
		int right=arr.length-1;
		int firstIdx=-1;
		
		while(left<=right)
		{
			int mid = (left+right)/2;
			if(data > arr[mid])
			{
				left= mid+1;
			}
			else if(data < arr[mid])
			{
				right = mid-1;
			}
			else {
				firstIdx= mid;
				right = mid-1;
			}
		}
		
			System.out.println(firstIdx);
		
		left=0;
		right= arr.length-1;
		int lastIdx =-1;
		while(left<=right)
			{
				int mid = (left+right)/2;
				if(data > arr[mid])
				{
					left= mid+1;
				}
				else if(data < arr[mid])
				{
					right = mid-1;
				}
				else {
					lastIdx= mid;
					left = mid+1;
				}
			}
		System.out.println(lastIdx);
	}
}
