
public class Task08OverSecondDiag {
	public static void main(String[] args) {
		boolean[][] matrix = { { false, false, false, false }, 
								{ false, false, false, true },
								{ false, false, false, true }, 
								{ false, false, true, false } };
		boolean hasTrue = false;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (row + col < matrix.length - 1 && matrix[row][col] == true) {
					hasTrue = true;
				}
			}
		}
		System.out.println(hasTrue ? "has true value" : "doesn't have true value");
	}
}
