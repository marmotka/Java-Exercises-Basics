import java.util.Scanner;

public class Task10asciiCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String text = sc.nextLine();
		StringBuilder newText = new StringBuilder("");
		sc.close();
		for (int i = 0; i < text.length(); i++) {
			newText.append((char) (text.charAt(i) + 5));
		}
		System.out.println(newText);
	}
}
