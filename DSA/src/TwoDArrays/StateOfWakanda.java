package TwoDArrays;

import java.util.Scanner;

public class StateOfWakanda {
	public static void main(String ...args)
	{
		Scanner scan= new Scanner(System.in);
		int nr= scan.nextInt();
		int nc= scan.nextInt();
		
		int [][]arr= new int[nr][nc];
		for(int i=0; i<nr; i++)
		{
			for(int j=0 ; j<nc ;j++ )
			{
				arr[i][j]= scan.nextInt();
			}
		}
		
		for(int j=0 ; j<nc ; j++)
		{
			if( j%2 == 0)
			{
				for(int i=0 ; i<= nr-1 ; i++)
					System.out.println(arr[i][j]);
				
			}
			else if( j%2 != 0){
				for(int i=nr-1 ; i>=0 ;i--)
				{
					System.out.println(arr[i][j]);
				}
			}
		}
	}
}


