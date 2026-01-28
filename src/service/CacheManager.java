package service;

import java.util.ArrayList;
import java.util.List;

import books.Book;

public class CacheManager {

	private static List<Book> cachedBooks=new ArrayList<Book>();
	
	public void addBooksToCache(List<Book> books) {
		System.out.println("before adding Cache currently holds: "+cachedBooks.size() +"books");
		cachedBooks.addAll(books);
		
		System.out.println("after adding Cache currently holds: "+cachedBooks.size() +"books");
	}
}
