package DessSys;

import java.util.*;

public class NonReapeating {
    
	 
	public static String solution(String s) {
		
		HashMap<Character, Integer> map= new HashMap<>();
		
		for(int i=0 ; i< s.length();i++)
		    map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
		for(int i=0 ; i< s.length();i++)
		    if(map.getOrDefault(s.charAt(i),0)==1) return "Character: "+s.charAt(i);
		  
   
		return "No Repeating Character";
	 }
	 
	public static String solution1(String s) {
		int [] freq = new int[256];
		for(int i=0 ; i< s.length();i++)
		    freq[s.charAt(i)]++;
		for(int i=0 ; i< s.length();i++)
		    if(freq[s.charAt(i)]==1) return "Character: "+s.charAt(i);
		  
   
		return "No Repeating Character";
	 } 
	
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		String s= scn.next();
		System.out.print(solution(s.toLowerCase()));
	}


}
