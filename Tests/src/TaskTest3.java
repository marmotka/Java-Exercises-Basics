
public class TaskTest3 {
	public static void main(String[] args) {
		int x= 4;
		int[] array = {4,4,8,8,4,2,32,4,4,4}; 
		int umnojen = umnoj( array, x, 0);
		System.out.println(umnojen);
		
	}

	static int umnoj(int[] arr, int x, int idx) {
		if (idx == arr.length - 1) {
			if (arr[idx] % 2 != 0 && arr[idx] > x) {
				return arr[idx];
			} else {
				return 1;
			}
		}

		if (arr[idx] % 2 != 0 && arr[idx] > x) {
			return arr[idx] * umnoj(arr, x, ++idx);
		} else {
			return umnoj(arr, x, ++idx);
		}
	}
	
}
