package javaPrograms;

public class Nestedforloop {

	public static void main(String[] args) {
		
		
		// Nested for loop condition 
		
		for(int i=1; i<6; i++) {
			for ( int j=1; j<6; j++) {
				 for(int k=1; k<6; k++) {
				System.out.println(i+" - "+j+" - "+k);
			}
		  }
		}
	}
}
