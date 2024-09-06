package practiceJavaprogram;

public class Loopquestionjava {

	public static void main(String[] args) {
		
		String a = "Lokesh is QA in fynd academy ";
	    String[] b = a.split("");
	    
	    String c = "";
	    for( int i = b.length-1; i>= 0; i--) {
	    	 c = c +  b[i];
	    	
	    	
	    	
	    }
	    System.out.println(c);

	}

}