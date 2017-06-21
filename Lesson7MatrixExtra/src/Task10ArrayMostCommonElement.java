
public class Task10ArrayMostCommonElement {
	public static void main(String[] args) {
		int[] array = { 5, 3, 3, 5, 3, 2, 5, 5, 5, 5, 3, 6, 6, 4, 5, 4, 3, 4 };
		int maxElement = -1;
		int maxCount = 0;
		for (int i = 0; i < array.length; i++) {
			int element = array[i];
			if (element == maxElement) {
				break;
			} else {
				int count = 0;
				for (int j = 0; j < array.length; j++) {
					if (array[j] == element) {
						count++;
					}
				}
				if (count > maxCount) {
					maxCount = count;
					maxElement = element;
				}
			}
		}
		System.out.println(maxElement + " is counted " + maxCount + " times");
	}
}
