
public class Task04MatrixRotate90 {
	public static void main(String[] args) {

		int[][] matrix = { { 48, 72, 13, 14, 15 }, 
							{ 21, 22, 53, 24, 75 }, 
							{ 31, 57, 33, 34, 35 },
							{ 41, 95, 43, 44, 45 }, 
							{ 59, 52, 53, 54, 55 }, 
							{ 61, 69, 63, 64, 65 } };
		int[][] matrixRot = new int[matrix[0].length][matrix.length];
		for (int row = 0; row < matrixRot.length; row++) {
			for (int col = 0; col < matrixRot[row].length; col++) {
				matrixRot[row][col] = matrix[matrix.length - 1 - col][row];
				System.out.print(matrixRot[row][col] + " ");
			}
			System.out.println();
		}

	}
}
