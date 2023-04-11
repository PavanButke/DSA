package Array;

public class Problem {
	
	public static void main(String []args)
	{	int n=300;
		int []arr =new int[n];
		boolean isFirst= true;
		int left=0;
		int count =0;
		int right = arr.length;
		
		
		for(int i=left ; i<=right ; i++){
			int mid =(left+right)/2;
		
			if(isFirst && i<=mid)
			{
				System.out.println("s"+i);
				continue;
			}else {
				System.out.println("k"+count);
				count++;	
			}

			}
		}	
	}



