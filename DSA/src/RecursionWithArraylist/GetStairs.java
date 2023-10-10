package RecursionWithArraylist;

import java.util.ArrayList;
import java.util.Scanner;

//1. You are given a number n representing number of stairs in a staircase.
//2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
//3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
//Use sample input and output to take idea about output.


public class GetStairs {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<String> stairPath = getStairPath(n);
		System.out.println(stairPath);
	}

	public static ArrayList<String> getStairPath(int n)
	{
		if(n==0)
		{
			ArrayList<String> base= new ArrayList<>();
			base.add(" ");
			return base;
		}
		else if(n<0)
		{
			ArrayList<String> base= new ArrayList<>();
			return base;
		}
		ArrayList<String> myPath = new ArrayList<>();
		ArrayList<String> path1 = getStairPath(n-1);
		for(String path : path1)
		{
			myPath.add("1"+path);
		}
		ArrayList<String> path2 = getStairPath(n-2);
		for(String path : path2)
		{
			myPath.add("2"+path);
		}
		ArrayList<String> path3 = getStairPath(n-3);
		for(String path : path3)
		{
			myPath.add("3"+path);
		}
		return myPath;
	}
}
