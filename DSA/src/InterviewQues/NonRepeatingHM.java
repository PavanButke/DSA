package InterviewQues;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingHM {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		
		System.out.println( getNonRepeatingChar(s));
	}

	public static String getNonRepeatingChar(String s) {
		Map<Character , Integer> hm = new HashMap<>();
		
		for(char c: s.toCharArray())
		{
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		
		StringBuilder sb = new StringBuilder();
		for(char c: s.toCharArray())
		{
			if(hm.get(c)==1)
			{
				sb.append(c).append(',');
			}
		}
		
		
		if(sb.length() > 0)
		{
			return "All non repeating chars:"+ sb.toString().trim();
		}
		else
			return "All are repeating chars";
	}
	
	
}
