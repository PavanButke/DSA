package Patterns;

import java.util.Scanner;

public class Pattern10 {
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();

        int nos=n/2;
        int nis=-1;

        for(int i=1; i<=n ; i++)
        {
            for(int j=1 ; j<=nos ; j++)
            {
                System.out.print("\t");
            }
            System.out.print("*\t");

            for(int j=1 ; j<=nis ;j++)
            {
                System.out.print("\t");
            }
            if(i >1 && i< n)
            System.out.println("*\t");

            if(i<n/2)
            {
                nos--;
                nis= nis+2;
            }else
            {
                nos++;
                nis= nis-2;   
            }
            System.out.println();
        }
    }
}
