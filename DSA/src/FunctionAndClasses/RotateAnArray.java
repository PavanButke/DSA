package FunctionAndClasses;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RotateAnArray {


	  public static void display(int[] a){
	    StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + " ");
	    }
	    System.out.println(sb);
	  }

	  public static void rotate(int[] a, int k){
	    reverse(a ,0 , a.length-k-1 );
	    reverse(a , a.length-k , a.length-1);
	    reverse(a , 0 , a.length-1);
	  }
	  
	  public static void reverse(int[] arr, int left , int right){
		    while(left < right)
		    {
		    	int temp = arr[left];
		    	arr[left] = arr[right];
		    	arr[right]= temp;
		    	
		    	left++;
		    	right--;
		    }
		  }
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }
	    int k = Integer.parseInt(br.readLine());
	    int left=0;
	    int right= a.length-1;
	    rotate(a, k);
	    display(a);
	 }


}
