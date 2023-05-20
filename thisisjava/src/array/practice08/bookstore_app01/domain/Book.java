package array.practice08.bookstore_app01.domain;

public class Book {
	
	private String category;
	private String title;
	private String writer;
	private String publisher;
	private int price;
	private String isbn;
	
	public Book(String category, String title, String writer, String publisher, int price, String isbn) {
		this.category = category;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.isbn = isbn;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
