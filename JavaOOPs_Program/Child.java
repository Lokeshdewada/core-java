package oopsConcept;

class Parents {
	
	public void lands() {
		System.out.println("Lands");
	}
}
public class Child extends Parents {

	 public void gold() {
		 System.out.println("Gold");
	 }
	 
	public static void main(String[] args) {
		 
		Child c = new Child();
		c.gold(); c.lands();
		
	//Parents p = new Parents ();
	//	p.lands();
		//single level inheritance in parents to child relation 
        // super class not extend the child class 
		
	}

}
