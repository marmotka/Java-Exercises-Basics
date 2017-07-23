import java.util.Scanner;

public class Task04TriangleVoid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter begin number: ");
		int begin = sc.nextInt();
		System.out.println("Enter end number: ");
		int end = sc.nextInt();
		sc.close();
		printTriangle(begin, end);
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
