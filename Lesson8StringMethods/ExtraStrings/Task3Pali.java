import java.util.Scanner;

public class Task3Pali {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name");
		String word = sc.nextLine();
		boolean isPalindrom = true;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
				isPalindrom = false;
			}
		}
		System.out.println(isPalindrom);
	}
}
