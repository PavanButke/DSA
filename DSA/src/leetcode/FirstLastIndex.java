package leetcode;

public class FirstLastIndex {
	public static void main(String[] args) {
	    int []nums={5,7,7,8,8,10};
	    
	    int target =8;
		searchRange(nums , target);
	}
	
	public static int[] searchRange(int[] nums, int target) {
        //bruteforce
        int []arr= new int[2];
        int freqFirst=-1;
        int freqLast=-1;

        for(int i=0 ; i < nums.length ; i++)
        {
            if(nums[i] == target ){
                if(freqFirst == -1)
                {
                    freqFirst=i;
                }else if(freqFirst != -1){
                    freqLast=i;
                }
            }
        }
        arr[0]=freqFirst;
        arr[1]=freqLast;
        return arr;

    }
}
