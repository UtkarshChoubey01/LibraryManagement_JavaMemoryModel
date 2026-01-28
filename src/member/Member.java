package member;

import java.util.ArrayList;
import java.util.List;

import books.Book;

public class Member {

	private String memberId;
	private String name;
	private List<Book> borrowedBooks;
	
	public Member(String name,String memberId) {
		this.name=name;
		this.memberId=memberId;
		borrowedBooks=new ArrayList<Book>();
	}
	public String getMemberId() {
		return memberId;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}
	public void addBorrowedBooks(List<Book> borrowedBooks) {
		
		
		this.borrowedBooks = borrowedBooks;
		System.out.println("Exiting set borrowed books");
	}
	
	
}
