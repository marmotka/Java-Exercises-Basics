
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 int n = Integer.parseInt(sc.nextLine());
		 int m = Integer.parseInt(sc.nextLine());
		 int y = Integer.parseInt(sc.nextLine());



		double dividN = n * 0.5;
		// double dividN = n*1/2.0;
		int count = 0;

		do {

			if (n == dividN && y != 0) {
				n /= y;
				continue;
			}
			n = n - m;
			count++;

		} while (n >= m && n != 0 && m!=0);
		System.out.println(n);
		System.out.println(count);
	}
}
