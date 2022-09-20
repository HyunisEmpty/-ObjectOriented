import java.util.*;
// An exploration of basic input and output.
class BasicIO {
	// Reads and processes string input.
	public static void main(String[] args) {
			Scanner stdin = new Scanner(System.in);
			// get first input
			System.out.print("Enter your name: ");
			String name = stdin.nextLine();
			// display output on console
			System.out.println("your name is " + name);
			
			System.out.print("Enter your age: ");
			int year = stdin.nextInt();
			int day = 1;
			day = day * 365;
			
			System.out.println("your age is " + year);
			System.out.println("your day is " + day);
			
			System.out.print("Enter your height: ");
			int height = stdin.nextInt();
			System.out.println("your height is " + height);
			
			System.out.printf("2003년 06월 02일 현재 박현빈의 키는 177입니다.");
	} // method main
} // class BASIC_IO