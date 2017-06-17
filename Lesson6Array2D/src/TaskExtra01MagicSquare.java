import java.util.Scanner;

public class TaskExtra01MagicSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the square of numbers: ");
		int length = sc.nextInt();
		int[][] matrix = new int[length][length];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.println("Enter the value of row: " + row + " and column: " + col);
				matrix[row][col] = sc.nextInt();
			}
		}
//		int[][] matrix = {{16,3,2,13},  // test matrix
//						{5,10,11,8},
//						{9,6,7,12},
//						{4,15,14,1}};				
		int[] arrSumRow = new int[matrix.length];
		int[] arrSumCol = new int[matrix[0].length];
		int diag1 = 0;
		int diag2 = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				arrSumRow[row] += matrix[row][col];
				arrSumCol[col] += matrix[row][col];
				if (row == col) {
					diag1 += matrix[row][col];
				}
				if (row + col == (matrix.length - 1)) {
					diag2 += matrix[row][col];
				}
			}
		}
		boolean isMagic = true;
		if (diag1 != diag2) {
			isMagic = false;
		} else {
			for (int i = 0; i < matrix.length; i++) {
				if (arrSumRow[i] != diag1 || arrSumCol[i] != diag2) {
					isMagic = false;
					break;
				}
			}
		}
		if (isMagic){
			System.out.println("The square is Magic. The sum of every row and column and diagonal is : " + diag1);
		} else {
			System.out.println("The square is not magic! ");
		}
	}
}
