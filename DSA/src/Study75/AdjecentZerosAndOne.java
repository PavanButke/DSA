package Study75;

import java.util.Scanner;

public class AdjecentZerosAndOne {
	
	public static void main(String ...args)
	{
		int []arr = new int[]{1,0,0,0,1};
		System.out.println(canPlaceFlowers(arr, 1));
	
	}
	
	 public static boolean canPlaceFlowers(int[] fls, int n) {
	        int maxM= 0;
	        int fIdx = -1;
	        int lIdx = -1;

	        for(int i=0 ; i< fls.length; i++)
	        {
	            if(fls[i]==0)
	            {
	                continue;
	            }
	            else if(fIdx == -1)
	            {
	                
	                fIdx= i;
	                lIdx= i;
	            }
	            else{
	                lIdx=i;
	            }
	        }

	        //all zeros
	        if(fIdx==-1)
	        {
	            maxM= (fls.length+1)/2;
	        }
	        else{
	            int left= fIdx;
	            int right= fls.length -1 -lIdx;

	            maxM= left/2;
	            maxM += right/2;

	            int count=0;
	            for(int i= fIdx+1; i<= lIdx-1; i++ )
	            {
	                if(fls[i]==0)
	                {
	                    count++;
	                }
	                else{
	                    maxM += (count-1)/2;
	                    count=0;
	                }
	            } 
	             maxM +=(count-1)/2;
	        }
	            return n<=maxM;
	    }

}
