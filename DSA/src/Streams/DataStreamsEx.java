package Streams;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataStreamsEx {
	
	class Student{
		int rollno;
		String name;
		String dept;
		
	}
	
	public class StudentDemo{
		
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\pb67966\\git\\repository43\\DSA\\src\\Source.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		Student s= new Student();
		s.rollno=11;
		s.name="Pavan";
		s.dept="ECE";
		
		
		dos.writeInt(s.rollno);
		dos.writeUTF(s.name);
		dos.writeUTF(s.dept);
		
		
		dos.close();
		fos.close();
	}
}
}
