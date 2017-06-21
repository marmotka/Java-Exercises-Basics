import java.util.Scanner;

public class TaskExtra04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] calen = new int[12][];
		calen[0] = new int[31];
		calen[1] = new int[28];
		calen[2] = new int[31];
		calen[3] = new int[30];
		calen[4] = new int[31];
		calen[5] = new int[30];
		calen[6] = new int[31];
		calen[7] = new int[31];
		calen[8] = new int[30];
		calen[9] = new int[31];
		calen[10] = new int[30];
		calen[11] = new int[31];

		while (true) {
			System.out.println("Enter month: ");
			int month = sc.nextInt();
			System.out.println("Enter holiday: ");
			int day = sc.nextInt();
			calen[month - 1][day - 1]++;
			System.out.print("More hoidays? y/n ");
			char sym = sc.next().toLowerCase().charAt(0);
			if (sym == 'n') {
				break;
			}
		}

		int maxHolidaysMonth = 0;
		int rowIndexMaxHolidays = -1;
		int period = 0;
		int maxPeriod = 0;
		int periodRow = -1;
		int periodCol = -1;
		int[] columnSum = new int[31];

		for (int row = 0; row < calen.length; row++) {
			int countHolidays = 0;

			for (int col = 0; col < calen[row].length; col++) {
				columnSum[col] += calen[row][col];
				if (calen[row][col] != 0) {
					countHolidays++;
					if (col > 0 && calen[row][col - 1] != 0) {
						period++;
						if (period > maxPeriod) {
							maxPeriod = period;
							periodRow = row;
							periodCol = col;
						}
					} else {
						period = 0;
					}
				}
			}
			if (countHolidays > maxHolidaysMonth) {
				maxHolidaysMonth = countHolidays;
				rowIndexMaxHolidays = row;
			}

		}
		int maxCol = 0;
		int dateCommon = 0;
		for (int i = 0; i < columnSum.length; i++) {
			if (columnSum[i] > maxCol) {
				maxCol = columnSum[i];
				dateCommon = i;
			}

		}

		for (int row = 0; row < calen.length; row++) {
			for (int col = 0; col < calen[row].length; col++) {
				System.out.print(calen[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println("Month with most number of holidays is : " + (rowIndexMaxHolidays + 1));
		for (int i = 0; i < calen[rowIndexMaxHolidays].length; i++) {
			if (calen[rowIndexMaxHolidays][i] != 0) {
				System.out.print((i + 1) + " ");
			}
		}
		System.out.println();
		System.out.println("Most common holiday date is: " + (dateCommon + 1));
		System.out.println("max period with holidays is in month: " + (periodRow + 1) + " on date: "
				+ (periodCol + 1 - maxPeriod) + " till date: " + (periodCol + 1));

	}
}
