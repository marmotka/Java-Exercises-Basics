import java.util.Arrays;
import java.util.Scanner;

public class Task02TwoWordsLighter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word1;
		String word2;
		do {
			System.out.println("Enter two words each with 10-20 symbols: ");
			word1 = sc.next();
			word2 = sc.next();
		} while (!(validWordLength(word1) && validWordLength(word1)));

		String firstFiveSym0 = word1.substring(0, 5);
		String firstFiveSym1 = word2.substring(0, 5);
		word1 = word1.replace(firstFiveSym0, firstFiveSym1);
		word2 = word2.replace(firstFiveSym1, firstFiveSym0);

		System.out.println(word1.length() > word2.length() ? (word1.length() + " " + word1.toString())
				: (word2.length() + " " + word2.toString()));
		System.out.println(word1 + " " + word2);
	}

	static boolean validWordLength(String word) {
		if (word.length() >= 10 && word.length() <= 20) {
			return true;
		} else {
			return false;
		}
	}
}
