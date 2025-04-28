package InterviewQues;

import java.util.Scanner;

import Patterns.reverseANumber;

public class ReverseAString {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String reversed="";
		for(int i= str.length()-1 ; i>=0 ; i--)
		{
			 reversed= reversed + str.charAt(i);
			
		}
		
		System.err.println(reversed);
	}

}
