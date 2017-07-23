
import java.util.Scanner;

public class Task01LowerUpper {
	public static void main(String[] args) {
		String text1 = readInput();
		String text2 = readInput();
		System.out.print(text1.toUpperCase() + " ");
		System.out.println(text1.toLowerCase());
		System.out.print(text2.toUpperCase() + " ");
		System.out.print(text2.toLowerCase());
	}

	static boolean validateInput(String text) {
		if (text.length() > 40) {
			System.out.println("The text is too long! ");
			return false;
		} else {
			for (int i = 0; i < text.length(); i++) {
				if (!((text.charAt(i) >= 'a' && text.charAt(i) <= 'z')
						|| (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'))) {
					System.out.println("Text must contain latin letters only! ");
					return false;
				}
			}
		}
		return true;
	}

	static String readInput() {

		Scanner sc = new Scanner(System.in);
		String text;
		do {
			System.out.println("Enter string with maximum 40 letters containing [a-z] and [A-Z]: ");
			text = sc.nextLine();
		} while (!(validateInput(text)));
		return text;
	}
}
