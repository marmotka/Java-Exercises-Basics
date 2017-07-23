
public class Test1Sea5v1Task2 {
	public static void main(String[] args) {
		String txt = "imalo vreme ima imalo vreme edno vreme imalo";
		String result =frequentWord(txt);
		System.out.println(result);
		char counts = result.charAt(result.length()-1);
		int countsInt = Character.getNumericValue(counts);
		result = result.substring(0, result.length()-1);
		System.out.println(result);
		System.out.printf("The word \"%s\" is seen %02d times in the text." , result,countsInt);
		
	}

	static String frequentWord(String text) {
		String[] words = text.split(" ");
		int indexWord = -1;
		int countMax = 0;
		for (int i = 1; i < words.length; i++) {
			int count = 0;
			int index = text.indexOf(words[i]);
			while (index != -1) {
				count++;
				index = text.indexOf(text, index + 1);
			}
			if (countMax < count) {
				countMax = count;
				indexWord = i;
			}
			
		}
		String wordCounts = words[indexWord] + countMax;
		return wordCounts;
		
	}
}
