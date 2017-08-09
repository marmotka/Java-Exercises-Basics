package notePadTaskRemake;

import java.util.Scanner;

public class SecuredNotepadImpl extends SimpleNotepad /* implements INotepad */ implements ISecureNotepad {

	private String password;

	public static SecuredNotepadImpl create() {
		String currPass = askForPassword();
		boolean isValid = passwordIsSecured(currPass);
		while (!isValid) {
			currPass = askForPassword();
			isValid = passwordIsSecured(askForPassword());
		}
		return new SecuredNotepadImpl(currPass);
	}

	protected SecuredNotepadImpl(String currPass) {
		super();
		this.password = currPass;
	}

	protected void notePrinted() {
		System.out.println("SecuredNotepad is created");
	}

	@Override
	public void addNewPage() {
		if (enterValidPassword()) {
			super.addNewPage();
		}
	}

	@Override
	public void addPage(Page page) {
		if (enterValidPassword()) {
			super.addPage(page);
		}
	}

	@Override
	public void addTextToPage(String txt, int pageNum) {
		if (enterValidPassword()) {
			super.addTextToPage(txt, pageNum);
		}
	}

	@Override
	public void replaceTextInPage(String txt, int pageNum) {
		if (enterValidPassword()) {
			super.replaceTextInPage(txt, pageNum);
		}
	}

	@Override
	public void clearPage(int pageNumber) {
		if (enterValidPassword()) {
			super.clearPage(pageNumber);
		}
	}

	@Override
	public void removePage(int pageNumber) {
		if (enterValidPassword()) {
			super.removePage(pageNumber);
		}

	}

	@Override
	public String viewAllPages() {

		if (enterValidPassword()) {
			String result = super.viewAllPages();
			return result;
		}
		return "Wrong password!";
	}

	public boolean enterValidPassword() {
		String input = askForPassword();
		if (input.equals(password)) {
			System.out.println("correct password /n");
			return true;
		}
		System.out.println("Wrong password %n");
		return enterValidPassword();

	}

	protected static boolean passwordIsSecured(String word) {
		boolean isIt = !word.matches("[^(.{0,4}|[^0-9]*|[^A-Z]*|[^a-z]*)$]");
		// boolean isIt = word.matches("[^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$]");
		return isIt;

	}

	protected static String askForPassword() {
		String input = null;
		do {
			System.out.println("Enter pasword bitte... \n");

			Scanner sc = new Scanner(System.in);
			input = sc.nextLine();
		} while (input == null && input.isEmpty());
		return input;
	}

	// private void setPasswoord() {
	//
	// String currPass = askForPassword();
	// boolean isValid = passwordIsSecured(currPass);
	// while (!isValid) {
	// currPass = askForPassword();
	// isValid = passwordIsSecured(askForPassword());
	// }
	//
	// this.password = currPass;
	//
	// }

}
