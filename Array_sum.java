package practiceJavaprogram;

import java.util.Scanner;

public class Array_sum {

	public static void main(String[] args) {
		// Array sum program in java

		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");

		int size = sc.nextInt();
		int array[] = new int[size];
		int sum = 0;
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("sum=" + sum);

	}

}
