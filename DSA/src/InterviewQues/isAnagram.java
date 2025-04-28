package InterviewQues;

import java.util.Arrays;

public class isAnagram {

	
	public static void main(String[] args)
	{
		String s1= "silent";
		String s2= "listen";

		anagramCheck(s1 , s2);
	
	}

	public static void anagramCheck(String s1, String s2) {
		// TODO Auto-generated method stub
		
		if(s1.length() != s2.length())
		{
			System.out.println("Not a Anagaram");
		}
		
		char[] c1= s1.toCharArray();
		char[] c2= s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for(int i=0 ; i< c1.length ; i++)
		{
			if(c1[i] != c2[i])
			{
				System.out.println("Not an Anagram");
			}
		}
		
		System.out.println(s1+ " is a anagram of "+s2);
	}
}
