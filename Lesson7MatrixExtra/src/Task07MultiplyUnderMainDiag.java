
public class Task07MultiplyUnderMainDiag {
	public static void main(String[] args) {
		int[][] matrix = { { 5, 3, 6, 6, 4 }, { 8, 3, 7, 9, 7 }, { 8, 4, 6, 8, 5 }, { 8, 5, 3, 6, 6 },
				{ 9, 6, 5, 2, 8 } };
		int multiply = 1;
		for (int row = 1; row < matrix.length; row++) {
			for (int col = 0; col < row; col++) {
				multiply *= matrix[row][col];
			}
		}
		System.out.println(multiply);
	}
}
