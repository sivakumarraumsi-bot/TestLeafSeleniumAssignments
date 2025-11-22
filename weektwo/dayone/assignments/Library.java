package weektwo.dayone.assignments;

public class Library {
	 
	public String addBook(String bookTitle) {
		System.out.println("Book Added Successfully");
		return bookTitle;
		
	}
	
	public void issueBook() {
		System.out.println("Book Issued Successfully");
		
	}
 
	public static void main(String[] args) {
 
		Library library = new Library();
		library.addBook("");
		library.issueBook();
	}
 
}
