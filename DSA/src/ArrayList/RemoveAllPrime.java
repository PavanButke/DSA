package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAllPrime {

	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		ArrayList<Integer> al= new ArrayList<>();
		
		for(int i= 0 ; i<n ;i++)
		{
			al.add(scan.nextInt());
		}
		
		solution(al);
		System.out.println(al);
	}

	public static void solution(ArrayList<Integer> al) {
		// TODO Auto-generated method stub
		for(int i=0 ; i<al.size(); i++)
		{
			int val = al.get(i);
			boolean isTheValPrime= isPrime(val);
			
			if(isTheValPrime==true)
			{
				al.remove(i);
				i--;
			}
		}
	}
	
	public static boolean isPrime(int num)
	{
		boolean isPrime=true;
		for(int div=2; div*div<=num ; div++)
		{
			if(num%div==0)
			{
				isPrime=false;
				break;
			}
		}
		
		return isPrime;
	}
	
	
}
