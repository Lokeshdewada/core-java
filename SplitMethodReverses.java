package practiceJavaprogram;

public class SplitMethodReverses {

	public static void main(String[] args) {
		//Reverse string charat  method
		String s1 = "ABCD";
		String rev=" ";
		
		int len = s1.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
	}
		System.out.println("Reverse string is:"+ rev);

	}

}
