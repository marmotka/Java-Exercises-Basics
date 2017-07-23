
import java.util.Arrays;
public class SelectionSorting {

	public static void main(String[] args) {
		// int[] arr = {99, 0, 7, 1, 6, 2, 8}; // max element on the position where the min elem will be swaped
		// int[] arr = {99, 1, 2, 6, 7, 8, 1}; //almost best case - 1 step to become sorted array
		//int[] arr = { 99, 1, 2, 6, 7, 54, 654, 65, 6, 43, 65, 3, 6, 68, 1 }; // random
		int[] arr = {0, 1, 2, 6, 7, 54, 65, 6, 43, 65, 3, 6, 68, 100 }; // random
		System.out.println("Original array : ");
		System.out.println(Arrays.toString(arr));
		System.out.println();		
		selectionSort(arr);
		
	}
	static void selectionSort (int[] arr){	
	
		for (int j = 0; j < arr.length / 2; j++) { // for each iterate arrange two elements - smaller one from left-to-tright and bigger from right-to-left so the operations can be repeated only for the half of the array

			int indexMin = j; // preserve the position of the min and max elements
			int indexMax = arr.length - 1 - j;

			boolean ifArrayIsSorted = true; // if there isn't any unsorted element this boolean we'll remain true, and the first loop will break;

			for (int i = j; i < arr.length - j; i++) { // iterate as many times as is the length of the array so we can find the position of the min and max elements
				if (arr[i] < arr[indexMin]) {
					indexMin = i;
					ifArrayIsSorted = false;
				}
				if (arr[i] > arr[indexMax]) {
					indexMax = i;
					ifArrayIsSorted = false;
				}
			}
			if (ifArrayIsSorted) {
				break;
			}

			int temp = arr[indexMin];
			arr[indexMin] = arr[j];
			arr[j] = temp;

			if (indexMax == j) { 		// check if the preserved position of the max element was on the position where the min element was just put
				indexMax = indexMin; 	// if true change the preserved position of max element to the position where WAS the min element (and after swap on this position is the max element)
			}

			int temp2 = arr[indexMax];
			arr[indexMax] = arr[arr.length - 1 - j];
			arr[arr.length - 1 - j] = temp2;
			System.out.println(Arrays.toString(arr)); // check every step of sorting
		}
		System.out.println("Sorted array : ");
		System.out.println(Arrays.toString(arr));
	}
}
