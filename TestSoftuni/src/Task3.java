import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine();


		Pattern patternBojo = Pattern.compile("([a-zA-Z])+-([a-zA-Z])+");
		Pattern patternDidi = Pattern.compile("([^a-zA-Z&&[^-]])+");

		do {
			Matcher m2 = patternDidi.matcher(text);

			if (m2.find()) {
				String didi = m2.group();
				System.out.println(didi);

				text = text.substring(text.indexOf(didi) + didi.length());

				if (text.isEmpty()) {
					break;
				}
			} else {
				break;
			}

			Matcher m = patternBojo.matcher(text);
			if (m.find()) {
				String bojo = m.group();
				System.out.println(bojo);
				text = text.substring(text.indexOf(bojo) + bojo.length());		
			} else {
				break;
			}
			if (text.isEmpty()) {
				break;
			}

		} while (!text.isEmpty());
	}
}
