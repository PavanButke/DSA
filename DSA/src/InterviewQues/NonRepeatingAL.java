package InterviewQues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatingAL {
	
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		System.out.println(getAllNonRepeatingAL(str));
	}

	public static List<String> getAllNonRepeatingAL(String s) {
		// TODO Auto-generated method stub
		
		Map<Character, Integer> hm = new HashMap<>();
		
		for(char c: s.toCharArray())
		{
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		
		List<String> al = new ArrayList<>();
		
		for(Map.Entry<Character, Integer> map : hm.entrySet())
		{
			if(map.getValue()>1)
			{
				al.add(map.getKey()+" : "+map.getValue());
			}
		}
		return al;
	}

}
