/*
 * Tyler Patterson
 * 24 February 2016
 */

public class TPA7 {
	
	private Book[] books;
	
	public TPA7() {
		books = new Book[10];
	}

	public static void main(String[] args) {
		
		if (args.length == 0) {
			System.out.println("No Books Entered");
		} else {
			TPA7 library = new TPA7();
			library.run(args);
		}
		
	}

	private void run(String[] args) {
		int x = 0;
		for(String input: args) {
			String[] vals = input.split(":");
			books[x] = new Book(vals[0], vals[1]);
			x++;
		}
//		for(int j = 0; j < args.length; j++) {
//			String[] book = args[j].split(":");		
//			System.out.println(book);
//		}
		displayBooks();
	}
	
	private void displayBooks() {
		for (Book book: books) {
			if(book != null) {
				System.out.println(book);
			}
		}
//		for (int i = 0; i < books.length; i++) {
//			System.out.println(books[i]);			
//		}
	}
	
}
