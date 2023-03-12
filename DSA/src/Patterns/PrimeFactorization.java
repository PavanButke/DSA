package Patterns;

import java.util.Scanner;

public class PrimeFactorization {
    

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
    
    int div=2;
    while(n != 1)
    {
        if(n%div==0)
          {
              System.out.print(div+" ");
              n= n/div;
          }
          else
          {
              div++;
          }
          
    }
   }
  
    
}
