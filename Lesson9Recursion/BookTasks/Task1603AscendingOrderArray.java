
public class Task1603AscendingOrderArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 2, 4, 5, 6, 7, 9 };
		System.out.println(testAscendingOrder(array, 1));
	}

	static boolean testAscendingOrder(int[] arr, int index) {
		if (index == arr.length - 1) {
			return true;
		} else if (arr[index] <= arr[index - 1]) {
			return false;
		} else {
			return testAscendingOrder(arr, ++index);
		}
	}
}
