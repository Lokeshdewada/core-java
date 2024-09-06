package javaPrograms;

public class ConstructorWithArg {

	//Creating constructor
	
	public ConstructorWithArg() {
		System.out.println("This is Constructor");
	}
	
	// Creating Methods
	public void method1() {
		System.out.println("This is Method");
	}
	
	public static void main(String[] args) {
		
		ConstructorWithArg obj = new ConstructorWithArg();
		obj.method1();

	}

}
