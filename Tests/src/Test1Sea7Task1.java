import java.util.Scanner;

public class Test1Sea7Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		String text = "";
		int counter = 0;

		do {
			text = sc.nextLine();
			counter++;
			if (!(isValid(text.charAt(0)) && isValid(text.charAt(2)))) {
				System.out.println("Invalid");
			}

		} while (!(text.charAt(0) == 'Q' && text.charAt(2) == 'Q'));
		System.out.println("tries" + (--counter));
	}

	static boolean isValid(char ch) {
		boolean isNumber = (ch >= '2' && ch <= '9');
		boolean isLetter = (ch == 'T' || ch == 'J' || ch == 'Q' || ch == 'K' || ch == 'A');
		boolean isVali = isNumber || isLetter;
		return isVali;
	}
}
