package StringBuilder;

import java.util.Scanner;

public class DiffInChar {

	public static void main(String ...args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(diffInChar(str));
	}

	private static String diffInChar(String str) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(str);
		for(int i=0 ; i< str.length() ; i++)
		{
			if(i== str.length()-1)
			{
				char chi= str.charAt(i);
				sb.append(chi);
			}else {
				char chi= str.charAt(i);
				char chip1 = str.charAt(i+1);
				sb.append(chi);
				sb.append(chip1-chi);
			}
		}
		
		return sb.toString();
	}
}
