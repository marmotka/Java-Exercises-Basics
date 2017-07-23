
public class Task1605ArrayIndexofBiggest {
	public static void main(String[] args) {
		int[] array = { 1, 2, 6, 7,9,5,6,7,43, 4, 2, 3 };
		System.out.println(arraymaxIndexElementIndex(array, 0, 1));
	}

	static int arraymaxIndexElementIndex(int[] arr, int maxIndex, int curIndex) {
		if (curIndex==arr.length-1){
			return maxIndex;
		}		
		if (arr[maxIndex]<arr[curIndex]){
			maxIndex=curIndex;
		}
		return arraymaxIndexElementIndex(arr, maxIndex, ++curIndex);
				
	}

}
