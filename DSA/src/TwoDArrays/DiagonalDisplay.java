package TwoDArrays;

import java.util.Scanner;

public class DiagonalDisplay {

	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n1= scan.nextInt();
		
		
		int arr[][]= new int[n1][n1];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=0 ; j<arr[i].length ; j++)
			{
				arr[i][j]= scan.nextInt();
			}
		}
		
		for(int g=0 ; g< arr[0].length ; g++)
		{
			for(int i=0 , j=g ; j <arr[0].length ; i++ , j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
	
}
