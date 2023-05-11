package StringBuilder;

import java.util.Scanner;

public class ToggleCase {

	public static void main(String ...args)
	{
		 	Scanner scan = new Scanner(System.in);
		 	String str= scan.nextLine();
		 	System.out.println(toggleCase(str));
	}

	private static String toggleCase(String str) {
		// TODO Auto-generated method stub
		 	StringBuilder sb = new StringBuilder(str);
		 	for(int i=0 ; i< sb.length() ; i++)
		 	{
		 		 char ch= sb.charAt(i);
		 		 if(ch>='A' && ch<='Z')
		 		 {
		 			 char lc= (char) (ch+('a'-'A'));
		 			 sb.setCharAt(i, lc);
		 		 }
		 		 else{
		 			 char uc= (char) (ch+('A'-'a'));
		 			 sb.setCharAt(i, uc);
		 		 }
		 	}
		return sb.toString();
	}
}
