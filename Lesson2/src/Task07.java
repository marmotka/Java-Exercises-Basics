import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the time:");
		int time = sc.nextInt(); 			// not related
		System.out.println("Please enter your money:");
		double sumMoney = sc.nextDouble();
		System.out.println("Please enter if you feel well:");
		boolean ifHealthy = sc.nextBoolean();

		if (!ifHealthy) {
			System.out.println("I don't feel very well, so I'm not going out!");
			if (sumMoney > 0) {
				System.out.println("I'll buy some medicine!");
			} else {
				System.out.println("I'll drink tea at home!");
			}
		} else {
			if (sumMoney > 10) {
				System.out.println("I'll go to watch a movie with friends!");
			} else {
				System.out.println("I'll drink coffee with friends!");
			}
		}
	}
}
