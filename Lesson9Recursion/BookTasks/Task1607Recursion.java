import java.util.Scanner;

public class Task1607Recursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int first = sc.nextInt();
		System.out.println("Enter second number: ");
		int end = sc.nextInt();
		printTriangle(first, end);
	}
	
	static String printTriangle(int first, int last) {
		String printLine = "";
		if (last == first) {
			System.out.println(first);
			return printLine + first;
		} else {			
			printLine += printTriangle(first,last - 1) + " " + last;
			System.out.println(printLine);
			return printLine;
		}
	}
}
