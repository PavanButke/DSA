package Patterns;

import java.util.Scanner;

public class Patter12 {

public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int nst=1;
    int n1=0;
    int n2=1;
    for(int i=1; i<=n ; i++)
    {
        for(int j=1; j<=nst ;j++){
            System.out.print(n1+"\t");
            int num=n1+n2 ;
            n1=n2;
            n2=num;
        }
        System.out.println();
        nst++;
    }
}
    
}
