import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number A:");
		double numA = sc.nextDouble();
		System.out.println("Enter number B:");
		double numB = sc.nextDouble();
		System.out.println("Enter number C:");
		double numC = sc.nextDouble();

		if ((numC > numA && numC < numB) || (numC > numB && numC < numA)) {
			System.out.printf("Number " + numC + " is between numbers " + numA + " and " + numB + "!");
		} else 
		{
			System.out.printf("Number " + numC + " is outside the entered range!");
		}

	}
}
