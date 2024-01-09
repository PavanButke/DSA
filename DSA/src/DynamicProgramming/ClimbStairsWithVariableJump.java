package DynamicProgramming;

import java.util.Scanner;

public class ClimbStairsWithVariableJump {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		int moves[] = new int[n];
		for(int i=0 ; i< moves.length ; i++)
		{
			moves[i]=scan.nextInt();
		}
		
		int dp[] = new int[n+1];
		for(int i=n ; i>=0 ; i--)
		{
			if(i==n)
			{
				dp[i]=1;
			}else {
				int maxJmp = moves[i];
			
					for(int len=1 ; len<= maxJmp && len+i <=n ; len++)
					{
						dp[i] += dp[i+len];
					}
			}
			
		}
		System.out.println(dp[0]);
		
	}

}
