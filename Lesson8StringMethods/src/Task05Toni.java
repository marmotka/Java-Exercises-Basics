import java.util.Scanner;

public class Task05Toni {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string : ");
		String firstString = scanner.nextLine();
		System.out.println("Enter first string : ");
		String secondString = scanner.nextLine();

		int firstStringMatchIndex = -1;
		int secondStringMatchIndex = -1;

		for (int i = 0; i < firstString.length(); i++) {

			char current = firstString.charAt(i);

			if (secondString.indexOf(current) >= 0) {
				firstStringMatchIndex = i;
				secondStringMatchIndex = secondString.indexOf(current);
				break;
			}
		}
		String empty = "";
		int repeater = firstStringMatchIndex;
		while (repeater > 0) {
			empty += " ";
			repeater--;
		}
		System.out.println(firstStringMatchIndex + " " + secondStringMatchIndex);
		for (int i = 0; i < secondString.length(); i++) {
	//	for (int i = 0; i < firstString.length(); i++) {
			if (i == secondStringMatchIndex) {
				System.out.println(firstString);
			} else {
				System.out.print(empty);
				System.out.println(secondString.charAt(i));
			}
		}
//		System.out.println(empty + secondString.charAt(secondString.length() - 1));
	}
}