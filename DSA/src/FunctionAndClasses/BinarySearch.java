package FunctionAndClasses;

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		int [] arr = new int[n];
			
		for(int i=0 ; i< arr.length ; i++)
		{
			arr[i]= scan.nextInt();
		}
		
		int data= scan.nextInt();
		int left = 0;
		int right= arr.length-1;
		int foundAt=-1;
		
		while(left<=right)
		{
			int mid= (left+right)/2;
			
			if(data > arr[mid]) {
				//values in left is useless
				left= mid+1;
			}
			else if(data < arr[mid])
			{
				// values in right is useless
				right = mid-1;
			}else {
				foundAt=arr[mid];
				break;
			}
		}
		System.out.println(foundAt);
		
	}
	

}
