package FunctionAndClasses;

import java.util.Scanner;

public class DiffrenceBetweenTwoArrays {

	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n1= scan.nextInt();
		int n2= scan.nextInt();
		
		int []one = new int[n1];
		for(int i=0; i<n1 ; i++)
		{
			one[i]= scan.nextInt();
		}
		
		int []two = new int[n2];
		for(int i=0; i<n2 ; i++)
		{
			two[i]= scan.nextInt();
		}
		
		int []three = new int[n1];
		
		int i= one.length-1;
		int j= two.length-1;
		int k= three.length-1;
		int c=0;
		
		while(n2>0)
		{
			int d= two[j]+c;
			
			if(i>=0)
			{
				d= d-one[i];
			}
			
			if(d<0)
			{
				d= d+10;
				c=-1;
			}
			else {
				d=d;
				c=0;
			}
			
			three[k]=d;
			i--;
			j--;
			k--;
			
		}
		
		for(int ii=0 ; ii<three.length; ii++)
		{
			System.out.println(three[ii]);
		}
	}
}
