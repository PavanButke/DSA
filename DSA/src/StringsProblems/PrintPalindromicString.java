package StringsProblems;

import java.util.Scanner;

//1. You are given a string. 
//2. You have to print all palindromic substrings of the given string.

public class PrintPalindromicString {

	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		
		for(int i=0 ; i< s.length() ; i++)
		{
			for(int j= i+1; j<= s.length();j++ )
			{
				String sub= s.substring(i,j);
				System.out.println(sub);
			}
		}
	}
}
