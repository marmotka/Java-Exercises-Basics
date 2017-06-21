import java.util.Arrays;
import java.util.Scanner;

public class Task02TwoWords {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String text;
		do {
			System.out.println("Enter two words each with 10-20 symbols: ");
			text = sc.nextLine();
		} while (!validInput(text));

		String[] words = text.split(" ", 2);
		words = replace5symbols(words);
		System.out.println(words[0].length() > words[1].length() ? (words[0].length() + " " + words[0].toString())
																 : (words[1].length() + " " + words[1].toString()));
		System.out.println(Arrays.toString(words));
	}

	static String[] replace5symbols(String[] arr) {
		String firstFiveSym0 = arr[0].substring(0, 5);
		String firstFiveSym1 = arr[1].substring(0, 5);
		arr[0] = arr[0].replace(firstFiveSym0, firstFiveSym1);
		arr[1] = arr[1].replace(firstFiveSym1, firstFiveSym0);
		;
		return arr;
	}

	static boolean validInput(String text) {
		if (!text.contains(" ")) {
			System.out.println("The words must be separated with interval!");
			return false;
		} else {
			String[] words = text.split(" ", 2);
			if (validWordLength(words[0]) && validWordLength(words[1])) {
				return true;
			} else {
				System.out.println("The words are not with valid length! ");
				return false;
			}
		}
	}

	static boolean validWordLength(String word) {
		if (word.length() >= 10 && word.length() <= 20) {
			return true;
		} else {
			return false;
		}
	}
}
