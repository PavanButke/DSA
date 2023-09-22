package RecursionArray;

import java.util.Scanner;

//1. You are given a number n, representing the size of array a.
//2. You are given n numbers, representing elements of array a.
//3. You are required to print the elements of array from end to beginning each in a separate line.
//4. For the above purpose complete the body of displayArrReverse function. Don't change the signature.
//Input Format
//A number n
//n1
//n2
//.. n number of elements
//Output Format
//n1
//n2
//.. n elements

public class displayArrayReverse {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
			
		int n= scan.nextInt();
		int []arr = new int[n];
		
		for(int i=0; i< arr.length ; i++)
		{
			arr[i]= scan.nextInt();
		}
		
		displayArrayReve(arr ,0);
	}

	public static void displayArrayReve(int []arr , int i) {
		
		if(i==arr.length)
		{
			return;
		}
		
		displayArrayReve(arr, i+1);
		System.out.println(arr[i]);
	}
}
