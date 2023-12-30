package Study75;

import java.util.Scanner;

public class MoveZeros {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		int []nums = new int[n];
		
		for(int i=0; i< n ; i++)
		{
			nums[i]= scan.nextInt();
		}
		int []result= moveMyZeros(nums);
		System.out.println(result);
	}

	private static int[] moveMyZeros(int[] nums) {
	    int i=0;
        int j=0;


        while(i<nums.length)
        {
            if(nums[i]==0)
            {
                i++;
            }
            else{
                int swap =nums[i];
                nums[i]= nums[j];
                nums[j]= swap;
                i++;
                j++;
            }

        }
		return nums;
	}

}
