package SearchingAlgos;
import java.io.*;
import java.util.*;

public class CountSort {
	
	 public static void main(String[] args) throws Exception {
		    Scanner scn = new Scanner(System.in);
		    int n = scn.nextInt();
		    int[] arr = new int[n];
		    int max = Integer.MIN_VALUE;
		    int min = Integer.MAX_VALUE;
		    for (int i = 0; i < n; i++) {
		      arr[i] = scn.nextInt();
		      max = Math.max(max, arr[i]);
		      min = Math.min(min, arr[i]);
		    }
		    int []res= countSortAlgo(arr,min,max);
		    print(res);
		  }
	 

	  public static void print(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	      System.out.println(arr[i]);
	    }
	  }

  public static int[] countSortAlgo(int[] arr, int min, int max) {
	  int range= max-min+1;
	  
	  int freq[] = new int[range];
	  for(int val: arr)
	  {
		  	int pos= val-min;
		  	freq[pos]++;
	  }
	  
	  for(int i=1 ; i< range ; i++)
	  {
		  freq[i] += freq[i-1];
	  }
	  
	  int res[] = new int[arr.length];
	  for(int i = arr.length - 1; i >= 0; i--) {
	      int val = arr[i];
	      int pos = val - min;
	      int place = freq[pos] - 1;
	      res[place] = val;
	      freq[pos]--;
	  }
	  return res;
  }

}