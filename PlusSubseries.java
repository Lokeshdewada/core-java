package practiceJavaprogram;

import java.util.Scanner;

public class PlusSubseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=a; i++) {
			if(i%2==0) {
				sum = sum-i;
			}
			else {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
