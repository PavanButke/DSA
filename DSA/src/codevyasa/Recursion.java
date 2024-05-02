package codevyasa;

import java.util.Scanner;

public class Recursion {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.println();
		
	}

	private static int  recPrintDecr(int n) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			return;
		}
		
		int n= recPrintDecr(n-1);
		System.out.println(res);
	}
		
}
