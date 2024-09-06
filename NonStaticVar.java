package javaPrograms;

public class NonStaticVar {

	 int a = 20;
	 int b = 30;
	
	// NonStatic varible in java program 
	
	public static void main(String[] args) {
		
		//Creating a Object
		NonStaticVar obj = new  NonStaticVar();
		
		System.out.println(obj.a+obj.b);
	}

}
