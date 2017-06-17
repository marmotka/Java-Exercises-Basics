import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers with two digits:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) {
			int product = a * b;
			int lastDigitProduct = product % 10;
			if (lastDigitProduct % 2 == 0) {
				System.out.println(product + "," + lastDigitProduct + " even");
			} else {
				System.out.println(product + "," + lastDigitProduct + " odd");
			}
		} else {
			System.out.println("Not valid numbers");
		}
	}
}
