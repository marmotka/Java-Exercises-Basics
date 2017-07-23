import java.util.Scanner;

public class Test1Sea5v1Task4v2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] matrix = {
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', 'b', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', 'b', 'b', '-', '-', '-', '-', 'b', 'b', 'b' },
				{ '-', '-', '-', '-', 'b', 'b', '-', '-', 'b', 'b', 'b', '-' },
				{ '-', '-', '-', '-', '-', 'b', 'b', 'b', 'b', '-', 'b', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', 'b', '-', '-', 'b', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', 'b', 'b', 'b', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' },
				{ '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-' }, };

		System.out.println("Enter x coords: ");
		int rowX = sc.nextInt();
		int colX = sc.nextInt();
		matrix[rowX][colX] = 'x';
		paint(matrix, rowX, colX);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 1; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

	static void paint(char[][] mat, int row, int col) {

	if (mat[row][col] == '-' || mat[row][col] == 'x') {
			if (mat[row][col] == '-') {
				mat[row][col] = 'r';
			}
			if (inRange(mat, row, col - 1)) {
				paint(mat, row, col - 1);
			}
			if (inRange(mat, row, col + 1)) {
				paint(mat, row, col + 1);
			}
			if (inRange(mat, row - 1, col)) {
				paint(mat, row - 1, col);
			}
			if (inRange(mat, row + 1, col)) {
				paint(mat, row + 1, col);
			}

		} else {
			return;
		}

	}

	static boolean inRange(char[][] matr, int rows, int cols) {
		if ((rows >= 0 && rows <= matr.length - 1) && (cols >= 0 && cols <= matr[0].length - 1)) {
			return true;
		} else {
			return false;
		}
	}
}
