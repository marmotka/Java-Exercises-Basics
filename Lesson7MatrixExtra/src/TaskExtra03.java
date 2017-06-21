import java.util.Arrays;
import java.util.Scanner;

public class TaskExtra03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nDays = sc.nextInt();
		int[] temp = new int[nDays];

		int sum = 0;
		for (int i = 0; i < temp.length; i++) {
			temp[i] = sc.nextInt();
			sum += temp[i];
		}
		double aver = sum * 1.0 / temp.length * 1.0;

		int maxCountCold = 0;
		int countCold = 0;
		int period = 0;
		int maxPeriod = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] <= aver) {
				countCold++;
				if (countCold > maxCountCold) {
					maxCountCold = countCold;
				}
			} else {
				countCold = 0;
			}

			if (i > 0 && (temp[i - 1] > temp[i])) {
				period++;
				if (period > maxPeriod) {
					maxPeriod = period;
				}
			} else {
				period = 0;
			}
		}

		System.out.println(Arrays.toString(temp));
		System.out.println("Average temp is: " + aver);
		System.out.println(maxCountCold);
		System.out.println(maxPeriod);
	}
}
