package Array;

import java.util.Scanner;

public class FindAnElementInArray {
	
	
	public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int a[] = new int[n];
        //insert n values in array a
        for(int i=0 ; i<a.length ; i++){
            a[i]= scn.nextInt();
            
        }
        int d = scn.nextInt();
        
        int res= numFind(a,d);
        
        System.out.println(res);
    }       


    public static int numFind(int a[], int d){
        for(int i=0; i<a.length;i++){
            if(a[i]==d){
                return i;
            }
       
        }
             return -1;
    }

}
