package RecursionWithArraylist;
//1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
//2. The following list is the key to characters map
//    0 -> .;
//   1 -> abc
//   2 -> def
//   3 -> ghi
//   4 -> jkl
//   5 -> mno
//   6 -> pqrs
//   7 -> tu
//   8 -> vwx
//   9 -> yz
//3. Complete the body of printKPC function - without changing signature - to print the list of all words that could be produced by the keys in str.
//Use sample input and output to take idea about output.

import java.util.Scanner;

public class PrintKPC {

	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		printKeypc(str , "");
	}
	
	static String keypad[]= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	private static void printKeypc(String str, String asf) {
		if(str.length()==0)
		{
			System.out.println(asf);
			return;
		}
		
		char ch= str.charAt(0);
		String roq= str.substring(1);
		
		String word= keypad[Integer.parseInt(ch+"")];
		
		for(int i=0 ; i< word.length(); i++)
		{
			printKeypc(roq, asf+word.charAt(i));
		}
		
	}
}
