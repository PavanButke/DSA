package Array;

import java.util.Scanner;
//1. You are given a number n, representing the count of elements.
//2. You are given n numbers.
//3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.
//Input Format
//A number n
//n1
//n2
//.. n number of elements
//Output Format
//A number representing max - min



public class SpanOfArray {
	
	public static void main(String[] args) throws Exception {
        
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int arr[] = new int[5];
	    
	    for(int i=0 ; i< arr.length ; i++){
	        arr[i] = scan.nextInt();
	    }
	    
	    int res = SpanOfArr(arr);
	    
	    System.out.println(res);


	 }
	 
	 public static int SpanOfArr(int arr[]){
	     
	     int max= Integer.MIN_VALUE;
	     int min= Integer.MAX_VALUE;
	     
	     for(int val : arr){
	         if(val > max){
	             max= val;
	         }else
	         if(val<min){
	             min=val;
	         }
	     }
	     
	     return max-min;
	 }

}
