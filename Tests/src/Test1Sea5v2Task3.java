
public class Test1Sea5v2Task3 {
	public static int count = 0;

	public static void main(String[] args) {

		int[] arr = { -1, -3, -6, -1, -3, -6, -1, -3, -6, -1, -3, -6, -1, -3, -6, -1, -3, -6, 7, 8, 11, 31, 44, 67,
				88 };

		int result = binarySearch(arr, 0, arr.length - 1);
		System.out.println(result + 1);
		System.out.println("Counts" + count);
	}

	static int binarySearch(int[] masiv, int left, int right) {
		count++;
		if (left > right) {
			return -1;
		}

		int mid = (left + right) / 2;

		if (masiv[mid - 1] < 0 && masiv[mid + 1] > 0) {
			return mid;
		} else if (masiv[mid] >= 0) {
			return binarySearch(masiv, left, mid - 1);
		} else {
			return binarySearch(masiv, mid + 1, right);
		}
	}
}
