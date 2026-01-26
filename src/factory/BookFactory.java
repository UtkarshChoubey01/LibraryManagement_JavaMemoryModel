package factory;

import java.util.ArrayList;
import java.util.List;

import books.Book;

public class BookFactory {

	public static List<Book> createBooks(){
		
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Chetan Bhagat","Half Girlfreind","CHBGHG0001"));
		books.add(new Book("Chetan Bhagat","Full Girlfreind","CHBGHG0002"));
		books.add(new Book("Chetan Bhagat","No Girlfreind","CHBGHG0003"));
		books.add(new Book("Dan Brown","Digital Fortress","CHBGHG0004"));
		books.add(new Book("Dan Brown","Origin","CHBGHG0005"));
		books.add(new Book("Dan Brown","Angels n Demons","CHBGHG0006"));
		books.add(new Book("Tolkein","Hobbit","CHBGHG0007"));
		books.add(new Book("Tolkien","Return of the king","CHBGHG0008"));
		books.add(new Book("Tolkien","The Two Towers","CHBGHG0009"));
		books.add(new Book("Amish Tiripathi", "Immortals of Meluha","CHBGHG0010"));
		books.add(new Book("JK Rowling","Harry Potter and The Goblet of Fire","CHBGHG0011"));
		books.add(new Book("JK Rowling","Harry Potter and The Sorcerer's stone","CHBGHG0012"));
		books.add(new Book("JK Rowling","Harry Potter and Half Blood Prince","CHBGHG0013"));
		books.add(new Book("JK Rowling","Harry Potter and Deathly Hallows","CHBGHG0014"));
		books.add(new Book("JK Rowling","Harry Potter and Chamber of Secrets","CHBGHG0015"));
		books.add(new Book("JK Rowling","Harry Potter and Prisoner of Azkaban","CHBGHG0016"));
	
		return books;	
	}
}
