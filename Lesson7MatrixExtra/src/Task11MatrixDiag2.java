import java.util.Scanner;

public class Task11MatrixDiag2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int n = sc.nextInt();
		System.out.println("Enter columns: ");
		int m = sc.nextInt();
		// int n = 4;
		// int m = 6;

		int[][] matrix = new int[n][m];
		int counter = 10;

		for (int row = 0; row < matrix.length; row++) {
			// start new diagonal
			int diRow = row;
			int diCol = 0;
			while (diRow >= 0 && diCol <= matrix[0].length - 1) {
				matrix[diRow][diCol] = counter++;
				diRow--;
				diCol++;
			}
		}

		for (int col = 1; col < matrix[0].length; col++) {
			int diRow = matrix.length - 1;
			int diCol = col;
			while (diRow >= 0 && diCol <= matrix[0].length - 1) {
				matrix[diRow][diCol] = counter++;
				diRow--;
				diCol++;
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}
}
