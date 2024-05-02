package codevyasa;

import java.util.Scanner;

//Given a string "aadddbbfffffffhhhhiiiff"
//Find the count of longest consecutively repeating character in the string
//7

public class CountOfLongestStr {

		public static void main(String ...args)
		{
			String str = "aadddbbffffffhhhhhhhhiiiff";
			int countStr = findCountOfString(str);
			System.out.println(countStr);
		}

		private static int findCountOfString(String str) {
			
			int countMaxm= 1;
			int count=1;
			char first = str.charAt(0);
			for(int i=1 ; i< str.length(); i++)
			{
				char curr = str.charAt(i);
				if(curr == first)
				{
					count++;
				}
				else {
					countMaxm = Math.max(countMaxm, count);
					count=1;
					first = curr;
				}
				
			}
			
			countMaxm = Math.max(countMaxm, count);
			
			return countMaxm;
		}
	
		
}


singleton:
	
	class MyClass{
		
		private MyClass() { 
			
		}
		
		public void getInstance() {
			
		}
	}

Factory()
{
	typeOfClothes
	
}

Consider a table employees with columns f_name, l_name and salary
Find all the employees who have salary greater than
that of any employee with the first name 'Pavan'

Pavan	 B  100$
Roshan 	 B  200
Amit 	B 250
Pavan	B 90

SELCT * Emp where salary  > (select MIN(salary) from Emp where Fname="Pavan")

			>90



