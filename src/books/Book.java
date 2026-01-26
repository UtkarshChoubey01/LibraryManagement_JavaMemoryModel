package books;

public class Book {

	private String author;
	private String title;
	private String ISBN;
	public Book(String author,String title,String ISBN) {
		this.author=author;
		this.title=title;
		this.ISBN=ISBN;
	}
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}		
}
