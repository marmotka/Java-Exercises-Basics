package notePadTaskRemake;

import java.util.ArrayList;

public class SimpleNotepad implements INotepad {

	private final ArrayList<Page> pages;

	public SimpleNotepad() {
		this.pages = new ArrayList<Page>();
		Page page = new Page();
		pages.add(page);
		notePrinted();
	}

	protected void notePrinted() {
		System.out.println("Simple notepad is created \n");
	}

	public void addNewPage() {
		pages.add(new Page());
	}

	@Override
	public void addPage(Page page) {
		pages.add(page);
	}

	@Override
	public void addTextToPage(String txt, int pageNum) {
		if (!isPageCreated(pageNum)) {
			int addedPages = pages.size();
			for (int i = addedPages; i <= pageNum; i++) {
				pages.add(new Page());

			}
			System.out.printf("Page with number %d created! \n", pageNum);
		}
		pages.get(pageNum).addText(txt);
		System.out.println("Text added \n");
	}

	@Override
	public void replaceTextInPage(String txt, int pageNum) {
		if (isPageCreated(pageNum)) {
			pages.get(pageNum).deleteText();
			pages.get(pageNum).addText(txt);
			System.out.printf("Page with number %d changed! \n", pageNum);
		}
	}

	@Override
	public void clearPage(int pageNumber) {
		if (isPageCreated(pageNumber)) {
			pages.get(pageNumber).deleteText();
			pages.get(pageNumber).deleteHeader();
			System.out.printf("Page with number %d cleared! \n", pageNumber);
		}
	}

	@Override
	public void removePage(int pageNumber) {
		if (isPageCreated(pageNumber)) {
			pages.remove(pageNumber);
			System.out.printf("Page with number %d deleted! \n", pageNumber);

		}
	}

	@Override
	public String viewAllPages() {
		StringBuilder allPages = new StringBuilder();
		for (Page page : pages) {
			allPages.append(page.viewPage());
			allPages.append("\n");
		}
		return allPages.toString();
	}

	@Override
	public boolean isPageCreated(int pageNumber) {
		if (pageNumber > this.pages.size()) {
			System.out.println("The page doesn't exist! \n");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public int searchWord(String word) {
		for (int i = 0; i < pages.size(); i++) {
			if (pages.get(i).searchWord(word)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void printAllPagesWithDigits() {
		boolean hasPageWithDigit = false;
		StringBuilder allPages = new StringBuilder();
		for (int i = 0; i < pages.size(); i++) {
			if (pages.get(i).containsDigits()) {
				allPages.append(pages.get(i).viewPage());
				allPages.append("\n");
				hasPageWithDigit = true;
			}
		}
		if (hasPageWithDigit) {
			System.out.println(allPages.toString());
		} else {
			System.out.println("No pages with digits \n");
		}
	}

	// @Override
	// public Page getPage(int pageNumber) {
	// return pages.get(pageNumber);
	// }

}
