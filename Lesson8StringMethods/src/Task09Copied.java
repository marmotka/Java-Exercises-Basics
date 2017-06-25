
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task09Copied {
	public static void main(String[] args) {
		String input = "a-5s-d-12sdf45-56asdf100";

		regexSolution(input);
		characterIsDigitSolution(input);

	}

	private static void regexSolution(String input) {
		System.out.println("Regex Solution");

		String regex = "-*[0-9]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		int sum = 0;
		while (matcher.find()) {
			// Get the matching string
			int number = Integer.parseInt(matcher.group());
			sum += number;
			System.out.println(number);

		}
		System.out.println("Sum is " + sum);
	}

	private static void characterIsDigitSolution(String input) {

		System.out.println("Character Is Digit Solution");

		String numberCandidate = "";
		int number = 0;
		int sum = 0;

		for (int i = 0; i < input.length(); i++) {

			if (Character.isDigit(input.charAt(i))) {
				if (input.charAt(i - 1) == '-') {
					numberCandidate += input.charAt(i - 1);
				}
				numberCandidate += input.charAt(i);
				continue;
			}

			if (!Character.isDigit(input.charAt(i)) && numberCandidate.length() > 0) {
				number = Integer.parseInt(numberCandidate);
				numberCandidate = "";

				sum += number;
				System.out.println(number);
			}
		}

		if (numberCandidate.length() > 0) {
			number = Integer.parseInt(numberCandidate);
			sum += number;
			System.out.println(number);
		}

		System.out.println("Sum is " + sum);
	}

}
