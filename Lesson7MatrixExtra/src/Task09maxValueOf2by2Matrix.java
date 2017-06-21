
public class Task09maxValueOf2by2Matrix {
	public static void main(String[] args) {
		int[][] matrix = { { 5, 3, 6, 6, 4 }, 
							{ 8, 3, 7, 9, 7 }, 
							{ 8, 4, 6, 8, 5 }, 
							{ 8, 5, 3, 6, 6 },
							{ 9, 86, 5, 2, 8 }, 
							{ 9, 6, 5, 2, 8 }, 
							{ 9, 6, 5, 2, 8 } };

		int maxSum = 0;
		int indexRow = -1;
		int indexCol = -1;
		for (int row = 0; row < matrix.length - 1; row++) {
			int sum = 0;
			for (int col = 0; col < matrix[row].length - 1; col++) {
				sum = matrix[row][col] + matrix[row + 1][col] + matrix[row][col + 1] + matrix[row + 1][col + 1];
				if (sum > maxSum) {
					maxSum = sum;
					indexRow = row;
					indexCol = col;
				}

			}
		}
		System.out.println("Max sum is: " + maxSum + " with upper left value indexes = " + indexRow + " " + indexCol);
		System.out.println(matrix[indexRow][indexCol] + " " + matrix[indexRow][indexCol+1]);
		System.out.println(matrix[indexRow+1][indexCol] + " " + matrix[indexRow+1][indexCol+1]);
	}
}
