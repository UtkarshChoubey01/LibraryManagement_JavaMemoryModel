package service;

import java.util.ArrayList;
import java.util.List;

import books.Book;
import factory.BookFactory;
import factory.MemberFactory;
import library.Library;
import member.Member;

public class LibraryManager {

	public static void init() {
		//create library object
		CacheManager cmg = new CacheManager();
		Library lib = new Library();
		
		System.out.println("Creating temp variable");
		Book book = new Book("testauthor","testtitle","testISBN");
		System.out.println("Temp variable created");
		//temp books
		
		List<Book> tempBooks= new ArrayList<Book> ();
		for(int i =0;i<100000;i++) {
			
			tempBooks.add(new Book("tempauthor","temptitle","tempISBN"));
		}
		tempBooks.clear();
		tempBooks=null;
		//create books
		List<Book> books = BookFactory.createBooks();
		//create members
		List<Member> members=MemberFactory.createMembers();
		//add books to library
		lib.addBooks(books);
		
		cmg.addBooksToCache(books);
		//add members to library
		lib.addMembers(members);
		//add borrowed books to memebr
		int i =books.size();
		for(Member mem: members) {
			if(i==0) break;
			else mem.addBorrowedBooks(books.subList(0,i));
			i--;
		}
		
		System.out.println("Library initialization completed");
		
	}
}
