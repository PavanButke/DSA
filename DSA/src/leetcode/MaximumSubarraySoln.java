package leetcode;

public class MaximumSubarraySoln {
	    public int maxSubArray(int[] arr) {
	          int maxSum =Integer.MIN_VALUE;
	          int currentSum = 0;
	          for(int i=0 ; i< arr.length ; i++)
	          {
	                     currentSum += arr[i];
	                     if(currentSum > maxSum)
	                     {
	                        maxSum = currentSum;
	                     }
	                     if(currentSum < 0)
	                     {
	                        currentSum =0;
	                     }
	          }
	        return maxSum ;
	    }
}
