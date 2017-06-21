import java.util.Scanner;

public class Task114MatrixSnake {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter columns: ");
		int cols = sc.nextInt();
		int[][] matrix = new int[rows][cols];
		int value = 11;

		for (int col = 0; col < matrix[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < matrix.length; row++) {
					matrix[row][col] = value++;

				}
			} else {
				for (int row = matrix.length - 1; row >= 0; row--) {
					matrix[row][col] = value++;

				}
			}
		}

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");

			}
			System.out.println();
		}
	}
}
