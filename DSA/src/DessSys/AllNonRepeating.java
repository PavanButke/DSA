package DessSys;

import java.util.Scanner;

public class AllNonRepeating {

	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		System.out.println(getNonRepeating(s));
	}

	public static String getNonRepeating(String s) {
		
		int []freq = new int[256];
		
		for(int i=0; i< s.length(); i++ )
		{
			freq[s.charAt(i)]++;
		};
		
		
		StringBuilder result = new StringBuilder();
		for(int i=0 ; i< s.length(); i++)
		{
			if(freq[s.charAt(i)]==1)
			{
				result.append(s.charAt(i)).append(' ');
			}
		}
		
		if(result.length() >0)
		{
			return "Non repeating chars: " + result.toString().trim();
		}
		else 
			return "No non-repeating chars";
		
	}
	
}
