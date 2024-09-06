package javaPrograms;

public class StringprobleamHomeworkjava {

	public static void main(String[] args) {
		
		// string Problem 4 question homework
		
		String a = "abcdef";
		String b = "xyz1234";
		String c = "abcxy";
		
		//1. Verify length of the A variable should be greater than length of the 	C variable and should be less than length of the B variable.
		
		if (a.length()>c.length() && a.length()>b.length())
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
		
		// 2. A variable should not be same as b variable and c variable
		if (a.equals(b) && a.equals(c)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		

	}

}
