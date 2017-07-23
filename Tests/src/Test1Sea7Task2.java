
public class Test1Sea7Task2 {
	public static void main(String[] args) {
		String text = "Imalo ednoto vreme edno ima imalo.Imalo vreme edno";
		
		
		
		
		int cntWords = 1;
		int maxLetters = 0;
		int maxLettIdx = -1;
		int cntLetters = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ' || text.charAt(i) == '.') {
				
				cntWords++;
				cntLetters = 0;
				continue;
			}
			cntLetters++;
			if (cntLetters > maxLetters) {
				maxLetters = cntLetters;
				maxLettIdx = i;
			}

		}
		System.out.println(cntWords);
		System.out.println(maxLetters);
		System.out.println(maxLettIdx);

		String longest = text.substring(maxLettIdx - maxLetters, maxLettIdx+1);

		String[] words = text.toLowerCase().split("[ .]");
		int maxCounted = 0;
		int viewMaxIdx = -1;
		int maxLength = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > maxLength) {
				maxLength = words[i].length();
			}
			int currentCnt = 0;
			for (int j = i; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					currentCnt++;
				}
			}
			if (currentCnt > maxCounted) {
				maxCounted = currentCnt;
				viewMaxIdx = i;
			}
		}
		System.out.println("Words: " + cntWords + " ///// " + words.length);
		System.out.println("Longest: " + longest + " ///// " + maxLength);
		System.out.println("Most frequent: " + maxCounted + " ///// " + words[viewMaxIdx]);
	}
}
