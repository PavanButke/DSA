package RecursionWithArraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//1. You are given a string str.
//2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
//Use sample input and output to take idea about subsequences
// sample input- abc
//[, c, b, bc, a, ac, ab, abc]

public class GetSebsequenceWithAL {
	
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		
		ArrayList<String> result= getSubSeq(str);
		System.out.println(result);
	}
	
	public static ArrayList<String>	 getSubSeq(String str){
		if(str.length()==0) {
			ArrayList<String> blist = new ArrayList<>();
			blist.add("");
			return blist;
		}
		
		char ch= str.charAt(0);
		String roq= str.substring(1);
		ArrayList<String> subSeq= getSubSeq(roq);
		ArrayList<String> mySeq = new ArrayList<>();
		for(String s: subSeq) {
			mySeq.add(s);
		}
		for(String s: subSeq)
		{
			mySeq.add(ch+s);
		}
		return mySeq;
	}
}
