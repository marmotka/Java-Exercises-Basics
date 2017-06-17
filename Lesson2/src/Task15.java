import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the time:");
		int time = sc.nextInt();
		if ((time >= 18 && time <= 24) || (time >= 0 && time < 4)) {
			System.out.println("Good evening!");
		} else if (time >= 4 && time < 9) {
			System.out.println("Good morning!");
		} else if (time >= 9 && time < 18) {
			System.out.println("Good day!");
		} else {
			System.out.println("Invalid time!");
		}
	}
}
