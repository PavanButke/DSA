package RecursionWithArraylist;

import java.util.ArrayList;
import java.util.Scanner;

//. You are given a string str.
//2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
//Input Format
//A string str
//Output Format
//Contents of the arraylist containing subsequences as shown in sample output



public class GetSubsequences {

	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		String exp= scan.nextLine();
		
		getAllSubseq(exp,"");
	}
	
	public static void getAllSubseq(String ques , String asf)
	{
		if(ques.length()==0)
		{
			System.out.println(asf);
			return;
		}
			
		char ch = ques.charAt(0);
		
		String roq= ques.substring(1);
		
		getAllSubseq(roq,asf+ch);
		getAllSubseq(roq, asf);
	}
}
