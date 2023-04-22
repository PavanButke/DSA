package TwoDArrays;

import java.util.Scanner;

public class SpiralArray {
	
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m= scan.nextInt();
		
		int [][] arr = new int[n][m];
		
		for(int i=0 ; i< n ; i++)
		{
			for(int j=0 ; j< m ;j++)
			{
				arr[i][j]= scan.nextInt();
			}
		}
		
		
		int minr=0;
		int minc=0;
		int maxr= arr.length-1;
		int maxc= arr[0].length-1;
		int total = n*m;
		int count=0;
		
		while(count<= total)
		{
			//top wall , downwards
			for(int i=minr ; i<=maxr && count<= total  ; i++)
			{
				System.out.println(arr[i][minc]);
				count++;
			}
			minc++;
			//bottom wall , rightwards
			for(int j=minc ; j<= maxc  && count<= total   ; j++)
			{
				System.out.println(arr[maxr][j]);
				count++;
			}
			maxr--;
			//right wall , upwards
			for(int k=maxr; k>=minr  && count<= total  ; k--)
			{
				System.out.println(arr[k][maxc]);
				count++;
			}
			maxc--;
			
			for(int l=maxc ; l>=minc  && count<= total   ; l--)
			{
				System.out.println(arr[minr][l]);
				count++;
			}
			minr++;
		}
	}

}
