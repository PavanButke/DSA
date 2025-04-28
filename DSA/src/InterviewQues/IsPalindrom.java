package InterviewQues;

public class IsPalindrom {

	
	public static void main(String[] args)
	{
		String str= "madam";
		boolean isPalindrome=true;
		
		for(int i=0 ; i< str.length(); i++)
		{
			if(str.charAt(i) != str.charAt(str.length()-i-1))
			{
				isPalindrome= false;
				break;
			}
		}
		
		if(isPalindrome)
				System.out.println("Is a palindrome");
		else
			System.out.println("Not a palindrome");
	}
	
}

