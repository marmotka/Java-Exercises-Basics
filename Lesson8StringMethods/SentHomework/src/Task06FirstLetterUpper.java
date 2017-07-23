import java.util.Scanner;

public class Task06FirstLetterUpper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String text = sc.nextLine();
		String textNew = text;
		textNew = textNew.replace(textNew.charAt(0), upperChar(textNew.charAt(0)));
		for (int i = 1; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				textNew = textNew.replace(textNew.charAt(i + 1), upperChar(textNew.charAt(i + 1)));
			}
		}
		System.out.println(textNew);
	}

	static char upperChar(char sym) {
		String charToString = String.valueOf(sym);
		charToString = charToString.toUpperCase();
		char symUpper = charToString.charAt(0);
		return symUpper;
	}
}
