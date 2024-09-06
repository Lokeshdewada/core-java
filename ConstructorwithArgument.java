package javaPrograms;

public class ConstructorwithArgument {

	//Creating Variable 
	int a ;
	int b ;
	
	//Creating Constructor with Argument
	public ConstructorwithArgument(int m1, int m2) {
		
		a = m1;
		b = m2;
	}
	//Creating Method 
	public void total() {
		System.out.println(a+b);
	}
	public void average() {
		System.out.println((a+b)/2);
	}
	public static void main(String[] args) {
		
		ConstructorwithArgument s1 = new ConstructorwithArgument(48, 80);
		s1.total(); s1.average();
		
		ConstructorwithArgument s2 = new ConstructorwithArgument(65, 98);
		s2.total(); s2.average();

	}

}
