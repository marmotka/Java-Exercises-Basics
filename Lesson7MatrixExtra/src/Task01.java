
public class Task01 {
	public static void main(String[] args) {
		int[] array = { 6, 7, 3, 8, -88, 9, 5, 3, 0, 5, 4 };
		boolean hasNegative = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				hasNegative = true;
				break;
			}
		}
		System.out.println(hasNegative ? "The array has negative values" : "The array doesn't have negative values");
	}
}
