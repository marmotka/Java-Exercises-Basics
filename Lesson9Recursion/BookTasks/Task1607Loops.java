import java.util.Scanner;

public class Task1607Loops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int start = sc.nextInt();
		System.out.println("Enter second number: ");
		int end = sc.nextInt();
		printTriangle(start, end);

	}

	static void printTriangle(int start, int end) {
		int diff =  end-start + 1;
		for (int i = 0; i < diff; i++) {
			int firstNum = start;
			
			for (int j = 0; j <= i; j++) {
				System.out.print(firstNum++);
			}
			System.out.println();
			
		}
	}
}
