package oopsConcept;

public class Polymorphism {
	public void openSheet(int num){
		System.out.println("Lokesh college Enrlleoment Number:" + num);
		
	}

public void openSheet(String name ) {
	System.out.println("My name is:"+ name);
}

	public static void main(String[] args) {
		//Polymorphism Homework in java class
		
		 Polymorphism obj  = new  Polymorphism();
		 obj.openSheet("0108CS191060");
	
		 obj.openSheet("Lokesh");
		
		

	}

}
