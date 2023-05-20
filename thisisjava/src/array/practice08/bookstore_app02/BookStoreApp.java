package array.practice08.bookstore_app02;

import array.practice08.domain.Book;
import array.practice08.domain.BookStore;
import array.practice08.domain.Cart;
import array.practice08.domain.Member;
import array.practice08.domain.Shirt;
import array.practice08.service.BookService;
import array.practice08.service.ShirtService;

public class BookStoreApp {

	public static void main(String[] args) {
		
		Member member = new Member("coldwinter", "Victoria", "A", 5000);
		
		Book[] bookArray = new Book[5];
		bookArray[0] = BookService.makeBook("comic", "열혈강호", "전극진,양재현", "대원씨아이", 4500, "979-11-5754-926-9");
		bookArray[1] = BookService.makeBook("travel", "뉴욕 100배 즐기기", "홍지윤", "알에이치코리아", 14400,	 "978-89-255-8673-1");
		bookArray[2] = BookService.makeBook("travel", "바르셀로나, 지금이 좋아", "정다운", "중앙북스", 15000, "978-89-991-7580-0");
		bookArray[3] = BookService.makeBook("food",	"오늘의 맥주", "이성준", "오운", 18000, "979-11-92814-04-9");
		bookArray[4] = BookService.makeBook("food",	"버번 위스키의 모든 것", "조승원", "(주)교유당", 24000, "979-11-90277-42-6");
		
		Shirt[] shirtArray = new Shirt[3];
		shirtArray[0] = ShirtService.makeService("코튼/린넨 버튼 다운 셔츠", "blue",	"Zara", "면 50%,마 50%", "M", 60000);
		shirtArray[1] = ShirtService.makeService("코튼 셔츠", "white", "Zara",	 "면 100%", "L", 45000);
		shirtArray[2] = ShirtService.makeService("코튼 버튼 다운 셔츠", "black",	"Zara", "면 100%", "L", 53000);
		
	    Cart c = new Cart(member, bookArray, shirtArray);
	    
	    System.out.println("\n===== printBooksExpense() =====");
	    c.printBooksExpense();
	    
	    System.out.println("\n===== printBooksInfo() =====");
	    c.printBooksInfo();
	    
	    System.out.println("\n===== printBooksInfoByCategory() =====");
	    
	    System.out.println("\n----- travel -----");
	    String category = "travel";
	    c.printBooksInfoByCategory(category);
	    
	    System.out.println("\n----- health -----");
	    category = "health";
	    c.printBooksInfoByCategory(category);
	    
	    System.out.println("\n===== printShirtsExpense() =====");
	    c.printShirtsExpense();
	    
	    System.out.println("\n===== printShirtsInfo() =====");
	    c.printShirtsInfo();
	    
	    System.out.println("\n===== printTotalExpense() =====");
	    c.printTotalExpense();
	    
	    System.out.println("\n===== printCartInfo() =====");
	    c.printCartInfo();
	    
	    System.out.println("\n===== printGiftYn() =====");
	    c.printGiftYn();
	    
	    System.out.println("\n===== buy() =====");
	    boolean pointUseYn = true;
	    c.buy(pointUseYn);
	   
	}

}
