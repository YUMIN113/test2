package io_practice.practice17.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import io_practice.practice17.domain.Menu;

public class MenuApp {
	
	Scanner sc = new Scanner(System.in);
	private List<Menu> menuList = new ArrayList<>();
	
	public void printAllMenu() throws Exception {
		System.out.println();
		System.out.println("[메뉴 조회]");
		
		List<Menu> targetMenuList = findAllMenu();
		
		for(Menu menu : targetMenuList) {
			System.out.print("\t");
			System.out.println(menu.getItemNum() + ". " + menu.getItemCategory() + " : " + menu.getItemName() + " " + menu.getItemPrice() + "(원)");
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Menu> findAllMenu() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Temp/menuList.txt"));	
		List<Menu> targetMenuList = (List<Menu>) ois.readObject();
		ois.close();
		return targetMenuList;
	}

	public void addMenu() throws Exception {
		
		menuList = findAllMenu();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Temp/menuList.txt"));
		
		System.out.println("[메뉴 추가]");
		System.out.print("메뉴번호를 입력하세요 =>");
		long itemNum = Long.parseLong(sc.nextLine());
		System.out.print("메뉴 카테고리를 입력하세요(커피,에이드,케이크) =>");
		String itemCategory = sc.nextLine();
		System.out.print("메뉴명을 입력하세요 =>");
		String itemName = sc.nextLine();
		System.out.print("가격을 입력하세요 =>");
		int itemPrice = Integer.parseInt(sc.nextLine());
		
		Menu menu = new Menu(itemNum, itemCategory, itemName, itemPrice);
		menuList.add(menu);
		
		oos.writeObject(menuList);
		
		oos.flush();
		oos.close();
	}
	
	public void deleteMenu() throws Exception {
		
		menuList = findAllMenu();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Temp/menuList.txt"));
		
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
		
		menuList = findAllMenu();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Temp/menuList.txt"));
		
		System.out.println("[메뉴 수정]");
		System.out.print("메뉴번호를 입력하세요 =>");
		long itemNum = Long.parseLong(sc.nextLine());
		System.out.print("메뉴 카테고리를 입력하세요(커피,에이드,케이크) =>");
		String itemCategory = sc.nextLine();
		System.out.print("메뉴명을 입력하세요 =>");
		String itemName = sc.nextLine();
		System.out.print("가격을 입력하세요 =>");
		int itemPrice = Integer.parseInt(sc.nextLine());
		
		for(Menu menu : menuList) {
			if(menu.getItemNum() == itemNum) {
				menu.setItemCategory(itemCategory);
				menu.setItemName(itemName);
				menu.setItemPrice(itemPrice);
			}
		}
		oos.writeObject(menuList);
		
		oos.flush();
		oos.close();
		
	}

}
