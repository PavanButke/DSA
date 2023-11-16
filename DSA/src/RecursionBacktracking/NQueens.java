package RecursionBacktracking;
//1. You are given a number n, the size of a chess board.
//2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
//Note - Queens kill at distance in all 8 directions
//3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.
//Sample Input
//4
//Sample Output
//0-1, 1-3, 2-0, 3-2, .
//0-2, 1-0, 2-3, 3-1, .

import java.util.Scanner;

public class NQueens {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int arr[][]= new int[n][n];
		 
		printNqueens(arr , "" , 0);
	}

	public static void printNqueens(int[][] arr, String asf, int row) {
		
		if(row== arr.length) {
			System.out.println(asf+"");
			return;
		}
		
		for(int col=0 ; col<= arr.length ; col++)
		{
			if(isSafe(arr ,row , col))
				
			{
				arr[row][col]=1;
				printNqueens(arr, asf+row+"-"+col+",", row+1);
				arr[row][col]=0;
			}
		}
		
	}

	public static boolean isSafe(int[][] arr, int row, int col) {
		for(int i=row-1 , j=col ; i>=0 ;i--)
		{
			if(arr[row][col]==1)
			{
				return false;
			}
		}
		for(int i=row-1 , j=col+1 ; i>=0 && j< arr[0].length ;i--, j++)
		{
			if(arr[row][col]==1)
			{
				return false;
			}
		}
		
		for(int i=row-1 , j=col-1 ; i>=0 && j>=0 ;i--, j--)
		{
			if(arr[row][col]==1)
			{
				return false;
			}
		}
		return true;
	}

}
