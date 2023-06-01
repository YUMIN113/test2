package io_practice.practice17.service;

import java.util.Scanner;

public class CafeApp {
	
	Scanner sc = new Scanner(System.in);
	MenuApp menuApp = new MenuApp();
	OrderApp orderApp = new OrderApp();

	public void begin() throws Exception {
		
		boolean whileLoop = true;
		
		while(whileLoop) {
			System.out.println();
			System.out.println("########## Cafe App ##########");
			System.out.println("1. 메뉴 관리");
			System.out.println("2. 주문 관리");
			System.out.println("9. 종료");
			System.out.print("메뉴를 선택하세요=>");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1" :
				printMenuList();
				break;
			case "2" :
				printOrderList();
				break;
			case "9":
				System.out.println();
				System.out.println("[종료]");
				System.out.println("프로그램을 종료합니다.");
				whileLoop = false;
				break;
			default:
				System.out.println("잘못 선택하셨습니다.");
				break;
			}
		}
	}
	
	public void printMenuList() throws Exception {
		boolean whileLoop = true;
		
		while(whileLoop) {
			System.out.println();
			System.out.println("========== [메뉴 관리] ==========");
			System.out.println("1. 메뉴 조회");
			System.out.println("2. 메뉴 추가");
			System.out.println("3. 메뉴 수정");
			System.out.println("4. 메뉴 삭제");
			System.out.println("9. 종료");
			System.out.print("메뉴를 선택하세요=>");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1" :
				menuApp.printAllMenu();
				break;
			case "2" :
				menuApp.addMenu();
				break;
			case "3" :
				menuApp.updateMenu();
				break;
			case "4" :
				menuApp.deleteMenu();
				break;
			case "9":
				System.out.println();
				System.out.println("[종료]");
				System.out.println("메뉴 관리 업무를 종료합니다.");
				whileLoop = false;
				break;
			default:
				System.out.println("잘못 선택하셨습니다.");
				break;
			}
		}
	}
	
	public void printOrderList() throws Exception {
		boolean whileLoop = true;
		
		while(whileLoop) {
			System.out.println();
			System.out.println("========== [주문 관리] ==========");
			System.out.println("1. 메뉴 조회");
			System.out.println("2. 주문");
			System.out.println("3. 주문 조회");
			System.out.println("9. 종료");
			System.out.print("메뉴를 선택하세요=>");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1" :
				menuApp.printAllMenu();
				break;
			case "2" :
				orderApp.addOrder();
				break;
			case "3" :
				orderApp.printOrderList();
				break;
			case "9":
				System.out.println();
				System.out.println("[종료]");
				System.out.println("주문 관리 업무를 종료합니다.");
				whileLoop = false;
				break;
			default:
				System.out.println("잘못 선택하셨습니다.");
				break;
			}
		}
	}
}
