package FunctionAndClasses;
import java.io.*;
import java.util.*;

public class SpanOfArray {
    

public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int length = scan.nextInt();
    
    int arr[] = new int[length];
    
    int i=0;
    while(arr.length !=0)
    {
        arr[i]=scan.nextInt();
        i++;
    }
    int res= SpanOfArray(arr);
    System.out.println(res);
  }
  
  public static int SpanOfArray(int arr[])
  {
      int max= arr[0];
      int min = arr[0];
      
      for(int i=1; i<arr.length ; i++)
      {
          if(arr[i]> max)
          {
              max= arr[i];
          }
          
          if(arr[i]< min)
          {
              min= arr[i];
          }
          
         
      }
      return max-min;
  }
 
 
}
