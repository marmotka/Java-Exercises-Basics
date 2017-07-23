
public class TestSea6Task3 {
	public static void main(String[] args) {
		int[] array = { 564, 654, 54, 5, 4, 15, 4, 65, 4, 5, 4, 54, 12, 564 };

		System.out.println(arrPositive(array,0));
	}
	
	static boolean arrPositive(int[] arr,int idx){
		if (idx==arr.length-1){
			return true;
		}
		if (arr[idx]<0){
			return false;
		}
		
		return arrPositive(arr,++idx);
	}
}

