package collection_practice.list_practice.practice03.domain;

import java.util.StringTokenizer;

public class Book {
	
	private String category;
	private String title;
	private String writer;
	private String publisher;
	private int price;
	private String isbn;
	
	public static Book of(String category, String title, String writer, String publisher, int price, String isbn) {
		return Book.builder()
				.isbn(isbn)
				.category(category)
				.title(title)
				.publisher(publisher)
				.writer(writer)
				.price(price)
				.build();
	}
	
	public static Book of(StringTokenizer st) {	
		return Book.builder()
				.category(st.nextToken())
				.title(st.nextToken())
				.writer(st.nextToken())
				.publisher(st.nextToken())
				.price(Integer.parseInt(st.nextToken()))
				.isbn(st.nextToken())
				.build();
	}
	
	public Book(Builder builder) {
		this.category = builder.category;
		this.title = builder.title;
		this.writer = builder.writer;
		this.publisher = builder.publisher;
		this.price = builder.price;
		this.isbn = builder.isbn;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	static class Builder {
		private String category;
		private String title;
		private String writer;
		private String publisher;
		private int price;
		private String isbn;
		
		public Builder category(String category) {
			this.category = category;
			return this;
		}
		
		public Builder title(String title) {
			this.title = title;
			return this;
		}
		
		public Builder writer(String writer) {
			this.writer = writer;
			return this;
		}
		
		public Builder publisher(String publisher) {
			this.publisher = publisher;
			return this;
		}
		
		public Builder price(int price) {
			this.price = price;
			return this;
		}
		
		public Builder isbn(String isbn) {
			this.isbn = isbn;
			return this;
		}
		
		public String getCategory() {
			return this.category;
		}
		
		public String getTitle() {
			return this.title;
		}
		
		public String getWriter() {
			return this.writer;
		}
		
		public String getPublisher() {
			return this.publisher;
		}
		
		public int getPrice() {
			return this.price;
		}
		
		public String getIsbn() {
			return this.isbn;
		}
		
		public Book build() {
			return new Book(this);
		}
		
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
