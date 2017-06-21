import java.util.Scanner;

public class Task11MatrixDiag {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int n = sc.nextInt();
		System.out.println("Enter columns: ");
		int m = sc.nextInt();

		int[][] matrix = new int[n][m];
		int counter = 10;

		for (int col = 0; col < matrix[0].length; col++) {
			// start new diagonal
			int diRow = 0;
			int diCol = col;
			while (diCol >= 0 && diRow <= matrix.length - 1) {
				matrix[diRow][diCol] = counter++;
				diRow++;
				diCol--;
			}
		}
		for (int row = 1; row < matrix.length; row++) {
			int diRow = row;
			int diCol = matrix[0].length - 1;
			while (diRow < matrix.length && diCol >= 0) {
				matrix[diRow][diCol] = counter++;
				diRow++;
				diCol--;
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
