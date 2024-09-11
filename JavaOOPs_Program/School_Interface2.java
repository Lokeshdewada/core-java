package oopsConcept;

interface Software {
	
	public void startDate();
	public void endDate();
	public void fee();
	public void sport();
	
}

class School1_Interface1 implements Software {

	public void startDate() {
		System.out.println("4th July");
		
	}

	public void endDate() {
   System.out.println("22nd April");
		
	}

	public void fee() {
		System.out.println("100000");
		
	}
	public void sports() {
		System.out.println("Football");
	}

	public void sport() {
		
		
	}
	
	
}
public class School_Interface2 implements Software  {



	public void startDate() {
		System.out.println("20th July");
		
	}

	public void endDate() {
		System.out.println("2nd May");
		
	}

	public void fee() {
		System.out.println("80000");
		
	}
	public void sport() {
		System.out.println("Football");
	}
	public static void main(String[] args) {
		
		Software s1 = new  School1_Interface1();
		s1.startDate(); s1.endDate(); s1.fee(); s1.sport();
		
	
		
		Software s2 = new   School_Interface2();
		s2.startDate(); s2.endDate(); s2.fee(); s2.sport();
		

	}
}
