package javaPrograms;

public class Switchcase {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 7;
		int c = a-b;
		
		switch(c) {
		case 1 : 
		System.out.println("c value is 1");
		break;
		
		case 2 : 
	    System.out.println("c value is 2");
		break;
		
		case 3 : 
		System.out.println("c value is 3");
		break;
		
		case 4 :
		System.out.println("c value is 4");
		break;
		
		default:
			System.out.println("c value is nothing but out of range");
		break;
		}
		
	}

}
