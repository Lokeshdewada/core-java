package javaPrograms;

public class Reversstringjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Lokesh is QA in fynd academy ";
	    String[] b = a.split("");
	    
	    String c = "";
	    for( int i = b.length-1; i>= 0; i--) {
	    	 c = c +  b[i];
	    	
	    	
	    	
	    }
	    System.out.println(c);

	}

	

}
