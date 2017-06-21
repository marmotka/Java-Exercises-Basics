import java.util.Scanner;

public class Task102 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter columns");
		int cols = sc.nextInt();
		int[][] matrix = new int[rows][cols];
		int value = 1;
		int min = Math.min(rows, cols);
		// for (int i = 0; i < min; i++) {
		// for (int j = 0; j <= i; j++) {
		// matrix[i-j][j]= value;
		// value++;
		// }
		// }
		// int diag = matrix.length+matrix[0].length -2;



				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j <= i; j++) {
						matrix[i - j][j] = value;
						value++;
					}
				}
	
				for (int i = 1; i < matrix[0].length; i++) {
					for (int j =  matrix.length-1; j >= 0; j--) {
					matrix[j][i] = value;
					value++;
					}
				}
			
		

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}
}
