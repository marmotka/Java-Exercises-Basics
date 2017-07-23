import java.util.Scanner;

public class Task03CompareStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings separated with space ");
		String word1 = sc.next();
		String word2 = sc.next();
		String shorterWord = "";

		if (word1.compareTo(word2) == 0) {
			System.out.println("The two entered strings are equal!");
		} else if (word1.length() == word2.length()) {
			System.out.println("The two entered strings have equal length. ");
		} else {
			System.out.println("The words are with different length");
		}
		shorterWord = (word1.length() < word2.length()) ? word1 : word2;

		boolean equalLetters = true;
		for (int i = 0; i < shorterWord.length(); i++) {
			int diff = word1.charAt(i) - (word2.charAt(i));
			if (diff != 0) {
				System.out.println(diff + " " + word1.charAt(i) + "-" + (word2.charAt(i)));
				equalLetters = false;
			}
		}
		if (equalLetters) {
			System.out.println("One of the words contains the other. ");
		}
	}
}
