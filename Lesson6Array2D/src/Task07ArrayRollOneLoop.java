
public class Task07ArrayRollOneLoop {
	public static void main(String[] args) {
		int[][] matrix = { { 11, 12, 13, 14, 15, 16 }, 
							{ 21, 22, 23, 24, 25, 26 }, 
							{ 31, 32, 33, 34, 35, 36 },
							{ 41, 42, 43, 44, 45, 46 }, 
							{ 51, 52, 53, 54, 55, 56 }, 
							{ 61, 62, 63, 64, 65, 66 } };
		int i = 0;
		int j = 0;
		int sumLine = 0;
		int sumAllLines = 0;
		do {
			if ((i + j) % 2 == 0) {
				System.out.print(matrix[i][j] + " ");
				sumLine += matrix[i][j];
			}
			j++;
			if (j == matrix[i].length) {			
				i++;
				j = 0;
				sumAllLines += sumLine;				
				System.out.println("/ Sum of the elements in the row is: " + sumLine);
				sumLine=0;
			}
		} while (i <= matrix.length - 1); 
		System.out.println("Sum of the all elements is: " + sumAllLines);
	}
}
