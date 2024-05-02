package InterviewQues;

import java.util.HashMap;
import java.util.Map;

public class FindEvenNumberGtThanTen {
	
	
	public static void main(String ...args)
	{
		Map<String , Integer> numbersMap = new HashMap<>();
		numbersMap.put("A", 1);
		numbersMap.put("B", 0);
		numbersMap.put("C", 35);
		numbersMap.put("D", 310);
		numbersMap.put("E", 402);
		
		
		Map<String , Integer> result= getEven(numbersMap);
		
		for(Map.Entry<String , Integer> even: result.entrySet())
		{
			System.out.println(even.getKey() +": " + even.getValue());
		}
	
	}	

	private static Map<String, Integer> getEven(Map<String, Integer> numbersMap) {
		Map<String , Integer> result = new HashMap<>();
		
		for(Map.Entry<String, Integer> entry : numbersMap.entrySet())
		{
			int number = entry.getValue();
			
			if(number %2==0 && number > 10)
			{
				result.put(entry.getKey() , number);
			}
		}
		
		return result;
	}

}
