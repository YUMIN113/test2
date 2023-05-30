package collection_practice.list_practice.practice03.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Biz {
	
	private String[] contents;
	
	public List<Book> convert(String[] contents) {
		StringTokenizer st;
		List<Book> bookList = new ArrayList<>();
		for(String data : contents) {
			st = new StringTokenizer(data, "/");
			String category = st.nextToken();
			String title = st.nextToken();
			String writer = st.nextToken();
			String publisher = st.nextToken();
			int price = Integer.parseInt(st.nextToken());
			String isbn = st.nextToken();
			
			Book book = new Book(category, title, writer, publisher, price, isbn);
			bookList.add(book);
		}
		return bookList;
	}

}
