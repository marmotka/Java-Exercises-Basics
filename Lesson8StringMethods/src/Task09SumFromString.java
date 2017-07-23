import java.util.Scanner;

public class Task09SumFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String text = sc.nextLine();
		sc.close();
		int sum = 0;
		int digitToInt;
		for (int i = text.length() - 1; i >= 0; i--) {
			if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
				int num = 0;
				int tens = 1;
				do {
					if (text.charAt(i) == '-') {
						num = -num;
						break;
					}
					digitToInt = Character.getNumericValue(text.charAt(i));
//					System.out.println(digitToInt);
					num += tens * digitToInt;
					tens *= 10;
					i--;
				} while ((text.charAt(i) >= '0' && text.charAt(i) <= '9') || (text.charAt(i) == '-'));
				System.out.println(num);
				sum += num;
			}
		}
		System.out.println("The sum of all numbers is: " + sum);
	}
}
