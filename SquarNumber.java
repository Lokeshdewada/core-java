package javaPrograms;
import java.util.Scanner;
public class SquarNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number a ");
		int a = sc.nextInt();
		int square;
	    square =  a * a;
	    System.out.println("The Square of a Given Number " + a + " = " +square);
	}

}
