package collection_practice.list_practice.practice03.service;

import array.practice08.bookstore_app02.domain.Book;

public class BookService {

	public static Book makeBook(String category, String title, String writer, String publisher, int price, String isbn) {
		return new Book(category, title, writer, publisher, price, isbn);
	}
	
}
