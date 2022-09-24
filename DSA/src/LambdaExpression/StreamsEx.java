package LambdaExpression;

import java.io.*;

public class StreamsEx {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:/Users/pb67966/git/repository43/DSA/src/Source1.txt");
		
		FileOutputStream fos = new FileOutputStream("Source2.txt");
		
		int fileVar;
		
		while((fileVar=fis.read())!=-1) {
			if(fileVar>=65 && fileVar<=90)
				fos.write(fileVar+32);
			else
				fos.write(fileVar);
			
			
			fis.close();
			fos.close();
		}
	}
	
}
