import java.util.Scanner;
// An exploration of basic input and output.
class LowerCaseTester {
	// Reads and processes string input.
	public static void main(String[] args) {
		String testString = "This is a Test";
		String smallTestString = testString.toLowerCase();
		
		System.out.println(smallTestString);
		
		String bigTestString = smallTestString.toUpperCase();
		System.out.println(bigTestString);
	} // method main
} // class BASIC_IO