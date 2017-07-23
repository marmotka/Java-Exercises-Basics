import java.util.Scanner;

public class Task1603 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter k: ");
		int k = sc.nextInt();
		int[] masiv = { 5, 3, 7, 7, 6, 4, 5, 4, 43, 2, 46, 6, 4, 77, 67, 8, 6, 4 };
		int index = findK(masiv,k,0,masiv.length);
		System.out.println(masiv[index]);		
	}

	static int findK(int[] arr,int x, int left, int right){
		int index = partition(arr,0,arr.length);
		if (x==arr[index]){
			return index;
		} else {
			return findK(arr,x,0,arr.length);
		}
		
	}
	
	static void swap(int[] array, int idx1, int idx2) {
		int temp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = temp;
	}

	static int partition(int[] arr, int left, int right) {
		int randomIndex = (int) (Math.random() * (right - left + 1)) + left;
		swap(arr, randomIndex, right);
		int idx = left - 1;
		int pivot = arr[right];
		for (int i = 0; i <= right; i++) {
			if (arr[i] >= pivot) {
				swap(arr, i, ++idx);
			}
		}
		return idx;
	}

}
