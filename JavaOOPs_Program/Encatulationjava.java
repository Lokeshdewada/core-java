package oopsConcept;

class Student {
	private int rollno;
	String name;
	
	//Getter and Setter /method to use a program
	public void setRollno(int a) {
		rollno = a;
	}
	public int getRollno() {
		return rollno;
	}
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
}
public class Encatulationjava {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setRollno(2);
		s1.setName ("Lokesh");
		
		System.out.println(s1.getRollno());

	}

}
