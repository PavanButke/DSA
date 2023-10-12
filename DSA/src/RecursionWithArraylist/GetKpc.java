package RecursionWithArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKpc {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String exp = scan.nextLine();
		ArrayList<String>result= getKeypadComb(exp);
		System.out.println(result);
	}

	public static String keypad[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	public static ArrayList<String> getKeypadComb(String str){
		 
		if(str.length()==0)
		{
			ArrayList<String> resultNull= new ArrayList<>();
			resultNull.add("");
			return resultNull;
		}
		
		String roq= str.substring(1);
		ArrayList<String> rres= getKeypadComb(roq);
		String word= keypad[Integer.parseInt(str.charAt(0)+"")];
		ArrayList<String> myList = new ArrayList<>();
		for(int i=0 ; i< word.length(); i++)
		{
			for(String comb: rres )
			{
				myList.add(word.charAt(i)+comb);
			}

		}
		return myList;
		
	}	
}
