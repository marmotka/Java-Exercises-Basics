import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number A:");
		int numA = sc.nextInt();
		System.out.println("Enter number B:");
		int numB = sc.nextInt();

		numA = numA + numB;
		numB = numA - numB;
		numA = numA - numB;
		System.out.printf("New value of number A is %d%n", numA);
		System.out.printf("New value of number B is %d", numB);
	}
}
