package TwoDArrays;

import java.util.Scanner;

public class SaddlePoint {

	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int [][]arr= new int[n][n];
		
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=0; j < arr[0].length ;j++)
			{
				arr[i][j]= scan.nextInt();
			}
		}
		
		for(int i=0 ; i<arr.length ; i++)
		{
			int min= arr[i][0];
			int psp=0;
			for(int j=1 ; j< arr.length ; j++)
			{
				if(arr[i][j]< min)
				{
					min= arr[i][j];
					psp=j;
				}
			}
			boolean isSaddle=true;
			
			for(int k=0; k< arr.length ; k++)
			{
				if(arr[i][psp] > min) {
					isSaddle= false;
					break;
				}
			}
		
			if(isSaddle==true)
			{
				System.out.println(psp);
				return;
			}
			
		}
		
		System.out.println("Invalid Input");
	}
}
