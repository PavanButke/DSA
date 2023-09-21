package Recursion;

import java.util.Scanner;

// if given i/p ==> 2 ,5
//o/p would be 2 rage to power 32

public class PowerLinear {
	
	public static void main(String ...args)
	{
		Scanner scan= new Scanner(System.in);
		int x= scan.nextInt();
		int num= scan.nextInt();
		
		int pwr= power(x, num);
		System.out.println(pwr);
	}

	private static int power(int x, int num) {
		if(num==0)
			return 1;
//		int pwm1 = power(x , num-1);
//		int p= x*pwm1;
//		return p;
	
		int pwm2= power(x, num/2);
		int p = pwm2 *pwm2;
		 	 	
		if(num %2==1)
			p= p*x;
		
		return p;
	}
	

}
