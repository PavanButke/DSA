1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to add the two numbes and print their value in base b.
Input Format
A base b
A number n1
A number n2
Output Format
A number representing the sum of n1 and n2 in base b.

package FunctionAndClasses;

import java.util.Scanner;

public class AdditionToAnybase {
	
	public static void main(String args[]) {
	      Scanner scn = new Scanner(System.in);
	      int b = scn.nextInt();
	      int n1 = scn.nextInt();
	      int n2 = scn.nextInt();
	  
	      int d = getSum(b, n1, n2);
	      System.out.println(d);
		
		
	}
	
	
	
	   public static int getSum(int b, int n1, int n2){
	        int result=0 ;
	        int carry=0;
	        int power=1;
	        
	        while(n1>0 || n2 >0 || carry > 0){
	            int d1 = n1 % 10;
	            int d2 = n2 % 10;
	            n1= n1/10;
	            n2= n2/10;
	            
	            int d= d1+d2+carry;
	            carry= d/b;
	            d= d%b;
	            
	            result += d*power;
	            power = power*10;
	            
	            
	        }
	        
	        return result;
	        
	   }

}
