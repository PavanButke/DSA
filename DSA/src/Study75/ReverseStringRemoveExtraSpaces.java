package Study75;

import java.util.Scanner;

public class ReverseStringRemoveExtraSpaces {
	
	public static void main(String ...args) {
		Scanner scan= new Scanner(System.in);
		String string1= scan.nextLine();
		
		String result= reverseString(string1);
		System.out.println(result);
	}

	private static String reverseString(String s) {

        String []markMyWords= s.trim().split(" ");
        
        StringBuilder sb = new StringBuilder();

        for(int i= markMyWords.length - 1 ; i>=0 ; i--)
        {
            if(markMyWords[i].length() >0)
            {
                sb.append(markMyWords[i]);
                sb.append(" ");
            }
        }

        return sb.substring(0 , sb.length()-1).toString();
	}
}
