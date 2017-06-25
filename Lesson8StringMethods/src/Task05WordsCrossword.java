import java.util.Scanner;

public class Task05WordsCrossword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word: ");
		String w1 = sc.next();
		System.out.println("Enter second word: ");
		String w2 = sc.next();
		int w1Index = -1;
		int w2Index = -1;
		for (int i = 0; i < w1.length(); i++) {
			for (int j = 0; j < w2.length(); j++) {
				if (w1.charAt(i) == w2.charAt(j)) {
					w1Index = i;
					w2Index = j;
					printCrosswords(w1, w2, w1Index, w2Index);
					System.out.println();
				}
			}
		}
	}

	static void printCrosswords(String w1, String w2, int w1Index, int w2Index) {
		for (int i = 0; i < w2.length(); i++) {
			for (int j = 0; j < w1.length(); j++) {
				if (i == w2Index) {
					System.out.print(w1.charAt(j));
				} else if (j == w1Index) {
					System.out.print(w2.charAt(i));
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}
