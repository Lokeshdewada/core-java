package oopsConcept;

public class EncaptulationClass {
                // Example about Encaptulation

	private String name;
	public String getName() {
		return name;
	}
	private int age;
	
	public int getAge() {
		return age;
	} 
	public void setName(String name) {
		if(name.length() < 4 || name.length() > 10)
			
			throw new RuntimeException("The name should be accept 4 to 7 character");
	}
	
	public void setAge(int age) {
		if(age<18 || age>60)
			throw new RuntimeException("Age should be in between 18 to 59");
	}
	public static void main(String[] args) {



	}

}
