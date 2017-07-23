import java.util.Scanner;

public class Test1Sea5v2Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matrixLength = 10;
		char[][] matrix = new char[matrixLength][matrixLength];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = '0';
			}
		}
		int num = 1;
		do {
			System.out.printf("Eneter 2 coordinates for %d value: on separate lines: \n", num++);
			int row = sc.nextInt();
			int col = sc.nextInt();
			if (cellInRange(matrix, row, col)) {
				matrix[row][col] = '*';
			} else {
				System.out.println("Invalid coordinates");
			}
		} while (num < 11);

		int indexRowEmpty = -1;
		int indexColEmpty = -1;
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[i][0] != '*') {
				indexRowEmpty = i;
				break;
			} else if (matrix[0][i] != '*') {
				indexColEmpty = i;
				break;
			}
		}
		if (indexRowEmpty != -1) {
			mine(matrix, indexRowEmpty, 0);
		} else {
			mine(matrix, 0, indexColEmpty);
		}

		printMatrix(matrix);

	}

	static void mine(char[][] matrix, int row, int col) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == '*') {
					for (int k=-1; k <=1; k++){
						for (int l=-1; l<=1; l++){
							if ( cellInRange (matrix,(i+k),(j+l)) && matrix[i+k][j+l] != '*') {
								matrix[i+k][j+l]++;
							}
						}
					}
					
				}
			}
		}
	}

	static boolean cellInRange(char[][] matri, int row, int col) {
		if ((row >= 0 && row < matri.length) && (col >= 0 && col < matri[0].length)) {
			return true;
		} else {
			return false;
		}
	}

	static void printMatrix(char[][] matr) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[0].length; j++) {
				if (matr[i][j]=='0'){
					matr[i][j]=' ';
				}
				System.out.print(matr[i][j]+ "|");
			}
			System.out.println();
			
		}
	}

}