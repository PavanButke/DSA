package Patterns;
import java.util.*;
//1. You are given a decimal number n.
//2. You are given a base b.
//3. You are required to convert the number n into its corresponding value in base b.
//Input Format
//A number n
//A base b
//Output Format
//A number representing corresponding value of n in number system of base b

public class DecimalToAnyBase {

	
	  public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      int dn = getValueInBase(n, b);
	      System.out.println(dn);
	   }
	  
	   public static int getValueInBase(int n, int b){
	       
	       int res=0;
	       int power=1;
	       
	       while(n>0){
	           int rem=n%b;
	           res= res+(rem*power);
	           power=power*10;
	           n=n/b;
	       }    
	       
	       return res;
	   }
}
