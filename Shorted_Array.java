package javaPrograms;

import java.util.Arrays;

public class Shorted_Array {

	public static void main(String[] args) {
	 
		int [] age = { 66, 44, 23, 13, 72};
		Arrays.sort(age);
		System.out.println("Enter the decrease value");
		for(int i= 0;i<=age.length; i++) {
			System.out.println(age[i]);
		}

	}

}
