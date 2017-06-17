import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 3-digits number:");
		int number = sc.nextInt();
		int firstDigit = number / 100;
		int secondDigit = (number - firstDigit * 100) / 10;
		int thirdDigit = number % 10;
		if (firstDigit == 0 || secondDigit == 0 || thirdDigit == 0) {
			System.out.println("This number is invalid! Restart the program and try again!");
		} else {
			if (number % firstDigit == 0 && number % secondDigit == 0 && number % thirdDigit == 0) {
				System.out.println("The number divided by any of its digits leaves no reminder.");
			} else {
				System.out.println("The number divided by one or more of its digits leaves a reminder.");
			}
		}
	}
}
