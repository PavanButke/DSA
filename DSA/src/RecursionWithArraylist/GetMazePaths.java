package RecursionWithArraylist;

import java.util.ArrayList;
import java.util.Scanner;

//1. You are given a number n and a number m representing number of rows and columns in a maze.
//2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
//3. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
////Use sample input and output to take idea about output.
//Sample Input
//3
//3
//Sample Output
//[hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]


public class GetMazePaths {
	
	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		int nr= scan.nextInt();
		int nc = scan.nextInt();
		
		ArrayList<String> path = getMePath(0,0, nr-1 , nc-1);
		System.out.println(path);
	}

	public static ArrayList<String> getMePath(int sr, int sc , int dr , int dc)
	{
		if(sr==dr && sc==dc)
		{
			ArrayList<String> blist= new ArrayList<>();
			blist.add("");
			return blist;
		}
		
		ArrayList<String> myPath= new ArrayList<>();
		if(sc+1 <= dc)
		{
			ArrayList<String> hPath= getMePath(sr, sc+1, dr, dc);
			for(String path1 : hPath) {
				myPath.add("h"+path1);
			}
		}
		
		if(sr+1 <= dr)
		{
			ArrayList<String> vPath= getMePath(sr+1, sc, dr, dc);
			for(String path2 : vPath) {
				myPath.add("v"+path2);
			}
		}
		
		return myPath;
	}
}
