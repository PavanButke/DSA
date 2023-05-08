package StringsProblems;

import java.util.Scanner;

//1. You are given a string. 
//2. You have to compress the given string in the following two ways - 
//   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
//   For "aaabbccdee", the compressed string will be "abcde".
//   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
//   For "aaabbccdee", the compressed string will be "a3b2c2de2".
public class CompressionProblem {

	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		
		String compr1= compressionOne(str);
		String compr2= compressionTwo(str);
		System.out.println(compr1);
		System.out.println(compr2);
	}
	

	private static String compressionTwo(String str) {
		String ans="";
		int count=1;
		for(int i=0 ; i< str.length()-1;i++)
		{
			if(str.charAt(i)== str.charAt(i+1))
			{
				count++;
			}else {
				ans +=str.charAt(i);
				if(count > 1)
				{
					ans +=count;
					count=1;
				}
			}
		}
		ans +=str.charAt(str.length()-1);	
		if(count > 1)
		{
			ans+=count;
		}
		return ans;
	}

	private static String compressionOne(String str) {
		String ans="";
		for(int i=0 ; i< str.length()-1;i++)
		{
			if(str.charAt(i)== str.charAt(i+1))
			{
				//nothing
			}else {
				ans +=str.charAt(i);
			}
		}
		ans +=str.charAt(str.length()-1);	
		return ans;
	}
}
