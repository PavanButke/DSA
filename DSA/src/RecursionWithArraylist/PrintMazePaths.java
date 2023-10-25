package RecursionWithArraylist;

import java.util.Scanner;

public class PrintMazePaths {
	
	public static void main(String ...args) {
		Scanner scan = new Scanner(System.in);
		int dr= scan.nextInt();
		int dc= scan.nextInt();
		
		printMazeRoutes(1,1,dr,dc,"");
	}

	public static void printMazeRoutes(int sr, int sc, int dr, int dc, String asf) {
		if(sr==dr && sc==dc)
		{
			System.out.println(asf);
			return;
		}
		
		if(sr>dr || sc> dc)
		{
			return;
		}
		printMazeRoutes( sr, sc+1,dr, dc, asf+"h");
		printMazeRoutes( sr+1, sc,dr, dc, asf+"v");
	}

}
