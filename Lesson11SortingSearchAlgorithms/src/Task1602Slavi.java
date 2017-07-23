import java.util.Scanner;

public class Task1602Slavi {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Брой редове:");
		int rows = scanner.nextInt();
		System.out.println("Брой колони:");
		int cols = scanner.nextInt();

		int[][] pool = new int[rows][cols];

		for (int i = 0; i < pool.length; i++) {
			for (int j = 0; j < pool[i].length; j++) {
				System.out.printf("Въведете стойност на клетка [%d][%d]:%n", i, j);
				pool[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Въведете елемент, който търсим:");
		int x = scanner.nextInt();

		int left = 0;
		int right = pool[0].length - 1;
		int currentRow = 0;

		int result = -1;
		int index = 0;

		for (int i = 0; i < pool.length; i++) {
			if (result > -1) {
				System.out.printf("Числото е на позиция[%d][%d]!", i, result);
				return;
			}
			result = binarySearch(pool[i], x, left, right);

			if (result > -1) {
				index = i;
			}
		}
		if (result > -1) {
			System.out.printf("Числото е на позиция[%d][%d]!", index, result);
			return;
		}
		System.out.println("Числото го няма!");

	}

	static int binarySearch(int[] currentPool, int x, int left, int right) {
		if (left > right) {
			return -1;
		}
		int mid = (left + right) / 2;

		if (currentPool[mid] == x) {
			return mid;
		} else {
			if (x < mid) {
				return binarySearch(currentPool, x, left, mid - 1);
			} else {
				return binarySearch(currentPool, x, mid + 1, right);
			}
		}
	}
}
