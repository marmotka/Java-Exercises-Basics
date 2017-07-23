import java.util.Scanner;

public class Task05Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word");
		String w1 = sc.nextLine();
		String anag = sc.nextLine();
		
		if (w1.length()!=anag.length()){
			System.out.println("Not an Anagram");
			return;
		}
		boolean isAnagram = true;

		for (int i = 0; i < anag.length(); i++) {
			boolean hasLetter = false;
			for (int j = 0; j < w1.length(); j++) {
				if (anag.charAt(i) == w1.charAt(j)) {
					hasLetter = true;
				}
			}
			if (!hasLetter) {
				isAnagram = false;
				break;
			}
		}
		System.out.println(isAnagram ? "It is an Anagram" : "Not an Anagram");
	}
}
