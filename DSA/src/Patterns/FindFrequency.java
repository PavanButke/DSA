package Patterns;

import java.util.*;

//1. You are given a number n.
//2. You are given a digit d.
//3. You are required to calculate the frequency of digit d in number n.
//Input Format
//A number n
//A digit d
//Output Format
//A number representing frequency of digit d in number n

public class FindFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
            
            int count=0;
            
            while(n>0){
                int rem = n%10;
                if( rem==d){
                    count++;
                    
                }
                n=n/10;
            }
            
            return count;
            
    }
}
