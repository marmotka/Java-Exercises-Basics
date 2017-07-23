import java.util.Scanner;

public class Test1Sea5v1Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter n");
//		int n = sc.nextInt();
//		char[][] matrix = new char[n][n];
//		int next =-1;
//		do {
//			System.out.println("enter blacks");
//			int blRow = sc.nextInt();
//			int blCol = sc.nextInt();
//			System.out.println("Than?");
//			next = sc.nextInt();
//			matrix[blRow][blCol] = 'b';
//		} while (next!=-1);
		
		char[][] matrix ={ 
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{'b','b',' ',' ',' ','x',' ',' ','b','b'},
				{' ','b','b','b','b',' ',' ','b','b',' '},
				{' ',' ',' ',' ','b',' ',' ','b',' ',' '},
				{' ',' ',' ',' ','b','b','b','b',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				};
		
		System.out.println("Enter x coords: ");
		int rowX = sc.nextInt();
		int colX = sc.nextInt();
		matrix[rowX][colX] = 'x';
		for (int i =0; i < matrix.length; i++){
			for (int j=1; j<matrix[i].length; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		paint(matrix, rowX, colX);
		
		for (int i =0; i < matrix.length; i++){
			for (int j=1; j<matrix[i].length; j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
	}

	static void paint(char[][] mat, int rowX, int colX) {
//		if (isValid(mat, rowX - 1, colX - 1)) {
//			mat[rowX - 1][colX - 1] = 'r';
//			paint(mat, rowX - 1, colX - 1);
//		}
//		if (mat[rowX][colX] != 'x'){
//			mat[rowX][colX] = 'r';
//		}
		  for (int i = -1; i < 2; i++) {
	            for (int j = -1; j < 2; j++) {
	            	if((isValid(mat, rowX+i, colX+j)&& mat[rowX+i][colX+j] != 'x') );
	            	mat[rowX+i][colX+j]='r';
	            	paint(mat, rowX+i, colX+j);
	            }
		  }
	}

	static boolean isValid(char[][] mat, int rowX, int colX) {
		boolean rowVal = rowX >= 0 && rowX <= mat.length - 1;
		boolean colVal = colX >= 0 && colX <= mat[0].length;
		boolean inRange = rowVal && colVal;
		boolean onBlack = true;
		if (inRange) {
			onBlack = mat[rowX][colX] == 'b';
		}
		if (inRange && !onBlack) {
			return true;
		} else {
			return false;
		}
	}
}
