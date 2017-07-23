
public class TaskExtra01PowerWithSumOnly {

		public static void main(String[] args) {
			int x = 3;
			int y = 4;

			System.out.println(power(x, y));
		}

		static int power(int k, int l) {
			if (l == 1) {
				return k;
			}
			// int pow =  k pow(l-1) * k;
			return multiply(power(k, l - 1), k);
		}

		static int multiply(int x, int y) {
			if (y == 1) {
				return x;
			}
			// int mul = x*(y-1) + x;
			return multiply(x, y - 1) + x;
		}
	
}
