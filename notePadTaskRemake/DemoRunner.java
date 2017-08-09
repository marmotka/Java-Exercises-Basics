package notePadTaskRemake;

import java.util.Scanner;

public class DemoRunner {

	public static void main(String[] args) {
		System.out.println("Type 'secure' for secured version...");
		Scanner scanner = new Scanner(System.in);
		INotepad notepad;
		if (scanner.nextLine().equals("secure")) {

			notepad = new SecuredNotepadImpl();
		} else {
			notepad = new SimpleNotepad();
		}

		SimpleNotepad notes = new SimpleNotepad();
		notes.addNewPage();
		notes.addNewPage();
		notes.addTextToPage("Zdrasti", 2);
		notes.addNewPage();
		notes.replaceTextInPage("Replaced text here", 10);
		notes.addTextToPage("page 13", 13);

		Page page = new Page();
		Page page2 = new Page("PLACE HEADER");
		page.setHeader("NAME OF PaGE");
		page2.addText("ala bala");
		System.out.println(page.viewPage());
		notepad.addPage(page);
		notepad.addPage(page2);
		System.out.println("Is there word 'ala'" + notepad.searchWord("ala"));
		notepad.printAllPagesWithDigits();
		System.out.println(notes.viewAllPages());

		System.out.println(notepad.viewAllPages());

		scanner.close();
	}

}
