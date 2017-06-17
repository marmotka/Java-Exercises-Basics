import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		double num1 = sc.nextDouble();
		System.out.println("Enter second number:");
		double num2 = sc.nextDouble();
		System.out.println("Enter third number:");
		double num3 = sc.nextDouble();
	
		if (num1 < num2) {
			if (num3 <= num1) {
				System.out.println(num3);
				System.out.println(num1);
				System.out.println(num2);
			} else if (num3 > num1 && num3 < num2){
				System.out.println(num1);
				System.out.println(num3);
				System.out.println(num2);
			} else {
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(num3);
			}
		} else { 							//(num1 > num2)
			if (num3 <= num2) {
				System.out.println(num3);
				System.out.println(num2);
				System.out.println(num1);
			} else if (num3 > num2 && num3 < num1){
				System.out.println(num2);
				System.out.println(num3);
				System.out.println(num1);
			} else {
				System.out.println(num2);
				System.out.println(num1);
				System.out.println(num3);
			}
		}
	}
}