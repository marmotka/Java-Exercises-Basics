import java.util.Scanner;

public class Task16022dArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter rows and columns;");
		// int rows = sc.nextInt();
		// int cols = sc.nextInt();
		// int [][]matrix = new int [rows][cols];
		// for (int i = 0; i < row; i++) {
		// for (int j = 0; j < col; j++) {
		// System.out.println("Enter values: ");
		// matrix[i][j] = sc.nextInt();
		// }
		// }

		System.out.println("Enter the num which position you would like to find: ");
		int numX = sc.nextInt();
		int[][] matrix = { { 3, 4, 5 }, { 6, 7, 8 }, { 9, 10, 11 } };
	
		int numbersCount = matrix.length * matrix[0].length; // namirame broq na chislata
	
		int index = binarySearch(matrix, numX, 0, numbersCount - 1); // vse edno rabotim s ednomeren masiv i vseki pyt preobrazuvame indexa na ednomerniq do otgovarqshtite mu row i col v dvumerniq)
			
		int columns = matrix[0].length;	
		int rowX = (int) Math.floor(index / columns);		//formula po koqto namirame reda i kolonata na chisloto v dvumerniq masiv spored index-a v nesyshtestvuvashtiq ednomeren masiv
		int colX = index % columns;

		System.out.printf("Number is on position: %d%d", rowX,colX);
	}

	static int binarySearch(int[][] mat, int x, int left, int right) {
		
		if (left > right) {
			return -1;
		}
		int mid = (left + right) / 2;		// tyrsim sredata kakto za ednomeren masiv
		
		int columns = mat[0].length;						 //tyrsim reda i kolonata v dvumerniq otgovarqshti na indexa ako beshe ednomeren
		int rowMid = (int) Math.floor(mid / columns);
		int colMid = mid % columns;
		
		if (mat[rowMid][colMid] == x) {
			return mid;
		} else if (x < mat[rowMid][colMid]) {
			return binarySearch(mat, x, left, mid - 1);
		} else {
			return binarySearch(mat, x, mid + 1, right);
		}
	}
	
}
