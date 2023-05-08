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
				boolean isPalin= isPalindrome(sub);
				if(isPalin == true)
				System.out.println(sub);
			}
		}
	
	}
	
	public static boolean isPalindrome(String sub)
	{
		boolean flag= true;
		
		int left=0;
		int right= sub.length()-1;
		
		while(left < right)
		{
			char chleft= sub.charAt(left);
			char chright=sub.charAt(right);
			
			if(chleft != chright)
			{
				flag= false;
				break;
			}
			
			left++;
			right--;
		}
		return flag;
	}
}
