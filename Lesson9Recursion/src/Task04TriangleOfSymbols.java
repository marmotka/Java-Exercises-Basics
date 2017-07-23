import java.util.Scanner;

public class Task04TriangleOfSymbols {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter begin number: ");
		int beg = sc.nextInt();
		System.out.println("Enter end number: ");
		int end = sc.nextInt();
		sc.close();
		printTriangle(beg,end);
	}

	static String printTriangle(int start, int end) {
		String printLine = "";
		if (end == start) {
			System.out.println(start);
			return printLine + start;
		} else {			
			printLine += printTriangle(start, end - 1) + " " + end;
			System.out.println(printLine);
			return printLine;
		}
	}
}
