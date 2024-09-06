package practiceJavaprogram;

public class CharArrayReverse {

	public static void main(String[] args) {
		//CahrAt array string reverse in java program
		
		String s1 = " Lokesh ";
		String  rev = " ";
		
		char a[]=s1.toCharArray();
		int len = a.length;
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];  
		}
		
            System.out.println("Revered string is:"+ rev);
	}

}
