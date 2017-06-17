
public class Task05SumRowCol {
	public static void main(String[] args) {
		int[][] matrix = { { 48, 72, 13, 14 }, 
							{ 21, 22, 53, 24 }, 
							{ 31, 57, 53, 34 }, 
							{ 41, 95, 43, 84 } };

		int rowSumMax = 0;
		int colSumMax = 0;
		for (int row = 0; row < matrix.length; row++) {
			int rowSum = 0;
			for (int col = 0; col < matrix[row].length; col++) {
				rowSum += matrix[row][col];
			}
			if (rowSum > rowSumMax) {
				rowSumMax = rowSum;
			}
		}
		for (int col = 0; col < matrix[0].length; col++) {
			int colSum = 0;
			for (int row = 0; row < matrix.length; row++) {
				colSum += matrix[row][col];
			}
			if (colSum > colSumMax) {
				colSumMax = colSum;
			}
		}
		System.out.println("Max sum of row is: " + rowSumMax);
		System.out.println("Max sum of column is: " + colSumMax);
		if (rowSumMax>colSumMax){
			System.out.println(rowSumMax + " > " + colSumMax);
		} else if (rowSumMax<colSumMax){
			System.out.println(rowSumMax + " < " + colSumMax);
		} else {
			System.out.println(rowSumMax + " = " + colSumMax);
		}
	}
}
