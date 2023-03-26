package Patterns;

import java.util.Scanner;

public class PyrhagoreanTriplet {
    
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n1= scan.nextInt();
    int n2= scan.nextInt();
    int n3= scan.nextInt();
    
    boolean isPT= false;
    if(n1*n1 == (n2*n2 + n3*n3))
    {
        isPT= true;
   }
   else if(n2*n2 == (n1*n1 + n3*n3))
   {
       isPT = true;
   }
   else if(n3*n3 == (n2*n2 + n1*n1))
   {
       isPT = true;
   }
   System.out.println(isPT);
  }
  
}
