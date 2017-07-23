
public class Task07ArrayString {
	public static void main(String[] args) {
		double[][] matrix = { { 5.544, 65.345 }, { 55.654, 76.4555 }, { 543.65, 543.54 } };
		for (int i = 0; i < matrix.length; i++) {
			String line = "";
			for (int j = 0; j < matrix[i].length; j++) {
				line += String.format("%.2f ", matrix[i][j]);
			}
			System.out.println(line);
		}
	}
}
