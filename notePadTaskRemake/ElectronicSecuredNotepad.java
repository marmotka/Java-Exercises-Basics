package notePadTaskRemake;

public class ElectronicSecuredNotepad extends SecuredNotepadImpl implements IElectronicDevice {

	private boolean isStarted;

	// public ElectronicSecuredNotepad(String password) {
	// super();
	// this.isStarted = false;
	// }

	private static ElectronicSecuredNotepad create(String currPass) {
		super.create();
		// this.password = currPass;
		this.isStarted = false;
	}

	// public static ElectronicSecuredNotepad create() {
	// String currPass = askForPassword();
	// boolean isValid = passwordIsSecured(currPass);
	// while (!isValid) {
	// currPass = askForPassword();
	// isValid = passwordIsSecured(askForPassword());
	// }
	// return new ElectronicSecuredNotepad(currPass);
	// }

	@Override
	public boolean enterValidPassword() {
		return super.enterValidPassword();
		// return false;
	}

	@Override
	public void start() {
		isStarted = true;

	}

	@Override
	public void stop() {
		isStarted = false;

	}

	@Override
	public boolean isStarted() {
		return isStarted;
	}

	public void addNewPage() {
		if (isStarted()) {
			super.addNewPage();
		}

	}

	@Override
	public void addTextToPage(String txt, int pageNum) {
		if (isStarted()) {
			super.addTextToPage(txt, pageNum);
		}
	}

	@Override
	public void replaceTextInPage(String txt, int pageNum) {
		if (isStarted()) {
			super.replaceTextInPage(txt, pageNum);
		}
	}

	@Override
	public void clearPage(int pageNumber) {
		if (isStarted()) {
			super.clearPage(pageNumber);
		}
	}

	@Override
	public void removePage(int pageNumber) {
		if (isStarted()) {
			super.removePage(pageNumber);
		}

	}

	@Override
	public String viewAllPages() {

		if (isStarted()) {
			String result = super.viewAllPages();
			return result;
		}
		return "Wrong password!";
	}

}
