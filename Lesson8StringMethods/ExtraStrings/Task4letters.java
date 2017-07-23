
public class Task4letters {
	public static void main(String[] args) {
		String text = "ddsasds joeijkkzjdfn jhzcuhfusdhofdsufh mndjfhskdjfhewuurhwel";
		String textToLower = text.toLowerCase();

		int[] letters = new int[26];
		for (int i = 0; i < text.length(); i++) {
			if (! (text.charAt(i)>='a' && text.charAt(i)<='z')){
				continue;
			}
			int arrayIndex = textToLower.charAt(i) - 97;
			System.out.println(arrayIndex);
			letters[arrayIndex]++;
		}
		for (int i = 0; i < letters.length; i++) {
			char ch = (char) (i + 97);
			System.out.print(ch + "-" );
			System.out.println(letters[i]);
		}

	}
}
