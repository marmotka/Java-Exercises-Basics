import java.util.Scanner;

public class Task04NamesCompare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = "";
		do {
			System.out.println("Enter full names of two persons, separated with comma: ");
			text = sc.nextLine();
		} while (!validInput(text));
		String[] names = text.split(",");
		int name0Sum = sumLetters(names[0]);

		int name1Sum = sumLetters(names[1]);
		System.out.println(names[0].codePointCount(0, names[0].length()));
		System.out.println(names[0].length());
		System.out.println(name0Sum);
		System.out.println(name1Sum);
		if (name0Sum == name1Sum) {
			System.out.println("The sum of ASCII code of the chars of the both names is equal.");
		} else {
			System.out.println((name0Sum > name1Sum) ? names[0] : names[1]);
		}
	}

	static int sumLetters(String text) {
		int sum = 0;
		for (int i = 0; i < text.length(); i++) {
			sum += text.charAt(i);
		}
		return sum;
	}

	static boolean validInput(String text) {
		int interval = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				interval++;
			}
		}
		if (text.contains(",") && interval == 4) {
			return true;
		} else {
			System.out.println(
					"Each person should have three names separated with interval. Spearate different persons with comma only! ");
			return false;
		}
	}

}
