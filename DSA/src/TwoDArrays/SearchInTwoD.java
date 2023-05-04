package TwoDArrays;

import java.util.Scanner;

public class SearchInTwoD {

	public static void main(String ...args) {
		
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		
		int [][]arr = new int[n][n];
		
		for(int i=0 ; i< arr.length ; i++)
		{
			for(int j=0 ; j<arr[0].length ; j++)
			{
				arr[i][j]= scan.nextInt();
			}
		}
		int x= scan.nextInt();
		int i=0;
		int j= arr.length-1;

		while(i < arr.length && j>=0)
		{
			if(x> arr[i][j])
			{
				i++;
			}
			else if(x<arr[i][j]){
				j--;
			}
			else {
				System.out.println(i);
				System.out.println(j);
				return;
			}
		}
		System.out.println("Not Found");
	}
}
