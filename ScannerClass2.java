package javaPrograms;

import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {
		// Scanner Class two in java
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the a Value");
		
		String a = sc.nextLine();
		
		System.out.println("A value is" +a);
		System.out.println(a.length());

	}

}
