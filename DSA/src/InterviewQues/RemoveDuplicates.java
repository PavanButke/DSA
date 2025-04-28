package InterviewQues;

import java.util.stream.Collectors;

public class RemoveDuplicates {

//	public static void main(String ...args)
//	{
//		
//		String str = "pavan";
//		
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i=0 ; i<str.length(); i++)
//		{
//			char c= str.charAt(i);
//			
//			
//			if(sb.indexOf(String.valueOf(c))== -1)
//					{
//						sb.append(c);
//					}
//		}
//		
//		System.out.println(sb);
//	}

	


		public static void main(String ...args)
		{
			
			String str = "pavan";
			
			String result = str.chars().distinct().mapToObj(c-> String.valueOf((char)c)).collect(Collectors.joining());
			
			System.out.println(result);
		
	}
}