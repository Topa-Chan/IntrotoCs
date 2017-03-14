/*
 * Tyler Patterson
 * 24 February 2016
 */

public class Book {

	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.author = author;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book: " + "\"" + title + "\"" + " by " + author;
	}
	
}
