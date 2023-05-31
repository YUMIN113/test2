package collection_practice.list_practice.practice03.domain;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class BookStore {
	
	private List<Book> bookList;

	public BookStore(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public void printBookStore() {
		
		for(int i = 0; i < bookList.size(); i++) {
			System.out.println();
			System.out.println((i + 1) + ".");
			printBookInfo(i);
		}
	}
	
	public void printBooksByCategory(String category) {

		int count = 0;
		int num = 1;
		
		for(int i = 0; i < bookList.size(); i++) {
			
			if(bookList.get(i).getCategory().equals(category)) {
				System.out.println();
				System.out.println(num + ".");
				printBookInfo(i);
				count++;
				num++;
			}
		
		}
		
		if(count == 0) {
			printNoData();
		}
	}
	
	public void printBookByIsbn(String isbn) {
		
		int count = 0;
		int num = 1;
		
		for(int i = 0; i < bookList.size(); i++) {
					
			if(bookList.get(i).getIsbn().equals(isbn)) {
				System.out.println();
				System.out.println(num + ".");
				printBookInfo(i);
				count++;
				num++;
			}
				
		}
		
		if(count == 0) {
			printNoData();
		}

	}
	
	public void printBooksByTitleLike(String title) {
		
		int count = 0;
		int num = 1;
		
		for(int i = 0; i < bookList.size(); i++) {
					
			if(bookList.get(i).getTitle().contains(title)) {
				System.out.println();
				System.out.println(num + ".");
				printBookInfo(i);
				count++;
				num++;
			}
				
		}
		
		if(count == 0) {
			printNoData();
		}
		
	}
	
	public void printBooksByMaxPrice(int maxPrice) {
		
        int count = 0;
        int num = 1;
		
		for(int i = 0; i < bookList.size(); i++) {
					
			if(bookList.get(i).getPrice() <= maxPrice) {
				System.out.println();
				System.out.println(num + ".");
				printBookInfo(i);
				count++;
				num++;
			}
				
		}
		
		if(count == 0) {
			printNoData();
		}
		
	}
	
    public void printBooksByMinPrice(int minPrice) {
		
        int count = 0;
        int num = 1;
		
		for(int i = 0; i < bookList.size(); i++) {
					
			if(bookList.get(i).getPrice() >= minPrice) {
				System.out.println();
				System.out.println(num + ".");
				printBookInfo(i);
				count++;
				num++;
			}
				
		}
		
		if(count == 0) {
			printNoData();
		}
		
	}
    
    public void printBooksByBetweenPrice(int betweenMinPrice, int betweemMaxPrice) {
		
        int count = 0;
        int num = 1;
		
		for(int i = 0; i < bookList.size(); i++) {
					
			if(bookList.get(i).getPrice() >= betweenMinPrice && bookList.get(i).getPrice() <= betweemMaxPrice) {
				System.out.println();
				System.out.println(num + ".");
				printBookInfo(i);
				count++;
				num++;
			}
				
		}
		
		if(count == 0) {
			printNoData();
		}
		
	}
	
	private String decimalPrice(int price) {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(price);
	}
	
	private String changeCategory(String category) {
		
		String str = " ";
		
		switch(category) {
		
		case "comic" :
			return str = "만화";
			
		case "travel" :
			return str = "여행";
		
		case "food" :
			return str = "음식";
		}
		return str;
	}
	
	private void printBookInfo(int i) {
		System.out.println("분야=" + changeCategory(bookList.get(i).getCategory()));
		System.out.println("제목=" + bookList.get(i).getTitle());
		System.out.println("저자=" + bookList.get(i).getWriter());
		System.out.println("출판사=" + bookList.get(i).getPublisher());
		System.out.println("가격=" + decimalPrice(bookList.get(i).getPrice()));
		System.out.println("isbn=" + bookList.get(i).getIsbn());
		System.out.println();
	}
	
	private void printNoData() {
		System.out.println();
		System.out.println("No data available.");
	}
	
}
