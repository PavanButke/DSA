package SearchingAlgos;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int []arr= new int[n];
		for(int i=0 ; i< arr.length ; i++)
		{
			arr[i]= scan.nextInt();
		}
		 bubbleSort(arr);
		 for (int value : arr) {
	            System.out.print(value + " ");
	     }
	}

	public static void bubbleSort(int[] arr) {
		
		for(int i=1 ; i< arr.length ; i++)
		{
			for(int j=0 ; j< arr.length-i-1 ; j++)
			{
				if(arr[j+1] < arr[j])
				{
					int temp = arr[j+1];
					arr[j+1]= arr[j];
					arr[j]= temp;
				}
			}
		}
		
	}

}
