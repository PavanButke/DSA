package DynamicProgramming;

import java.util.Scanner;

public class ClimbStairs {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		int ans = climbStairTabulation(n);
		System.out.println(ans);
	}

	private static int climbStairTabulation(int n) {
		int dp[] = new int[n+1];
		
		for(int i=0 ; i<=n ; i++)
		{
			if(i==0)
			{
				dp[0]=1;
			}else if(i==1)
			{
				dp[i]+=dp[i-1];
			}
			else if(i==2) {
				dp[i] += dp[i-1]+dp[i-2];
			}
			else {
				dp[i] += dp[i-1]+ dp[i-2]+ dp[i-3];
			}
		}
		
		
		return dp[n];
	}
}
