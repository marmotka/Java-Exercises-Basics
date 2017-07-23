import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String text = sc.nextLine();
		int countWords = 1;
		int maxLetters = 0;
		int countLetters = 0;
		int longestWordIndex = -1;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				countLetters = 0;
				countWords++;
				continue;
			}
			++countLetters;
			if (countLetters > maxLetters) {
				maxLetters = countLetters;
				longestWordIndex = i;
			}
		}
		String longestWord = text.substring((longestWordIndex - maxLetters + 1), longestWordIndex + 1);
		System.out.printf("There are %d words in the message and the longest word is %s with %d letters ", countWords,
				longestWord, maxLetters);
	}
}
