package oopsConcept;

public class MethodOverloading {
	
	public void openSheet(int num) {
		System.out.println("Sheet opened with rollnumber: "+num);
	}
	public void openSheet(String name) {
		System.out.println("Sheet opened with  Name: "+name);
	}
	public static void main(String[] args) {
		// Method Overloading Polymorphism
		// one class we have multiple method in same name in different argument in java
		MethodOverloading obj = new MethodOverloading();
		obj.openSheet(1022);
		obj.openSheet("Lokesh");
 
	}

}
