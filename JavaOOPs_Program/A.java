package oopsConcept;

class B {
	String a  = "Class A";
	public void m2() {
		System.out.println("M2 Method");
	}
}

public class A extends B{
	String a  = "Class B";
	public void m1() {
		System.out.println(this.a);
	}
		
    public static void main(String[] args) {
    	
    	A obj =  new A();
    	obj.m1();
    }
}
//two important key for inheritance in java
//super
//this 


