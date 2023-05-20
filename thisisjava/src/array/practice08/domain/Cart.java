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
		System.out.println("도서 총 금액 : " + toDecimalPrice(sumTotalBooksExpense()));
	}

	public void printBooksInfo() {
		for(int i = 0; i < bookArray.length; i++) {
			System.out.println();
			System.out.println((i + 1) + ".");
			printBookDetail(i);
		}
		printTotalCountTotalExpense(bookArray.length, sumTotalBooksExpense(), "book");
	}
	
	public void printBooksInfoByCategory(String category) {
		int count = 0;
		long totalCategoryExpense = 0;
		
		for(int i = 0; i < bookArray.length; i++) {
			if(bookArray[i].getCategory().equals(category)) {
				count++;
				System.out.println();
				System.out.println(count + ".");
				printBookDetail(i);
				totalCategoryExpense += bookArray[i].getPrice();
			}
		}
		if(count != 0) {
			printTotalCountTotalExpense(count, totalCategoryExpense, "book");
		} else {
			printNoData();
		}
	}

	private long sumTotalBooksExpense() {
		long totalBooksExpense = 0;
		for(int i = 0; i < bookArray.length; i++) {
			totalBooksExpense += bookArray[i].getPrice();
		}
		return totalBooksExpense;
	}
	
	private void printBookDetail(int i) {
		System.out.println("분야=" + toKoreanNameCategory(bookArray[i].getCategory()));
		System.out.println("제목=" + bookArray[i].getTitle());
		System.out.println("저자=" + bookArray[i].getWriter());
		System.out.println("출판사=" + bookArray[i].getPublisher());
		System.out.println("가격=" + toDecimalPrice(bookArray[i].getPrice()));
		System.out.println("isbn=" + bookArray[i].getIsbn());
	}
	
    private String toKoreanNameCategory(String category) {
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
    	System.out.println("셔츠 총 금액 : " + toDecimalPrice(sumTotalShirtsExpense()));
    }
    
    public void printShirtsInfo() {
		for(int i = 0; i < shirtArray.length; i++) {
			System.out.println();
			System.out.println((i + 1) + ".");
			printShirtDetail(i);
		}
		printTotalCountTotalExpense(shirtArray.length, sumTotalShirtsExpense(), "shirt");
	}
    
    private long sumTotalShirtsExpense() {
		long totalShirtsExpense = 0;
		for(int i = 0; i < shirtArray.length; i++) {
			totalShirtsExpense += shirtArray[i].getShirtPrice();
		}
		return totalShirtsExpense;
	}
    
    private void printShirtDetail(int i) {
		System.out.println("상품명=" + shirtArray[i].getShirtName());
		System.out.println("색상=" + shirtArray[i].getShirtColor());
		System.out.println("제조사=" + shirtArray[i].getShirtCompany());
		System.out.println("소재=" + shirtArray[i].getShirtMaterials());
		System.out.println("크기=" + shirtArray[i].getShirtSize());
		System.out.println("가격=" + toDecimalPrice(shirtArray[i].getShirtPrice()));
    }
    
    // Total
    
    public void printTotalExpense() {
    	System.out.println("지출 총 금액 : " + toDecimalPrice(sumTotalExpense()));
    }
    
    public void printCartInfo() {
    	System.out.println("\n----- Books Info -----");
    	printBooksInfo();
    	System.out.println("\n----- Shirts Info -----");
    	printShirtsInfo();
    	System.out.println("\n----- Total Info -----");
    	System.out.println("* 구매수");
    	System.out.println("      책 : " + bookArray.length + "(권)");
    	System.out.println("      셔츠 : " + shirtArray.length + "(벌)");
    	System.out.println("* 구매액 총합 : " + toDecimalPrice(sumTotalExpense()));
    }

    public void printGiftYn() {
    	System.out.println("사은품 여부 : " + ((sumTotalExpense() >= 200000) ? "대상" : "비대상"));
    }
    
    public void buy(boolean pointUseYn) {
    	System.out.println("\n===== [ 영수증 ] =====");
    	
    	System.out.println("\n----- 고객 -----");
    	printMemberInfo();
    	
    	System.out.println("\n----- 구매내역 -----");
    	printPurchaseItemList();
    	
    	System.out.println("\n----- 구매금액 -----");
    	printTotalExpenseListByItem();
		
	    System.out.println("\n----- 결제금액 -----");
	    printPayment(pointUseYn);
	    
	    System.out.println("\n----- 포인트 -----");
	    int latestPoint = member.getMemberPoint();
	    int newPoint = createPoint(member.getMemberRating());
	    int totalPoint = accumulatePoint(latestPoint, newPoint);
	    printPoint(latestPoint, newPoint, totalPoint);

	    System.out.println("\n----- 사은품 -----");
	    printGiftYn();
    }
    
    private long sumTotalExpense() {
    	return sumTotalBooksExpense() + sumTotalShirtsExpense();
    }
    
    private void printMemberInfo() {
    	System.out.println("아이디 : " + member.getMemberId());
    	System.out.println("이름 : " + member.getMemberName());
    	System.out.println("등급 : " + member.getMemberRating());
    }
    
    private void printPurchaseItemList() {
        System.out.println("도서");
    	
    	for(int i = 0; i < bookArray.length; i++) {
    		System.out.print("     ");
    		System.out.print((i + 1) + ". ");
    		System.out.print(bookArray[i].getTitle() + " ");
    		System.out.println(toDecimalPrice(bookArray[i].getPrice()));
    	}
    	System.out.println("셔츠");
    	
    	for(int i = 0; i < shirtArray.length; i++) {
    		System.out.print("     ");
    		System.out.print((i + 1) + ". ");
    		System.out.print(shirtArray[i].getShirtName() + " ");
    		System.out.println(toDecimalPrice(shirtArray[i].getShirtPrice()));
    	}
    }
    
    private void printTotalExpenseListByItem() {
    	System.out.println("도서 : " + toDecimalPrice(sumTotalBooksExpense()));
    	System.out.println("셔츠 : " + toDecimalPrice(sumTotalShirtsExpense()));
    	System.out.println("총액 : " + toDecimalPrice(sumTotalExpense()));
    }
    
    private void printPayment(boolean pointUseYn) {
    	int usedPoint = member.getMemberPoint();
    	long totalPayment = createPayment(pointUseYn, usedPoint);
    	if(pointUseYn == true) {
    		System.out.println("포인트 사용 : " + toDecimalPoint(usedPoint));
        	System.out.println("결제금액 : " + toDecimalPrice(totalPayment));
    	} else {
    		System.out.println("결제금액 : " + toDecimalPrice(totalPayment));
    	}
    }
    
    private long createPayment(boolean pointUseYn, int usedPoint) {
    	long totalPayment = 0;
    	if(pointUseYn == true) {
        	totalPayment = sumTotalExpense() - usedPoint;
        	member.setMemberPoint(member.getMemberPoint() - usedPoint);
    	} else {
    		totalPayment = sumTotalExpense();
    	}
    	return totalPayment;
    }
    
    private void printPoint(int latestPoint, int newPoint, int totalPoint) {
    	System.out.println("현재 포인트 : " + toDecimalPoint(latestPoint));
    	System.out.println("신규 포인트 : " + toDecimalPoint(newPoint));
    	System.out.println("누적 포인트 : " + toDecimalPoint(totalPoint));
    }
    
    private int createPoint(String memberRating) {
    	int newPoint = 0;
    	if(memberRating.equals("S")) {
    		newPoint = (int) ((sumTotalExpense() * 3) / 100);
	    } else if(memberRating.equals("A")) {
	    	newPoint = (int) ((sumTotalExpense() * 2) / 100);
	    } else if(memberRating.equals("B")) {
	    	newPoint = (int) ((sumTotalExpense() * 1) / 100);
	    }
    	return newPoint;
    }
    
    private int accumulatePoint(int latestPoint, int newPoint) {
    	return latestPoint + newPoint;
    }
    
    // 공통
    
    private void printTotalCountTotalExpense(int totalCount, long totalExpense, String item) {
		System.out.println();
		System.out.println("* 구매수 : " + totalCount + ((item == "book") ? "(권)" : "(벌)"));
		System.out.println("* 구매액 : " + toDecimalPrice(totalExpense));
	}
	
	private void printNoData() {
		System.out.println();
		System.out.println("No data available.");
	}
	
	private String toDecimalPrice(long price) {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(price) + "(원)";
	}	
	
	private String toDecimalPoint(int point) {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(point);
	}	
	
}
