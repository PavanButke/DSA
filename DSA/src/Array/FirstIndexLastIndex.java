package Array;

import java.util.Scanner;

public class FirstIndexLastIndex {

	
	public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int arr[] = new int[n];
        
        for(int i=0 ; i< arr.length ; i++){
            arr[i]= scan.nextInt();
        }
        
        int d= scan.nextInt();
        System.out.println(firstIndx(arr,d));
        System.out.println(lastIndx(arr,d));
    
 }
 
 public static int firstIndx(int arr[], int d){
     int low =0 , high = arr.length-1;

     int fi=-1;
     while(low <= high){
              int mid= (low+high)/2;
         if(arr[mid]==d){
             fi=mid;
             high= mid-1;
         }
         else if(arr[mid]<d){
             low = mid+1;
         }
         else if(arr[mid]>d){
             
             high= mid-1;
         }
         
     }
     return fi;
 }
 
 public static int lastIndx(int arr[], int d){
     int low =0 , high = arr.length-1;

     int li=-1;
     while(low <= high){
              int mid= (low+high)/2;
         if(arr[mid]==d){
             li=mid;
             low= mid+1;
         }
         else if(arr[mid]<d){
             low = mid+1;
         }
         else if(arr[mid]>d){
             
             high= mid-1;
         }
         
     }
     return li;
 }
}
