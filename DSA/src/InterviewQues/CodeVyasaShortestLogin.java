package InterviewQues;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodeVyasaShortestLogin {
	
	public static void main(String ...args) throws ParseException
	{
		List<String> loginLogoutTimes= List.of(
				 "2024-02-05 08:00:00", "2024-02-05 08:30:00",
	             "2024-02-05 09:00:00", "2024-02-05 09:15:00"
		);
		
		int thresholdVal= 30*60*1000;
		
		List<String> shortestDur = getShortestDuratation(loginLogoutTimes ,thresholdVal );
		
		System.err.println(shortestDur);
	}

	private static List<String> getShortestDuratation(List<String> logs, int thresholdVal) throws ParseException {
		
		List<String> result = new ArrayList<>();
		
		try {
			for(int i=0 ; i< logs.size() ; i+=2)
			{
				String loginTime = logs.get(i);
				String logoutTime = logs.get(i+1);
				
				SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date loginTime1 = formatter.parse(loginTime);
				Date logoutTime2 = formatter.parse(logoutTime);
				
				long duration = loginTime1.getTime()- logoutTime2.getTime();
				
				if(duration < thresholdVal)
				{
					result.add(loginTime);
				}
				
			}
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		
		return result;
	}
}
