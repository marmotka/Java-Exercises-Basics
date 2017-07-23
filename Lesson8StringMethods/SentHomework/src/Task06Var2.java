import java.util.Scanner;

public class Task0602Var {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String text = sc.nextLine();
		String textNew = text;
		textNew = textNew.substring(0, 1).toUpperCase() + textNew.substring(1);
		for (int i = 1; i < text.length(); i++) {
			if (text.charAt(i) == ' ') {
				textNew = textNew.substring(0, i + 1) + textNew.substring(i + 1, i + 2).toUpperCase()
						+ textNew.substring(i + 2);
			}
		}
		System.out.println(textNew);
	}
}
