package basics.of.software.architecture.solid;

public class Book implements BookHandler {

	private BookPersistence bookPersistence;
	
	private int numOfPages;
	private String authorName;

	public Book(int numOfPages, String authorName) {
		super();
		this.numOfPages = numOfPages;
		this.authorName = authorName;
		this.bookPersistence = new BookPersistence();
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public void save() {
		bookPersistence.save(this);		
	}
	
	@Override
	public String toString() {
		return "Book [numOfPages=" + numOfPages + ", authorName=" + authorName + "]";
	}
}
