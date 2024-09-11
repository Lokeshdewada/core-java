package oopsConcept;

class Cow {
	public void Eatgrass() {
		System.out.println("Eatgrass");
	}
}
//Single level Inheritance in java 

public class Animal extends Cow  {
	
	public void Cateatmilk() {
		System.out.println("Cateatmilk");
	}
	public static void main(String[] args) {
		
		Animal A = new Animal();
	   A.Cateatmilk(); A.Eatgrass();
	   
	
	   Cow c = new Cow();

	}	

}
