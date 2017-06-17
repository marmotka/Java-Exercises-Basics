
public class Task03MatrixSumAverage {
	public static void main(String[] args) {
		int[][] matrix = { { 48, 72, 13, 14, 15 }, 
							{ 21, 22, 53, 24, 75 }, 
							{ 31, 57, 33, 34, 35 },
							{ 41, 95, 43, 44, 45 }, 
							{ 59, 52, 53, 54, 55 }, 
							{ 61, 69, 63, 64, 65 } };
		int sum = 0;
		int count = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 1; col < matrix[row].length; col++) {
				sum += matrix[row][col];
				count++;
			}
		}
		System.out.println("The sum is : " + sum);
		System.out.println("The average is: " + (sum/count));
	}
}
