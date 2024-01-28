package DynamicProgramming;

import java.util.Scanner;

//5
//10
//4
//2
//7
//1
//3

public class CoinCombination {

		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			int n= scan.nextInt();
			int coins[]= new int[n];
			for(int i=0; i< n ; i++)
			{
				coins[i] = scan.nextInt();
			}
			int tar = scan.nextInt();
			
			int dp[]= new int[tar+1];
			
			dp[0]=1;
			for(int coin : coins)
			{
				for(int t=coin ; t<= tar ; t++)
				{
					dp[t] += dp[t-coin];
				}
			}
			System.out.println(dp[tar]);
		}
}
