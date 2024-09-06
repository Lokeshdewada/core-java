package javaPrograms;

public class SplitMethodjava {

	public static void main(String[] args) {
		// Split method is reusable method
		
		String a = "Lokesh Fynd in Bangalore";
		
      // split method written type of string value 
		String [] strArr = a.split("");
		String reverse = "";
		for(int i=a.length()-1; i>=0; i--) {
			reverse = reverse + strArr[i];
			
			
		}
		System.out.println(reverse);
	}

}
