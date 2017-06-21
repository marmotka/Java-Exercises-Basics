
public class Task05RowMaxSum {
	public static void main(String[] args) {
		int[][] matrix = { { 5, 3, 6, 6, 4 }, { 8, 3, 7, 9, 7 }, { 8, 4, 6, 8, 5 }, { 8, 5, 3, 56, 6 } };

		int maxSum = 0;
		int maxRow=-1;
		for (int row = 0; row < matrix.length; row++) {
			int sum = 0;
			for (int col = 0; col < matrix[row].length; col++) {
				sum += matrix[row][col];
			}
			if (sum > maxSum) {
				maxSum = sum;
				maxRow=row;
			}
		}
		System.out.println("The max sum is: " + maxSum + " on row: " + (maxRow+1));
	}
}
