package Study75;

import java.util.Scanner;

public class MaxConsecutiveOnes {

	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int k= scan.nextInt();
		int []arr= new int[n];
		
		for(int i=0; i< arr.length; i++) {
			
			arr[i]= scan.nextInt();
		}
		int result= longestOnes(arr,k);
		
	}

	   public static int longestOnes(int[] nums, int k) {
	        int ans=0;

	        int coziw=0;
	        int i=0;
	        int j=-1;
	        //window= j+1 -> i-1 => i-1-j

	        while(i< nums.length)
	        {
	            //accquire
	            if(nums[i]==0)
	            {
	                coziw++;
	                i++;
	            }else{
	                i++;
	            }

	            // if invalid, release untill you are valid again
	            if(coziw>k){
	                j++;
	                if(nums[j]==0)
	                {
	                    coziw--;
	                }
	            }

	            //consider
	            int sow= i-1-j;
	            ans = Math.max(ans,sow);
	        }

	        return ans;
	    }
}
