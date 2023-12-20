package SearchingAlgos;

import java.util.Scanner;

public class SelectionSort {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int arr[]= new int[n];
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = scan.nextInt();
		}
		printSelSort(arr);
	}

	public static void printSelSort(int[] arr) {
		int n = arr.length;
		for(int itr=0 ; itr< n ; itr++)
		{
			int minIdx= itr-1;
			for(int j=itr ; j< n ; j++)
			{
				if(isSmaller(arr, j , minIdx ))
				{
					minIdx= j;
				}
			}
			
			swap(arr  , itr-1 ,minIdx);
		}
		
	}
	
	  public static boolean isSmaller(int[] arr, int i, int j) {
		    System.out.println("Comparing " + arr[i] + " and " + arr[j]);
		    if (arr[i] < arr[j]) {
		      return true;
		    } else {
		      return false;
		    }
		  }

	  public static void swap(int[] arr, int i, int j) {
		    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		  }
}
