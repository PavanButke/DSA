package FunctionAndClasses;

import java.util.Scanner;

public class AnyBaseSubstraction {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int b= scan.nextInt();
		int n1= scan.nextInt();
		int n2= scan.nextInt();
		int d= anyBase(b,n1,n2);
		System.out.println(d);
		
}	
	public static int anyBase(int b , int n1, int n2) {
		int answer=0;
		int c=0;
		int power=1;
		
		while(n2>0)
		{
			int d1= n1%10;
			int d2= n2%10;
			
			n1=n1/10;
			n2=n2/10;
			
			int d= d2+c-d1;
			if(d< 0)
			{
				d=d+b;
				c=-1;
			}else {
				d=d;
				c=0;
			}
			
			answer= answer + d*power;
			power= power*10;
		}
		return answer;
		
	}
}
	
