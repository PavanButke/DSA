package FunctionAndClasses;

import java.util.Scanner;

public class BrokenEconomyOrFloorAndCeil {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		int []arr = new int[n];
		
		for(int i=0 ; i< arr.length ; i++)
		{
			arr[i]= scan.nextInt();
		}
		
		int data=scan.nextInt();
		
		int left=0;
		int right=arr.length-1;
		int floor=-1;
		int ceil=-1;
		
		while(left<=right) {
			int mid= (left+right)/2;
			if(data > arr[mid])
			{
				left= mid+1;
				floor= arr[mid];
			}
			else if(data < arr[mid])
			{
				right= mid-1;
				ceil= arr[mid];
				
			}
			else {
				floor= arr[mid];
				ceil= arr[mid];
				break;
			}	
		}
		System.out.println(ceil);
		System.out.println(floor);
	}

}
