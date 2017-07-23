
public class Task1604ArrayEqualElements {
	public static void main(String[] args) {
		int[] array = { 1, 2, 2, 3 };
		System.out.println(hasDiffElem(array, 0, 1));
	}

	static boolean hasDiffElem(int[] arr, int numIndex, int arrIndex) {
		if (numIndex == arr.length - 1) {
			return true;
		} else if (arr[numIndex] == arr[arrIndex]) {
			return false;
		} else {
			++arrIndex;
			if (arrIndex == arr.length) {
				++numIndex;
				arrIndex = numIndex + 1;
			}
			return hasDiffElem(arr, numIndex, arrIndex);
		}
	}
}
