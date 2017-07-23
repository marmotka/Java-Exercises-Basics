import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
				
		System.out.println("Enter name");
		String firstName = sc.nextLine();
		String secondName = sc.nextLine();
		String thirdName = sc.nextLine();
		System.out.println("" + firstName.charAt(0) + secondName.charAt(0) + thirdName.charAt(0));
	}
}
