package notePadTaskRemake;

public class Page {
	private String head;
	private StringBuilder sb;

	public Page() {
		this.head = "";
		this.sb = new StringBuilder();
	}

	public Page(String header) {
		this.head = header;
		sb = new StringBuilder();
	}

	boolean searchWord(String word) {
		if (this.sb.indexOf(word) != -1) {
			return true;
		}
		return false;
	}

	boolean containsDigits() {
		return this.sb.toString().matches("[/d]+");
	}

	void addText(String text) {
		this.sb.append(text);
	}

	void deleteText() {
		this.sb.delete(0, sb.length());
	}

	String viewPage() {
		String txtPage = String.format("%s %n %n %s %n", head, sb.toString());
		return txtPage;
	}

	void setHeader(String txt) {
		head = txt;
	}

	void deleteHeader() {
		head = "";
	}

}
