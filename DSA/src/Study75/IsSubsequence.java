package Study75;

import java.util.Scanner;

public class IsSubsequence {
	
	public static void main(String ...args) {
		
		Scanner scan = new Scanner(System.in);
		String str1= scan.nextLine();
		String str2= scan.nextLine();
		
		System.out.println(isMySubsequence(str1,str2));
	}

	private static boolean isMySubsequence(String s, String t) {
		  int i=0;
	        int j=0;

	        while(j< t.length())
	        {
	            if( i== s.length())
	            {
	                break;
	            }
	            else if(s.charAt(i)== t.charAt(j))
	            {
	                i++;
	                j++;
	            }
	            else{
	                j++;
	            }
	        }

	        return i== s.length();
	}

}
