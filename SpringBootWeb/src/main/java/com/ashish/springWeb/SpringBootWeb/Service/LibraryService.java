package com.ashish.springWeb.SpringBootWeb.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import com.ashish.springWeb.SpringBootWeb.Controllers.Model.Library;
import com.ashish.springWeb.SpringBootWeb.Controllers.Model.Library.Book;

@Service
@Scope("singleton")
public class LibraryService {
	private Library library;

	public LibraryService() {
		setLibrary();
	}
	private void setLibrary() {
		library = new Library();
		List<Book> bookList = new ArrayList<Book>();

		Library.Book book1 = new Library.Book();
		book1.setId(1);
		book1.setName("Bookless In baghdad");
		Library.Book.Author author1 = new Library.Book.Author();
		author1.setName("Shashi Tharoor");
		book1.setAuthor(author1);
		Library.Book.Price price1 = new Library.Book.Price();
		price1.setCostPrice(400);
		price1.setSelligPrice(500);
		price1.setDiscount(30);
		book1.setPrice(price1);
		bookList.add(book1);

		Library.Book book2 = new Library.Book();
		book2.setId(2);
		book2.setName("Demonetization");
		book2.setAuthor(author1);
		Library.Book.Price price2 = new Library.Book.Price();
		price2.setCostPrice(800);
		price2.setSelligPrice(1200);
		price2.setDiscount(13);
		book2.setPrice(price2);
		bookList.add(book2);
		library.setBook(bookList);
	}

	public Library getLibrary() {
		return library;
	}
}
