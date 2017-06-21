
public class Task12MatrixMostCommonElement {
	public static void main(String[] args) {
		int[][] matrix = { { 5, 3, 6, 6, 4 }, 
							{ 8, 3, 7, 9, 7 }, 
							{ 8, 4, 8, 9, 5 }, 
							{ 8, 5, 3, 6, 9 },
							{ 9, 86, 5, 8, 9 }, 
							{ 9, 6, 5, 9, 8 }, 
							{ 9, 6, 5, 2, 8 } };

		int maxElement = -1;
		int maxCount = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				int element = matrix[row][col];
				int count = 0;
				for (int rows = 0; rows < matrix.length; rows++) {
					for (int cols = 0; cols < matrix[rows].length; cols++) {
						if (matrix[rows][cols] == element) {
							count++;
						}
					}
				}
				if (count > maxCount) {
					maxCount = count;
					maxElement = element;
				}
			}
		}
		System.out.println(maxElement + " is counted " + maxCount + " times");
	}
}
