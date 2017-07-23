import java.util.Scanner;

public class Task1606 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(reverseNum(num, 0));

	}

	static int reverseNum(int n, int rev) {
		if (n / 10 == 0) {
			rev = rev * 10 + n;
			return rev;
		}
		int remain = n % 10;
		n = n / 10;
		rev = rev * 10 + remain;
		return reverseNum(n, rev);
	}
}
