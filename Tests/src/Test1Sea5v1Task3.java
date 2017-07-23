
public class Test1Sea5v1Task3 {
	public static void main(String[] args) {
		int [] array = {5,3,6,6,54,43,5,5,4,32,35,34,53,5,45};
		int diff = findDiff (array, array[0], array[0], 0);
		System.out.println(diff);
	}
	static int findDiff (int[] arr, int min, int max, int start){
		if (start==arr.length){
			return max-min;
		}
		if (min>arr[start]){
			min = arr[start];
		}
		if (max<arr[start]){
			max = arr[start];
		}
		return findDiff (arr,min, max, ++start);
	}
	
}
