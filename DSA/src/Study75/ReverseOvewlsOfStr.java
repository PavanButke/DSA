package Study75;

import java.util.Scanner;

public class ReverseOvewlsOfStr {
	public static void main(String ...args)
	{
		Scanner scan= new Scanner(System.in);
		String string1= scan.nextLine();
		
		String result= reverseVowels(string1);
		System.out.println(result);
	}
	
	 public static String reverseVowels(String s) {
	        char [] arr = s.toCharArray();
	        int lIdx=0;
	        int rIdx= arr.length-1;

	        while(lIdx < rIdx)
	        {
	            char chLeft= arr[lIdx];
	            char chRight= arr[rIdx];

	            if(isVowel(chLeft) && isVowel(chRight))
	            {
	                arr[lIdx]= chRight;
	                arr[rIdx]= chLeft;
	                lIdx++;
	                rIdx--;

	            }
	            else if(isVowel(chLeft))
	            {
	                rIdx--;
	            }
	            else if(isVowel(chRight))
	            {
	                lIdx++;
	            }
	            else{
	                lIdx++;
	                rIdx--;
	            }
	        }

	        return new String(arr);
	    }

	    static boolean isVowel(char ch)
	    {
	        if(ch=='a' || ch=='A')
	        {
	            return true;
	        }else
	        if(ch=='e' || ch=='E')
	        {
	            return true;
	        }else 
	        if(ch=='i' || ch=='I')
	        {
	            return true;
	        }
	        else
	        if(ch=='o' || ch=='O')
	        {
	            return true;
	        }
	        else
	        if(ch=='u' || ch=='U')
	        {
	            return true;
	        }
	        else{
	            return false;
	        }
	    }
	
}
