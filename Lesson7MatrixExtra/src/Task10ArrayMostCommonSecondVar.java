
public class Task10ArrayMostCommonSecondVar {
	public static void main(String[] args) {
		int[] array = { 5, 3, 3, 5, 3, 2, 5, 5, 5, 5, 3,6,6,6,6,6,6,6,6,6, 6, 6, 4, 5, 4, 3, 4 };
		int[] counts = new int[array.length];
		int maxElement = -1;
		int maxCount = 0;

		for (int i = 0; i < array.length; i++) {
			counts[array[i]]++;
		}

		for (int j = 0; j < counts.length; j++) {

			if (counts[j] > maxCount) {
				maxCount = counts[j];
				maxElement = j;
			}
		}
		System.out.println(maxElement + " is counted " + maxCount + " times");
	}
}
