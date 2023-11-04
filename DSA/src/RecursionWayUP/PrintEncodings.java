package RecursionWayUP;

import java.util.Scanner;

//1. You are given a string str of digits. (will never start with a 0)
//2. You are required to encode the str as per following rules
//    1 -> a
//    2 -> b
//    3 -> c
//    ..
//    25 -> y
//    26 -> z
//3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.
//Use the input-output below to get more understanding on what is required
//123 -> abc, aw, lc
//993 -> iic
//013 -> Invalid input. A string starting with 0 will not be passed.
//103 -> jc
//303 -> No output possible. But such a string maybe passed. In this case print nothing.

public class PrintEncodings {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		printStrEncodings(str, "");
	}
	
	public static void printStrEncodings(String str , String enco)
	{
		if(str.length()==0)
		{
			System.out.println(enco);
			return;
		}
		if(str.length()=='0')
		{
			return;
		}
		
		char firstChar= str.charAt(0);
		int num1= Integer.parseInt(firstChar+"");
		printStrEncodings(str.substring(1) , enco+(char)('a'+ num1 -1));
		
		if(str.length() > 1)
		{
			char secondChar = str.charAt(1);
			int num2= Integer.parseInt(""+firstChar+secondChar);
			if(num2 >=10 && num2 <=26)
				printStrEncodings(str.substring(2), enco+(char)('a' +num2 -1));
		}
	}
}
