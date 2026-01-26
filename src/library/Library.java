package library;

import member.Member;
import java.util.List;

import books.Book;

public class Library {

	private List<Book> books;
	private List<Member> members;
	public List<Book> getBooks() {
		return books;
	}
	public void addBooks(List<Book> books) {
		this.books = books;
	}
	public List<Member> getMembers() {
		return members;
	}
	public void addMembers(List<Member> members) {
		this.members = members;
	}
}
