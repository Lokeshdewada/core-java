package oopsConcept;

class Grandparents {
	
	//Multilevel inheritance 
	
	public void gold() {
		System.out.println("Gold");
	}
}
	class Parents1 extends Grandparents { 
		public void lands() {
			System.out.println("Lands");
		}
	}

public class Children  extends Parents1 {
	
	public void shares() {
		System.out.println("Sheres");
	}


	public static void main(String[] args) {
		
	 Children c =  new Children();
	 c.shares(); c.lands(); c.gold();
	 
	 Parents1 p1 = new Parents1();
	 p1.lands(); p1.gold();
	 
	 Grandparents g = new Grandparents();
	 g.gold();

	}
}
