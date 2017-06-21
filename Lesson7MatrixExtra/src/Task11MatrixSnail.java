import java.util.Scanner;

public class Task11MatrixSnail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter columns: ");
		int cols = sc.nextInt();
		int[][] matrix = new int[rows][cols];
		int value = 10;
		int valueMax = rows * cols + 9;
		char direction = 'D';
		int row = 0;
		int col = 0;

		while (value <= valueMax) {
			matrix[row][col] = value++;
			switch (direction) {
			case 'D':
				if ((row < matrix.length - 1 && matrix[row + 1][col] == 0)) {
					row++;
				} else {
					direction = 'R';
					col++;
				}
				break;

			case 'R':
				if ((col < matrix[0].length - 1 && matrix[row][col + 1] == 0)) {
					col++;
				} else {
					direction = 'U';
					row--;
				}
				break;

			case 'U':
				if ((row > 0 && matrix[row - 1][col] == 0)) {
					row--;
				} else {
					direction = 'L';
					col--;
				}
				break;

			case 'L':
				if ((col >= 1 && matrix[row][col - 1] == 0)) {
					col--;
				} else {
					direction = 'D';
					row++;
				}
				break;
			}
		}

		for (int row1 = 0; row1 < matrix.length; row1++) {
			for (int col1 = 0; col1 < matrix[row1].length; col1++) {
				System.out.print(matrix[row1][col1] + " ");

			}
			System.out.println();
		}
	}
}
