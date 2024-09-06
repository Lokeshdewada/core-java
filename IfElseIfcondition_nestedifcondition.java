package javaPrograms;

public class IfElseIfcondition_nestedifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Interview- write a program find the greatest variable among the three number
		
		int a = 40;
		int b = 50;
		int c = 60;
		
		if(a>b && b>c) {
			System.out.println("a is grater");
		}
		else if(b<c){
		    System.out.println("b is grater");
		}
		else {
		    System.out.println("c is grater");
		}
	}

}
