package InterviewQues;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NonRepeatingStream {

	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		System.out.println(getNonRepeating(str));
	}

	public static List<String> getNonRepeating(String str) {
		// TODO Auto-generated method stub
		
		Map<Character , Integer> hm = new LinkedHashMap<>();
		
		for( char c: str.toCharArray())
		{
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		
		
		List<String> al = new ArrayList<>();
		al = hm.entrySet().stream()
				.filter(entry -> entry.getValue()>1).map(entry -> entry.getKey()+":"+entry.getValue())
				.collect(Collectors.toList());
		return al;
	}
	
}
