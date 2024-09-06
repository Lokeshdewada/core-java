package practiceJavaprogram;

public class SplitMethodReverseString {

	public static void main(String[] args) {
		//Split method reverse String in java program
		
		String str = "My name is Lokesh";
		String a [] = str.split(" ");
		
		for (int i = 0;i<a.length;i++) {
			System.out.print(a[i] + " " );
		}
		System.out.println("  ");
			for(int i =a.length-1;i>0;i--) {
				System.out.print(a[i] + " ");
			}
	}
}
