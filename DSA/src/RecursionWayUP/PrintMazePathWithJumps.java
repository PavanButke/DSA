package RecursionWayUP;

import java.util.Scanner;

//1. You are given a number n and a number m representing number of rows and columns in a maze.
//2. You are standing in the top-left corner and have to reach the bottom-right corner. 
//3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
//4. Complete the body of printMazePath function - without changing signature - to print the list of all paths that can be used to move from top-left to bottom-right.

public class PrintMazePathWithJumps {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int m= scan.nextInt();
		
		printAllMazePathJmps(0,0,n-1,m-1 ,"");
	}

	public static void printAllMazePathJmps(int sr, int sc, int dr, int dc, String psf) {
		
		if(sr==dr && sc==dc)
		{
			System.out.println(psf);
			return;
		}
		
		for(int jump =1 ; sc+  jump <= dc ; jump++)
		{
			printAllMazePathJmps(sr, sc+jump, dr, dc, psf+"h"+jump);
		}
		
		for(int jump =1 ; sr+jump <= dr ; jump++)
		{
			printAllMazePathJmps(sr+jump, sc, dr, dc, psf+"v"+jump);
		}
		
		for(int jump =1 ; sr+jump <= dr  && sc+jump <= dc ; jump++)
		{
			printAllMazePathJmps(sr+jump, sc+jump, dr, dc, psf+"d"+jump);
		}
	}

}
