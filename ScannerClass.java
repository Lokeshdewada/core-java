package javaPrograms;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// Importing scanner class in java 
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the A value");
		
		int a = sc.nextInt();
		
		System.out.println("Enter the B value");
		
		int b = sc.nextInt();
		
		System.out.println("Addition is" +(a+b));

	}

}
