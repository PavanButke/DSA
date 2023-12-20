package SearchingAlgos;

//1. You are given two sorted arrays(a,b) of integers.
//2. You have to merge them and form one sorted array.
//3. You have to do it in linear time complexity.

import java.io.*;
import java.util.*;

public class MergeTwoSortedArray {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    int n1= a.length;
    int n2= b.length;
    int result[]= new int[n1+n2];
    
    int i=0;
    int j=0;
    int k=0;
    
    while(i< n1 && j<n2)
    {
    	if(a[i]<=b[j])
    	{
    		result[k]= a[i];
    		i++;
    		k++;
    	}
    	else if(a[i]> b[j])
    	{
    		result[k] = b[j];
    		j++;
    		k++;
    	}
    }
    	while(i<n1)
    	{
    		result[k]= a[i];
    		i++;
    		k++;
    	}
    	
    	while(j <n2)
    	{
    		result[k] = b[j];
    		j++;
    		k++;
    	}
    
    
    return result;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}
