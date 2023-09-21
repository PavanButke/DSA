package RecursionArray;

import java.util.Scanner;

//1. You are given a number n, representing the size of array a.
//2. You are given n numbers, representing elements of array a.
//3. You are required to print the elements of array from beginning to end each in a separate line.
//4. For the above purpose complete the body of displayArr function. Don't change the signature.
//
//Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

public class DisplayArray {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr= new int[size];
		
		for(int i=0 ; i< arr.length ; i++)
		{
			arr[i]= scan.nextInt();
		}
		
		displayArr(arr , 0);
	} 	
	
	public static void displayArr(int []arr , int i)
	{
		if(i== arr.length)
		{
			return;
		}
		System.out.println(arr[i]);
		displayArr(arr, i+1);
	}
}
