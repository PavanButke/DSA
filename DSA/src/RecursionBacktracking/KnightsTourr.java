package RecursionBacktracking;

//1. You are given a number n, the size of a chess board.
//2. You are given a row and a column, as a starting point for a knight piece.
//3. You are required to generate the all moves of a knight starting in (row, col) such that knight visits 
//     all cells of the board exactly once.
//4. Complete the body of printKnightsTour function - without changing signature - to calculate and 
//     print all configurations of the chess board representing the route
//     of knight through the chess board. Use sample input and output to get more idea.
//
//Note -> When moving from (r, c) to the possible 8 options give first precedence to (r - 2, c + 1) and 
//               move in clockwise manner to
//               explore other options.


//Sample Input
//5
//2
//0

import java.util.Scanner;

public class KnightsTourr {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int r= scan.nextInt();
		int c= scan.nextInt();
		printNKnights(new int[n][n],r,c,1);
	}

	public static void printNKnights(int[][] chess, int r, int c, int upcomingMove) {
		if(r<0 || c<0 || r>=chess.length || c>= chess[0].length || chess[r][c]!=0)
		{
			return;
		}
		chess[r][c]=upcomingMove;
		if(upcomingMove== chess.length * chess[0].length)
		{
			displayBoard(chess);
			chess[r][c]=0;
			return;
		}
		
		printNKnights(chess, r-2, c+1, upcomingMove+1);
		printNKnights(chess, r-1, c+2, upcomingMove+1);
		printNKnights(chess, r+1, c+2, upcomingMove+1);
		printNKnights(chess, r+2, c+1, upcomingMove+1);
		printNKnights(chess, r+2, c-1, upcomingMove+1);
		printNKnights(chess, r+1, c-2, upcomingMove+1);
		printNKnights(chess, r-1, c-2, upcomingMove+1);
		printNKnights(chess, r-2, c-1, upcomingMove+1);
		
		chess[r][c]=0;
	}

	public static void displayBoard(int[][] chess) {
		for(int i=0 ; i<chess.length ; i++)
		{
			for(int j=0 ; j<chess[0].length ; j++)
			{
				System.out.print(chess[i][j]+" ");		
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
