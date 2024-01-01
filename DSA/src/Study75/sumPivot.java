package Study75;

import java.util.Scanner;

public class sumPivot {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int []arr= new int[n];
		
		for(int i=0; i< arr.length; i++) {
			
			arr[i]= scan.nextInt();
		}
		int result= myPivotSumIndx(arr);
		System.out.println(result);
	}
	 public static int myPivotSumIndx(int[] nums) {
	        int []pre= new int[nums.length];
	        int sum= nums[0];
	        pre[0]=0;

	        for(int i=1; i< nums.length ; i++)
	        {
	            sum += nums[i];
	            pre[i]= pre[i-1]+ nums[i-1];
	        }

	        for(int i=0 ; i< nums.length; i++)
	        {
	            if(pre[i]== sum - nums[i]- pre[i])
	            {
	                return i;
	            }
	        }

	        return -1;
	    }


}
