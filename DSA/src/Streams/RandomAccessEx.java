package Streams;

import java.io.RandomAccessFile;

public class RandomAccessEx {
	
	
	public static void main(String[] args) throws Exception {
		
		RandomAccessFile rf= new RandomAccessFile("C:\\Users\\pb67966\\git\\repository43\\DSA\\src\\Source.txt", "rw");
		
		System.out.println((char)rf.read());
		System.out.println((char)rf.read());
		System.out.println((char)rf.read());

	}

}
