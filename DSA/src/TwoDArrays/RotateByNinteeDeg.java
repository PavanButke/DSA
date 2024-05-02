package TwoDArrays;

import java.util.Scanner;

public class RotateByNinteeDeg {
	
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kindly Enter the Size of Arr: ");
		
		int n= scan.nextInt();
		
		System.out.println("Now Enter Values: ");
		int [][] arr= new int[n][n];
		
		
		for(int i=0 ; i<arr.length;i++ )
		{
			for(int j=0 ; j<arr[0].length ; j++)
			{
				arr[i][j] =scan.nextInt();
			}
		}
		
		
		for(int i=0 ; i< arr.length ; i++)
		{
			for(int j=i ; j<arr[0].length ; j++)
			{
				int temp= arr[i][j];
				arr[i][j]= arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		for(int i=0 ; i< arr.length ; i++)
		{
			int left=0;
			int right = arr[i].length-1;
			
			while(left< right)
			{
				int temp= arr[i][left]; //0 0 , 1 , 1
				arr[i][left] = arr[i][right];
				arr[i][right]= temp;
				left++;
				right--;
			}
		}
		
		display(arr);
	}
	
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
