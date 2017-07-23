import java.util.Scanner;

public class Task08Palindrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		boolean isPalindrom = false;
		for (int i = 0; i < text.length()/2; i++) {
			if	(text.charAt(i) == text.charAt(text.length()-1-i)){
				isPalindrom = true;
			} else {
				isPalindrom = false;
				break;
			}
		}
	System.out.println(isPalindrom ? "The word is Palindrom" : "The word is NOT palindrom");
	}
	
}
