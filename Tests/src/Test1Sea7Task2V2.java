
public class Test1Sea7Task2V2 {
	public static void main(String[] args) {
		String text = "vreme ednoto vreme vreme vreme edno ima imalo.Imalo vreme edno imal imalo";

		String[] words = text.toLowerCase().split("[ .]");
	
		System.out.println(words.length);
		
		System.out.println(text.indexOf("imaloyiyi"));
		
		for (int i = 0; i < words.length; i++) {
			
			int countFreq = 0;			
			int index = text.indexOf(words[i]);
					
			while (index != -1) {
				countFreq++;
				index = text.indexOf(words[i], ++index);
			}

			System.out.println(words[i] + " ->" + countFreq);
		}
		//
		//
		// int maxCounted = 0;
		// int viewMaxIdx = -1;
		// int maxLength = 0;
		// int maxIdxLength = -1;
		//
		// for (int i = 0; i < words.length; i++) {
		//
		// if (words[i].length() > maxLength) {
		// maxLength = words[i].length();
		// maxIdxLength = i;
		// }
		//
		// int currentCnt = 0;
		//
		// for (int j = i; j < words.length; j++) {
		// if (words[i].equals(words[j])) {
		// currentCnt++;
		// }
		// }
		// if (currentCnt > maxCounted) {
		// maxCounted = currentCnt;
		// viewMaxIdx = i;
		// }
		// }
		// System.out.println("Words: " + +words.length);
		// System.out.println("Longest: " + maxLength + " / " +
		// words[maxIdxLength]);
		// System.out.println("Most frequent: " + maxCounted + " ///// " +
		// words[viewMaxIdx]);
	}
}
