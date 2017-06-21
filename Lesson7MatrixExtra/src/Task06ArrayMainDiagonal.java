
public class Task06ArrayMainDiagonal {
	public static void main(String[] args) {
		char[][] matrix = {{ 's', 'g', 'd'},
							{ 'q', 'r', 'o' },
							{ 'i', 'u', 'y' }};
		for (int i=0; i<matrix.length; i++){
			System.out.print(matrix[i][i] + " ");
		}
	}
}
