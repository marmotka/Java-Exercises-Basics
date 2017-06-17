import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the coordinates of the first field:");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Please enter the coordinates of the second field:");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		if ((x1 >= 1 && x1 <= 8) && (x2 >= 1 && x2 <= 8) && (y1 >= 1 && y1 <= 8) && (y2 >= 1 && y2 <= 8)) {
			if ((x1 + x2 + y1 + y2) % 2 == 0) {
				System.out.println("Fields are with same color");
			} else {
				System.out.println("Fields are with different colors");
			}
		} else {
			System.out.println("Not valid coordinates");
		}
	}
}
