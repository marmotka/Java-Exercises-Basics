import java.util.Scanner;

public class Task02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number A:");
		double numA = sc.nextDouble();
		System.out.println("Enter number B:");
		double numB = sc.nextDouble();

		double sum = numA + numB;
		double diff = numA - numB;
		double product = numA * numB;
		System.out.printf("Sum is " + sum);
		System.out.println();
		System.out.printf("Difference is " + diff);
		System.out.println();
		System.out.printf("Product is " + product);
		System.out.println();
		if (numB != 0) {
			double division = numA / numB;
			double module = numA % numB;
			System.out.printf("Division is " + division);
			System.out.println();
			System.out.printf("Module is " + module);
		} else {
			System.out.println("Division by zero is undefined");
		}
	}
}
