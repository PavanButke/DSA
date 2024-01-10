package DynamicProgramming;

import java.util.Scanner;

public class MinimumCostMaze {
	
	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int nr= scan.nextInt();
		int nc= scan.nextInt();
		
		int cost[][]= new int[nr][nc];
		for(int i=0 ; i<nr ;i++)
		{
			for(int j=0 ; j< nc ; j++)
			{
				cost[i][j]= scan.nextInt();
			}
		}
		
		int dp[][]= new int[nr][nc];
		
		for(int r= nr-1 ; r>=0 ; r--)
		{
			for(int c= nc-1 ; c>=0 ; c--)
			{
				if(r == nr-1 && c== nc-1)
				{
					dp[r][c]= cost[r][c];
				}
				else if(r== nr-1)
				{
					dp[r][c]= dp[r][c+1]+ cost[r][c];
				}
				else if(c== nc-1)
				{
					dp[r][c]= dp[r+1][c]+ cost[r][c];
				}else {
					dp[r][c]= Math.min(dp[r][c+1] , dp[r+1][c])+cost[r][c];
				}
			}
		}
		System.out.println(dp[0][0]);	
		
	}
	

}
