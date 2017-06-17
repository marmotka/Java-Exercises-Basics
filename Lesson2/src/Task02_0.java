import java.util.Scanner;

public class Task02_0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number A:");
		int numA = sc.nextInt();
		System.out.println("Enter number B:");
		int numB = sc.nextInt();

		int sum = numA + numB;
		int diff = numA - numB;
		int product = numA * numB;

		System.out.printf("Sum is " + sum);
		System.out.println();
		System.out.printf("Difference is " + diff);
		System.out.println();
		System.out.printf("Product is " + product);
		System.out.println();
		if (numB != 0) {
			int division = numA / numB;
			int modulus = numA % numB;
			System.out.printf("Division is " + division);
			System.out.println();
			System.out.printf("Module is " + modulus);
		} else {
			System.out.println("Division by zero is undefined");
		}
	}
}
