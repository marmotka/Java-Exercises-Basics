import java.util.Scanner;

public class Task02Plus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		System.out.println(multiply(num1, num2));
	}

	static int multiply(int x, int y) {
		if (y == 1) {
			return x;
		} else {
			return multiply(x, y - 1) + x;
		}
	}
}
