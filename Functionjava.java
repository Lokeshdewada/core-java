package javaPrograms;

public class Functionjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String a = "abcd";

		String b = "xyz";

		String c = "abcd xyz klmn 1234 4567";
		
//		Req1: length of the a variable should be greater than length of b and should be
//		less than length of c
		if (a.length() > b.length() == true && a.length() < c.length() == true) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}


//		Req2: concatenate a and b variables and verify length should be less than c
//		variable length or greater than 5
		if (a.concat(b).length() < c.length() || a.concat(b).length() > 5) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}


//		Req3: a variable should start with “ab” and b variable should not ends with “yz”
		
		if (a.startsWith("xy") && b.endsWith("yz")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

//		Req4: c variable should contains space and should not contains 9
		if (c.contains(" ") && c.contains("9") == false) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

//		Req5: 7th position in a c variable should be y or z and k should be available in the
//		either 10th or 11th positions.
		if (c.indexOf("y") == 7 || c.indexOf("z") == 7 && c.indexOf("k") == 10 || c.indexOf("k") == 11) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}

//		Req6: split c variable into multiple strings with “ ”(space) and verify length of the
//		array should be 4 or 5
		String[] arr = c.split(" ");
		if (arr.length == 4 || arr.length == 5) {
			System.out.println("Pass");
		} else {
			System.out.println("fail");
		}

//		Req7: verify first string of the c variable should be same as a variable and should
//		not be same as 3rd string of the c variable.
		
		if (arr[0].equals(a) && arr[0].equals(arr[2]) == false) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}


	}

}
