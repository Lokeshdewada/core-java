package javaPrograms;
import  java.util.Scanner;
public class SumofDigit {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number a ");
		int a = sc.nextInt();
		int b = 0;
		for(int i = 0; i < a; i++) {
			int  lastdigit = a % 10;
		b = b +  lastdigit;
		a = a / 10 ;
		}
		System.out.println(b);
	}

}
