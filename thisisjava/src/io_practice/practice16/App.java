package io_practice.practice16;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		Scanner sc = new Scanner(System.in);
		
		boolean whileLoop = true;
		while(whileLoop) {
			try {
				System.out.println("\n========== [메뉴 선택] ==========");
				System.out.println("1. 전체 출력");
				System.out.println("2. 등록");
				System.out.println("3. 수정");
				System.out.println("4. 삭제");
				System.out.println("5. 조회(성별)");
				System.out.println("6. 조회(나이 구간)");
				System.out.println("9. 종료");
				System.out.println("메뉴를 선택하세요 =>");
				String menu = sc.nextLine();
				
				switch(menu) {
				case "1":
					System.out.println("[전체 출력]");
					manager.printPersonList();
					break;
				case "2":
					System.out.println("[등록]");
					manager.addPerson(sc);
					break;
				}
			} catch (Exception e) {
				
			}
		}
		
		sc.close();
		System.out.println("Scanner Closed.");

	}

}
