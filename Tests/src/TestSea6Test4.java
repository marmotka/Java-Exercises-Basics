
public class TestSea6Test4 {
	public static void main(String[] args) {
		char[][] matrix = { 
				{ ' ', ' ', ' ', ' ', ' ', ' ', 'b', ' ' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
				{ 'b', 'b', ' ', ' ', ' ', ' ', ' ', ' ' }, 
				{ ' ', ' ', ' ', 'b', ' ', ' ', ' ', 'b' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', ' ', 'b', ' ', ' ', 'b' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, 
				{ 'b', ' ', ' ', ' ', ' ', ' ', ' ', ' ' } };

		int kingRow = 3;
		int kingCol = 1;
		int knigthRow = 7;
		int knigthCol = 3;
		matrix[kingRow][kingCol] = 'x';
		matrix[knigthRow][knigthCol] = 'S';
		boolean wins = knightWin(matrix, knigthRow, knigthCol);
		System.out.println(wins);
		printMatrix(matrix);

	}

	static boolean knightWin(char[][] mat, int row, int col) {
		if (mat[row][col] == 'x') {
			return true;
		}
		if (mat[row][col] == ' ') {
			mat[row][col] = '-';
		}
		if (isValid(mat, row - 1, col - 2) && knightWin(mat, row - 1, col - 2)) {
			return true;
		}
		if (isValid(mat, row - 2, col - 1) && knightWin(mat, row - 2, col - 1)) {
			return true;
		}
		if (isValid(mat, row - 2, col + 1) && knightWin(mat, row - 2, col + 1)) {
			return true;
		}
		if (isValid(mat, row - 1, col + 2) && knightWin(mat, row - 1, col + 2)) {
			return true;
		}
		if (isValid(mat, row + 1, col - 2) && knightWin(mat, row + 1, col - 2)) {
			return true;
		}
		if (isValid(mat, row + 2, col - 1) && knightWin(mat, row + 2, col - 1)) {
			return true;
		}
		if (isValid(mat, row + 2, col + 1) && knightWin(mat, row + 2, col + 1)) {
			return true;
		}
		if (isValid(mat, row + 1, col + 2) && knightWin(mat, row + 1, col + 2)) {
			return true;
		}
		return false;
	}

	static boolean isValid(char[][] matr, int row, int col) {
		if (row >= 0 && row < matr.length && col >= 0 && col < matr[0].length && matr[row][col] != 'b' && matr[row][col] != '-') {
			return true;
		} else {
			return false;
		}
	}

	static void printMatrix(char[][] matr) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[0].length; j++) {
				if (matr[i][j] == '0') {
					matr[i][j] = ' ';
				}
				System.out.print(matr[i][j] + "|");
			}
			System.out.println();

		}
	}
}
