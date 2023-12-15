package Study75;

import java.util.Scanner;

//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
//
//Return the merged string.

 

public class MergeTwoStrings {
	
	public static void main(String ...args)
	{
		Scanner scan= new Scanner(System.in);
		String string1= scan.nextLine();
		String string2= scan.nextLine();
		
		mergeAlternately(string1 , string2);
	}
	
	  public static String mergeAlternately(String word1, String word2) {
	        StringBuilder sb = new StringBuilder();
	        int i=0;
	        int j=0;
	        boolean flag =true;
	        while(i< word1.length() && j< word2.length())
	        {
	            if(flag)
	            {
	                sb.append(word1.charAt(i));
	                i++;
	            }
	            else
	            {
	                sb.append(word2.charAt(j));
	                j++;
	            }

	            flag= !flag;
	        }
	        
	        while(i < word1.length())
	        {
	             sb.append(word1.charAt(i));
	                i++;
	        }

	        while(j < word2.length())
	        {
	             sb.append(word2.charAt(j));
	                j++;
	        }
	    return sb.toString();
	    }
}
