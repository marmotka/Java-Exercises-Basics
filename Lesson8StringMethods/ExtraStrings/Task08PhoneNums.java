import java.util.Scanner;

public class Task08PhoneNums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		for (int i = 0; i < text.length(); i++) {
			int count = 0;
			int num = digitInt(text, i);
			int next;
			do {
				count++;
				i++;

			} while ((i < text.length() && num == digitInt(text, i))&& (  (((num >=2 && num <= 6) || num==8) && count<=2) || (( num==7 || num==9 ) && count<=3)));
			
			System.out.println(printChar(num-2, count-1));
			i--;
		}
	}

	static int digitInt(String text, int index) {
		return Character.getNumericValue(text.charAt(index));
	}

	static char printChar(int row, int col) {
		char[][] alphabet = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
				{ 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };
		return alphabet[row][col];
	}
}
