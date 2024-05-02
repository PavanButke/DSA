package leetcode;

public class MaximumSubarray53 {
	public int maxSubArray(int[] arr) {
        int max =0;
        for(int i=0 ; i< arr.length ; i++)
        {
           if(i < arr.length-1)
           {
              if(i>0){
                 arr[i] += (arr[i]-1);
                  if(max < arr[i])
                  {
                      max= arr[i];
                  }
              }
              else{
                  arr[i]= arr[i];
                  if(max < arr[i])
                  {
                      max= arr[i];
                  }
              }
              i++;
           }
        }
      return max ;
  }
}
