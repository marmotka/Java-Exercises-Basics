import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 3-digits number:");
		int num = sc.nextInt();
		if (num >= 100 && num <= 999) {
			int firstDigit = num / 100;
			int secondDigit = (num - firstDigit * 100) / 10;
			int thirdDigit = num % 10;
			if (firstDigit == secondDigit && secondDigit == thirdDigit) {
				System.out.println("The digits of the number are equal");
			} else if (firstDigit > secondDigit && secondDigit > thirdDigit) {
				System.out.println("The digits of the number are in ascending order");
			} else if (firstDigit < secondDigit && secondDigit < thirdDigit) {
				System.out.println("The digits of the number are in descending  order");
			} else {
				System.out.println("Digits are unordered");
			}
		} else {
			System.out.println("Not a valid number");
		}
	}
}