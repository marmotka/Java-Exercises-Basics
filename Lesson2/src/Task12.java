import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the date - dd/mm/yy:");
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		int monthDays = 31;
		int nextDay = ++day;
		if (month == 2) {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) { // LeapYear																			
				monthDays = 29;
			} else {
				monthDays = 28;
			}
		} else if ((month < 7 && month % 2 == 0) || (month > 7 && month % 2 == 1)) {
			monthDays = 30;
		}
		if (nextDay > monthDays) {
			nextDay = 1;
			month++;
			if (month > 12) {
				year++;
			}
		}
		System.out.printf("%d,%d,%d", nextDay, month, year);
	}
}
