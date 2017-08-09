package notePadTaskRemake;

public interface INotepad {

	void addNewPage();

	void addPage(Page p);

	void addTextToPage(String txt, int pageNum);

	void replaceTextInPage(String txt, int pageNum);

	void clearPage(int pageNumber);

	void removePage(int pageNumber);

	String viewAllPages();

	boolean isPageCreated(int pageNumber);

	int searchWord(String word);

	void printAllPagesWithDigits();

	// Page getPage(int pageNumber);

}
