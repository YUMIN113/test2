package io_practice.practice17.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import io_practice.practice17.domain.Menu;

public class MenuApp {
	
	Scanner sc = new Scanner(System.in);
	private List<Menu> menuList = new ArrayList<>();
	
	public void printAllMenu() {
		System.out.println();
		System.out.println("[메뉴 조회]");
		
		try {
			findAllMenu().forEach(System.out::println);
		} catch(Exception ex) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
	}

	public List<Menu> findAllMenu() throws IOException, ClassNotFoundException {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/file/menuList.txt"));
			List<Menu> targetMenuList = (List<Menu>) ois.readObject();
			ois.close();
			return targetMenuList;
	}

	public void addMenu() throws Exception {
		
		// 에러 발생해도 메인쓰레드 멈추지 않고 실행
		try {
			menuList = findAllMenu();
		} catch(Exception ex) {
			
		}
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/file/menuList.txt"));
		
		System.out.println();
		System.out.println("[메뉴 추가]");
		menuList.add(createMenu());
		
		oos.writeObject(menuList);
		
		oos.flush();
		oos.close();
	}
	
	public void deleteMenu() throws Exception {
		
		try {
			menuList = findAllMenu();
		} catch(FileNotFoundException ex) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/file/menuList.txt"));
		
		System.out.println();
		System.out.println("[메뉴 삭제]");
		System.out.print("메뉴번호를 입력하세요 =>");
		long itemNum = Long.parseLong(sc.nextLine());

		
		for(int i = 0; i < menuList.size(); i++) {
			if(menuList.get(i).getItemNum() == itemNum) {
				menuList.remove(i);
			}
		}
		oos.writeObject(menuList);
		
		oos.flush();
		oos.close();
	}
	
	public void updateMenu() throws Exception {
		
		try {
			menuList = findAllMenu();
		} catch(FileNotFoundException ex) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/file/menuList.txt"));
		
		System.out.println();
		System.out.println("[메뉴 수정]");
		Menu menu = createMenu();
		
		for(Menu inListMenu : menuList) {
			if(inListMenu.getItemNum() == menu.getItemNum()) {
				inListMenu.setItemCategory(menu.getItemCategory());
				inListMenu.setItemName(menu.getItemName());
				inListMenu.setItemPrice(menu.getItemPrice());
			}
		}
		oos.writeObject(menuList);
		
		oos.flush();
		oos.close();
		
	}
	
	private Menu createMenu() {
		System.out.print("메뉴번호를 입력하세요 =>");
		long itemNum = Long.parseLong(sc.nextLine());
		System.out.print("메뉴 카테고리를 입력하세요(커피,에이드,케이크) =>");
		String itemCategory = sc.nextLine();
		System.out.print("메뉴명을 입력하세요 =>");
		String itemName = sc.nextLine();
		System.out.print("가격을 입력하세요 =>");
		int itemPrice = Integer.parseInt(sc.nextLine());
		return new Menu(itemNum, itemCategory, itemName, itemPrice);
	}

}
