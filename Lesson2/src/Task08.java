import java.util.Scanner;

public class Task08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number in range 1000 and 9999");
		int numInput = sc.nextInt();
		if (numInput >= 1000 && numInput <= 9999) {
			int firstDigit = numInput / 1000;
			int secondDigit = (numInput % 1000) / 100;
			int thirdDigit = (numInput % 1000 % 100) / 10;
			int forthDigit = numInput % 10;
			int num14Digit = firstDigit * 10 + forthDigit;
			int num23Digit = secondDigit * 10 + thirdDigit;
			if (num14Digit > num23Digit) {
				System.out.println(num14Digit + ">" + num23Digit);
			} else {
				if (num14Digit < num23Digit) {
					System.out.println(num14Digit + "<" + num23Digit);
				} else {
					System.out.println(num14Digit + "=" + num23Digit);
				}
			}
		} else {
			System.out.println("Restart and try with another number in the specific range");
		}
	}

}
