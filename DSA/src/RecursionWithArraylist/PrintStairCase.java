package RecursionWithArraylist;

import java.util.Scanner;

//1. You are given a string str.
//2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.
//Use sample input and output to take idea about subsequences.


public class PrintStairCase {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printStairPaths(n, "");
		
	}
	
	public static void printStairPaths(int n , String path)
	{
		if(n==0) {
			System.out.println(path);
			return;
		}
		if(n-1 >=0)
		{
			printStairPaths(n-1, path+"1");
		}
		if(n-2 >=0)
		{
			printStairPaths(n-2, path+"2");
		}
		if(n-3 >=0) {
			printStairPaths(n-3, path+"3");
		}
	}
}
