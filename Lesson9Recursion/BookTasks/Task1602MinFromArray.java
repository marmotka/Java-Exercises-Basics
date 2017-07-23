
public class Task1602MinFromArray {
	public static void main(String[] args) {
		int[] array = { 4, 3, 5, 7, 3, 6, 7, -5, 4, 6, 1 };
		int min = minFromArray(array, 1, array[0]);
		System.out.println(min);
	}

	static int minFromArray(int[] arr, int index, int min) {
		if (index == arr.length) {
			return min;
		} else {
			if (arr[index] < min) {
				min = arr[index];
			}
			return minFromArray(arr, ++index, min);
		}
	}
}
