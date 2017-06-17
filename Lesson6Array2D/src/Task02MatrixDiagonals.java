import java.util.Arrays;
import java.util.Scanner;

public class Task02MatrixDiagonals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the square: ");
		int length = sc.nextInt();
		int[][] matrix = new int[length][length];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.println("Enter the value in row: " + row + " and column: " + col);
				matrix[row][col] = sc.nextInt();
			}
		}
		int[] diag1 = new int [length];
		int[] diag2 = new int [length];
		for (int row = 0; row < matrix.length; row++){
			for ( int col=0; col<matrix[row].length; col++){
				if (row==col){
					diag1[row]=matrix[row][col];
				}
				if (row+col == length-1){
					diag2[row] = matrix[row][col];;
				}
			}
		}
		System.out.println(Arrays.toString(diag1));
		System.out.println(Arrays.toString(diag2));
	}
}
