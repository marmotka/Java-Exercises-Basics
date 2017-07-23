import java.util.Scanner;

public class Task1602DArrayZAPISKI {
	public static void main(String[] args) {
		// int[][] matrix = {{5,4,3},{6,3,4},{8,9,3}};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and cols: ");

		int row = 6; //  sc.nextInt();
		int col = 5;// sc.nextInt();
		int[][] matrixx = new int[row][col];
		int num = 4;
		
		binarySearch(matrixx, num, 0,0,matrixx.length, matrixx[0].length);
				

		// for (int i = 0; i < row; i++) {
		// for (int j = 0; j < col; j++) {
		// System.out.println("Enter values: ");
		// matrix[i][j] = sc.nextInt();
		// }
		// }
//System.out.println(matrix[row].length-1);
	}
		static void binarySearch (int[][] matrix, int x,int rowBeg, int colBeg, int rowEnd, int colEnd){
//			int numbers = (rowEnd - rowBeg - 1) * matrix[0].length + ((matrix[0].length - colBeg ) + colEnd-1);
//			System.out.println(numbers);
			int rowMid = (rowEnd + rowBeg)/2;
			int colMid = colBeg+ (((matrix[0].length - colBeg ) + colEnd))/2;
			
		
		
//		int rowBeg = 1;
//		int colBeg = 3;
//		int rowEnd = 3;
//		int colEnd = 1;
	
		
}
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j < col; j++) {
//				System.out.print(i + "" + j + "  ");
//			}
//			System.out.println();
//		}
	
}
