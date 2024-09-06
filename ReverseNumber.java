package javaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new  Scanner (System.in);
        System.out.println("enter the number a");
        int a = sc.nextInt();
        int b = 0;
        for(int i= 1; i <=a; i++) {
          int lastdigit = a % 10;
             b =  b * 10 + lastdigit;
             a = a / 10;
             
        }
        System.out.println(b);
	}

}
