package javaPrograms;

public class Equals_equalsIgnoreCase {

	public static void main(String[] args) {
		
		// Equals and ewualsIgnoranceCase
		
		String a = "Lokesh SDET in fynd QA";
		String b = "Lokesh in sati 2023 passout";
		String c = "Lokesh SDET in fynd qa";
		
		System.out.println(a.equals(c));
       System.out.println(a.equalsIgnoreCase(c));
	}

}
