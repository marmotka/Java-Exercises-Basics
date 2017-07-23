import java.util.Scanner;

public class Task01Prefix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String word = sc.nextLine();
		String prefix = sc.nextLine();
		boolean ifPrefix = word.startsWith(prefix);
		System.out.println(ifPrefix);

	}
}