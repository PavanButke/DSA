package DessSys;

import java.util.Scanner;

public class PascalTriangle {
	
	public static void main(String ...args)
	{
	
		int n= 4;
		printPascal(n);
	}

	public static void printPascal(int n) {
		
		for(int i=0 ; i< n ; i++)
		{
			for(int j=0 ; j< n-i;j++)
			{
				System.out.print(" ");
			}
			
			int constant=1;
			for(int k=0 ; k< i ;k++)
			{
				System.out.println(constant+" ");
				constant= constant *(i-k)/k;
			}
			
			System.out.println();
		}
	}

}
