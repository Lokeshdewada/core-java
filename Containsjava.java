package javaPrograms;

public class Containsjava {

	public static void main(String[] args) {
		
		// Contains in a java program
		
		String a = "Lokesh QA";
		String b = "Lokesh Manual tester QA";
		
		//java is case sensetiv language but is getting a small and capital value are different output
		
//		System.out.println(a.contains("Lokesh"));
//		System.out.println(b.contains(" "));

		 // if else condition in contains
		
		if (a.contains("QA") == true) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
