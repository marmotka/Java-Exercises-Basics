
public class Test1Sea5v2Task2 {
	public static void main(String[] args) {
		String text = "Imalo edFfdgdfDFGGxDSAfffgdgf5665g336dffDSDnmbmbnkdsfdsDfdsfds3&^*^&$()*&)(fdfsGDFFDSFDSFSnfgdgffdsdfdsddfsffgDSFDFSo imalo";
		String lower = text.replaceAll("[^a-z]", "");
		String upper = text.replaceAll("[^A-Z]", "");
		 String test = text.replaceAll("[\\D]+","<>");
		 
		 System.out.println(test.length());	 
		
		 System.out.println(test+ "   --");
		 
		 
//		int up = upper.length();
//		int low = lower.length();
//		System.out.println(up);
//		System.out.println(low);
//
//		int nod = gcd(up, low);
//		int nod2 = gcd2(up ,low);
//		System.out.println("nod : " + nod);
//		System.out.println("nod2 : " + nod2);
//
//		System.out.printf("%d:%d", up / nod, low / nod);
//
//	}
//
//	static int gcd2(int a, int b) {
//		if (a < b) {
//			a = a + b;
//			b = a - b;
//			a = a - b;
//		}
//		int nod2 = 1;
//		for (int i = b; i > 1; i--) {
//			if ( a%i == 0 &&  b%i == 0) {
//				nod2 = i;
//				break;
//			}
//		}		
//		return nod2;
//	}
//
//	static int gcd(int a, int b) {
//		if (b == 0) {
//			return a;
//		}
//		if (a == 0) {
//			return b;
//		}
//		if (a > b) {
//			return gcd(a % b, b);
//		} else {
//			return gcd(a, b % a);
//		}
	}

}
