package array.practice08.bookstore_app01.domain;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class BookStore {
	
	private Book[] bookArray;

	public BookStore(Book[] bookArray) {
		this.bookArray = bookArray;
	}

	public Book[] getBookArray() {
		return bookArray;
	}

	public void setBookArray(Book[] bookArray) {
		this.bookArray = bookArray;
	}
	
	public void printBookStore() {
		
		for(int i = 0; i < bookArray.length; i++) {
			System.out.println();
			System.out.println((i + 1) + ".");
			printBookInfo(i);
		}
	}
	
	public void printBooksByCategory(String category) {

		int count = 0;
		int num = 1;
		
		for(int i = 0; i < bookArray.length; i++) {
			
			if(bookArray[i].getCategory().equals(category)) {
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
		
		for(int i = 0; i < bookArray.length; i++) {
					
			if(bookArray[i].getIsbn().equals(isbn)) {
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
		
		for(int i = 0; i < bookArray.length; i++) {
					
			if(bookArray[i].getTitle().contains(title)) {
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
		
		for(int i = 0; i < bookArray.length; i++) {
					
			if(bookArray[i].getPrice() <= maxPrice) {
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
		
		for(int i = 0; i < bookArray.length; i++) {
					
			if(bookArray[i].getPrice() >= minPrice) {
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
		
		for(int i = 0; i < bookArray.length; i++) {
					
			if(bookArray[i].getPrice() >= betweenMinPrice && bookArray[i].getPrice() < betweemMaxPrice) {
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
		System.out.println("분야=" + changeCategory(bookArray[i].getCategory()));
		System.out.println("제목=" + bookArray[i].getTitle());
		System.out.println("저자=" + bookArray[i].getWriter());
		System.out.println("출판사=" + bookArray[i].getPublisher());
		System.out.println("가격=" + decimalPrice(bookArray[i].getPrice()));
		System.out.println("isbn=" + bookArray[i].getIsbn());
		System.out.println();
	}
	
	private void printNoData() {
		System.out.println();
		System.out.println("No data available.");
	}
	
}
