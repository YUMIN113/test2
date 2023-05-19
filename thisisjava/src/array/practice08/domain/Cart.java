package array.practice08.domain;

import java.text.DecimalFormat;

public class Cart {

	private Member member;
	private Book[] bookArray;
	private Shirt[] shirtArray;
	
	public Cart(Member member, Book[] bookArray, Shirt[] shirtArray) {
		this.member = member;
		this.bookArray = bookArray;
		this.shirtArray = shirtArray;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Book[] getBookArray() {
		return bookArray;
	}

	public void setBookArray(Book[] bookArray) {
		this.bookArray = bookArray;
	}

	public Shirt[] getShirtArray() {
		return shirtArray;
	}

	public void setShirtArray(Shirt[] shirtArray) {
		this.shirtArray = shirtArray;
	}
	
	// Methods
	
	// Book
	public void printBooksExpense() {
		String decimalTotalBooksExpense = sumTotalBooksExpense();
		System.out.println("도서 총 금액 : " + decimalTotalBooksExpense + "(원)");
	}
	
	private String sumTotalBooksExpense() {
		int totalBooksExpense = 0;
		for(int i = 0; i < bookArray.length; i++) {
			totalBooksExpense += bookArray[i].getPrice();
		}
		return decimalPrice(totalBooksExpense);
	}
	
	public void printBooksInfo() {
	
		for(int i = 0; i < bookArray.length; i++) {
			System.out.println();
			System.out.println((i + 1) + ".");
			printBookDetail(i);
		}
		System.out.println("* 구매수 : " + bookArray.length + "(권)");
		String decimalTotalBooksExpense = sumTotalBooksExpense();
		System.out.println("* 구매액 : " + decimalTotalBooksExpense + "(원)");
	}
	
	public void printBooksInfoByCategory(String category) {

		int count = 0;
		int num = 1;
		int totalCategoryExpense = 0;
		
		for(int i = 0; i < bookArray.length; i++) {
			
			if(bookArray[i].getCategory().equals(category)) {
				System.out.println();
				System.out.println(num + ".");
				printBookDetail(i);
				count++;
				num++;
				totalCategoryExpense += bookArray[i].getPrice();
			}
		
		}
		
		if(count != 0) {
			System.out.println("* 구매수 : " + count + "(권)");
			String decimalTotalCategoryExpense = decimalPrice(totalCategoryExpense);
			System.out.println("* 구매액 : " + decimalTotalCategoryExpense + "(원)");
		}
		
		if(count == 0) {
			printNoData();
		}
	}
	
	private void printBookDetail(int i) {
		System.out.println("분야=" + changeCategory(bookArray[i].getCategory()));
		System.out.println("제목=" + bookArray[i].getTitle());
		System.out.println("저자=" + bookArray[i].getWriter());
		System.out.println("출판사=" + bookArray[i].getPublisher());
		System.out.println("가격=" + decimalPrice(bookArray[i].getPrice()) + "(원)");
		System.out.println("isbn=" + bookArray[i].getIsbn());
		System.out.println();
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
	
    // Shirt
    
    public void printShirtsExpense() {
		String decimalTotalShirtsExpense = sumTotalShirtsExpense();
		System.out.println("셔츠 총 금액 : " + decimalTotalShirtsExpense + "(원)");
	}
    
    private String sumTotalShirtsExpense() {
		int totalShirtsExpense = 0;
		for(int i = 0; i < shirtArray.length; i++) {
			totalShirtsExpense += shirtArray[i].getShirtPrice();
		}
		return decimalPrice(totalShirtsExpense);
	}
    
    public void printShirtsInfo() {
    	
		for(int i = 0; i < shirtArray.length; i++) {
			System.out.println();
			System.out.println((i + 1) + ".");
			printShirtDetail(i);
		}
		System.out.println("* 구매수 : " + shirtArray.length + "(벌)");
		String decimalTotalShirtsExpense = sumTotalShirtsExpense();
		System.out.println("* 구매액 : " + decimalTotalShirtsExpense + "(원)");
	}
    
    private void printShirtDetail(int i) {
		System.out.println("상품명=" + shirtArray[i].getShirtName());
		System.out.println("색상=" + shirtArray[i].getShirtColor());
		System.out.println("제조사=" + shirtArray[i].getShirtCompany());
		System.out.println("소재=" + shirtArray[i].getShirtMaterials());
		System.out.println("크기=" + shirtArray[i].getShirtSize());
		System.out.println("가격=" + decimalPrice(shirtArray[i].getShirtPrice()) + "(원)");
		System.out.println();
	}
    
    public void printTotalExpense() {
//    	int totalBooksExpense = 0;
//		for(int i = 0; i < bookArray.length; i++) {
//			totalBooksExpense += bookArray[i].getPrice();
//		}
//		
//		int totalShirtsExpense = 0;
//		for(int i = 0; i < shirtArray.length; i++) {
//			totalShirtsExpense += shirtArray[i].getShirtPrice();
//		}
//    	
//    	int totalExpense = totalBooksExpense + totalShirtsExpense;
    	int sumExpense = printSum();
    	System.out.println("지출 총 금액 : " + decimalPrice(sumExpense));
    }
    
    private int printSum() {
    	int totalBooksExpense = 0;
		for(int i = 0; i < bookArray.length; i++) {
			totalBooksExpense += bookArray[i].getPrice();
		}
		
		int totalShirtsExpense = 0;
		for(int i = 0; i < shirtArray.length; i++) {
			totalShirtsExpense += shirtArray[i].getShirtPrice();
		}
    	
    	int totalExpense = totalBooksExpense + totalShirtsExpense;
    	return totalExpense;
    }
   
    public void printCartInfo() {
    	System.out.println("\n----- Books Info -----");
    	printBooksInfo();
    	System.out.println("\n----- Shirts Info -----");
    	printShirtsInfo();
    	System.out.println("\n----- Total Info -----");
    	System.out.println("*구매수");
    	System.out.println("      책 : " + bookArray.length + "(권)");
    	System.out.println("      셔츠 : " + shirtArray.length + "(벌)");
    	int sumExpense = printSum();
    	System.out.println("*구매액 총합 : " + decimalPrice(sumExpense) + "(원)");
    	
    }
    
    public void printGiftYn() {
    	if(printSum() >= 200000) {
    		System.out.println("사은품 여부 : 대상");
    	} else {
    		System.out.println("사은품 여부 : 비대상");
    	}
    }
    
    public void buy(boolean pointUseYn) {
    	System.out.println("\n===== [ 영수증 ] =====");
    	System.out.println("----- 고객 -----");
    	
    	System.out.println("아이디 : " + member.getMemberId());
    	System.out.println("이름 : " + member.getMemberName());
    	System.out.println("등급 : " + member.getMemberRating());
    	
    	System.out.println("\n----- 구매내역 -----");
    	System.out.println("도서");
    	
    	for(int i = 0; i < bookArray.length; i++) {
    		System.out.println("    " + (i + 1) + " " + bookArray[i].getTitle() + " " + decimalPrice(bookArray[i].getPrice()) + "(원)");
    	}
    	
    	
    	System.out.println("셔츠");
    	
    	for(int i = 0; i < shirtArray.length; i++) {
    		System.out.println("    " + (i + 1) + " " + shirtArray[i].getShirtName() + " " + decimalPrice(shirtArray[i].getShirtPrice()) + "(원)");
    	}
    	
    	System.out.println("\n----- 구매금액 -----");
    	
    	int totalBooksExpense = 0;
		for(int i = 0; i < bookArray.length; i++) {
			totalBooksExpense += bookArray[i].getPrice();
		}
    	System.out.println("도서 : " + totalBooksExpense + "(원)");
    	
    	int totalShirtsExpense = 0;
		for(int i = 0; i < shirtArray.length; i++) {
			totalShirtsExpense += shirtArray[i].getShirtPrice();
		}
		System.out.println("셔츠 : " + totalShirtsExpense + "(원)");
		
		System.out.println("총액 : " + printSum() + "(원)");
		
	    System.out.println("\n----- 결제금액 -----");
	    
	    int memberPoint = member.getMemberPoint();
	    if(pointUseYn == true) {
	    	
	    	System.out.println("포인트 사용 : " + decimalPrice(memberPoint));
	    	System.out.println("결제금액 : " + decimalPrice(printSum() - memberPoint) + "(원)");
	    	memberPoint -= memberPoint;
	    } else {
	    	System.out.println("결제금액 : " + decimalPrice(printSum()) + "(원)");
	    }
	    
	    System.out.println("\n----- 포인트 -----");
	    System.out.println("현재 포인트 : " + decimalPrice(memberPoint));
	    
	    if(member.getMemberRating().equals("S")) {
	    	memberPoint = (printSum() / 100) * 3;
	    } else if(member.getMemberRating().equals("A")) {
	    	memberPoint = (printSum() / 100) * 2;
	    } else if(member.getMemberRating().equals("B")) {
	    	memberPoint = (printSum() / 100) * 1;
	    }
	    
	    member.setMemberPoint(memberPoint);
	    System.out.println("신규 포인트 : " + decimalPrice(member.getMemberPoint()));
	    System.out.println("누적 포인트 : " + decimalPrice(member.getMemberPoint()));
	    
	    System.out.println("\n----- 사은품 -----");
	    printGiftYn();
    }
    
    // 공통
	private void printNoData() {
		System.out.println();
		System.out.println("No data available.");
	}
	
	private String decimalPrice(int price) {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(price);
	}
	
	
	
	
}
