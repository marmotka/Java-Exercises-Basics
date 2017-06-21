import java.util.Scanner;

public class Task03IfArrayHasASymbol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] array = { 's', 'g', 'd', 'y', '@', 'r', 'k', 'g' };
		System.out.println("Enter the symbol you'd like to check: ");
		char ch = sc.nextLine().charAt(0);
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == ch) {
				index = i;
			}
		}

		System.out.println((index == -1) ? "The array doesn't contain the symbol you entered" : ("The index of the element is: " + index));

	}
}
