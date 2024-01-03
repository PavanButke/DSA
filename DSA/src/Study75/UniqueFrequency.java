package Study75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueFrequency {

	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		 
		int []nums = new int[n];
		
		for(int i=0; i< n ; i++)
		{
			nums[i]= scan.nextInt();
		}
		boolean result= uniqueOccurrences(nums);
		System.out.println(result);
	}

	    public static boolean uniqueOccurrences(int[] arr) {
	        HashMap<Integer , Integer> fmap = new HashMap<>();
	        
	        for(int val: arr)
	        {
	            fmap.put(val , fmap.getOrDefault(val, 0)+1);
	        }

	        HashSet<Integer> unique= new HashSet<>();
	        for(int freq: fmap.values())
	        {
	            if(unique.contains(freq))
	            {
	                return false;
	            }
	            else{
	                unique.add(freq);
	            }
	        }
	        return true;
	    }
}
