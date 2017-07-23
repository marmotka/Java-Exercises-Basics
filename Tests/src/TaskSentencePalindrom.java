
public class TaskSentencePalindrom {
	public static void main(String[] args) {
		String text = "Imalo edno vreme op vreme op vreme edno imalo";
		String[] wordss = text.toLowerCase().split(" ");
		// StringBuilder textBuild = new StringBuilder (text.toLowerCase());
		boolean isPalindrom = isPalin(wordss, 0);
		System.out.println(isPalindrom);
	}

	static boolean isPalin(String[] words, int index) {
		if (index >= words.length - 1 - index) {
			return true;
		}
		if (!words[index].equals(words[words.length - 1 - index])) {
			return false;
		}
		return isPalin(words, ++index);
	}
}
