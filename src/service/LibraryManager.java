package service;

import java.util.List;

import books.Book;
import factory.BookFactory;
import factory.MemberFactory;
import library.Library;
import member.Member;

public class LibraryManager {

	public static void init() {
		//create library object
		Library lib = new Library();
		
		//create books
		List<Book> books = BookFactory.createBooks();
		//create members
		List<Member> members=MemberFactory.createMembers();
		//add books to library
		lib.addBooks(books);
		//add members to library
		lib.addMembers(members);
		//add borrowed books to memebr
		int i =books.size();
		for(Member mem: members) {
			if(i==0) break;
			else mem.setBorrowedBooks(books.subList(0,i));
			i--;
		}
		
	}
}
