package Patterns;

import java.util.Scanner;

public class PrimeFactorization {
    

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
    //another approch
    for(int div = 2 ; div * div<=n ; div++)
    {
        while(n%div==0)
        {
            System.out.print(div+"");
            n= n/div;
        }
        
    }
    if(n>1)
    {
        System.out.print(n);
    }
   }
  
    
}
