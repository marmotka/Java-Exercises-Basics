import java.util.Scanner;

public class Task04ArrayNullMethod {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int [] [] arr = makeArray(x,y);
		printArray(arr);
	}
	static int[][] makeArray (int row, int col){
		int [][] arr = new int [row][col]; 
		return arr;		
	}
	
	static void printArray(int[][] arr){
		for (int i=0; i <arr.length;i++){
			for (int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
