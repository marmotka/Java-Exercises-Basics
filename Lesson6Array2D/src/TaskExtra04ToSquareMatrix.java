import java.util.Scanner;

public class TaskExtra04ToSquareMatrix {
	public static void main(String[] args) {
		int[][] matrix = { { 48, 72, 13, 14 }, 
							{ 21, 22, 53, 24 }, 
							{ 31, 57, 33, 34 }, 
//							{ 41, 95, 43, 44 },
//							{ 59, 52, 53, 54 }, 
//							{ 61, 69, 63, 64 },
//							{ 61, 69, 63, 64 },
//							{ 61, 69, 63, 64 }
							};

		int lengthNew = (matrix.length > matrix[0].length) ? matrix.length : matrix[0].length;
		int[][] newMatrix = new int[lengthNew][lengthNew];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				newMatrix[row][col] = matrix[row][col];
			}
		}
		for (int row = 0; row < newMatrix.length; row++) {
			for (int col = 0; col < newMatrix[row].length; col++) {
				System.out.print(newMatrix[row][col] + " ");
			}
			System.out.println();
		}
	}
}
