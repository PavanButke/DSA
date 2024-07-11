package striver;

import java.util.ArrayList;

public class MergeSortCountInverse {

	    public static int getInversions(int arr[], int n) {

	            return mergeSort(arr , 0 , n-1);
	    }

	    public static int mergeSort(int []arr , int low , int high)
	    {
	        int count=0;

	        if(low >= high)
	        {
	            return count;
	        }

	        int mid = (low + high) /2;

	        count += mergeSort(arr , low, mid);
	        count += mergeSort(arr , mid+1 , high);
	        count += merge(arr , low , mid , high);

	        return count ;
	    }


	    public static int merge(int []arr , int low , int mid , int high)
	    {
	        ArrayList<Integer> asList = new ArrayList<>();
	        int left = low;
	        int right = mid+1;

	        int count =0;

	        while(left <= mid && right <= high){

	            if(arr[left] <= arr[right]){
	                asList.add(left);
	                left++;
	            } else {
	                asList.add(arr[right]);
	                right++;
	            }
	        }

	        while( right <= high){
	            asList.add(arr[right]);
	            right++;            
	        }

	        for(int i=0 ; i<= high ; i++)
	        {
	            arr[i]= asList.get(i- low);
	        }

	        return count;

	    }
	}
}
