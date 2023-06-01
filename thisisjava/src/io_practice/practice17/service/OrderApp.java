package io_practice.practice17.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import io_practice.practice17.domain.Menu;
import io_practice.practice17.domain.Order;

public class OrderApp {

	Scanner sc = new Scanner(System.in);
	MenuApp menuApp = new MenuApp();
	
	private List<Order> orderList = new ArrayList<>();
	private List<Menu> menuList = new ArrayList<>();
	
	public void addOrder() throws Exception {
		menuList = menuApp.findAllMenu();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Temp/receipt.txt"));
		
		boolean whileLoop = true;
		int orderItemNum = 1;
		
		System.out.println();
		System.out.println("[주문]");
		
		while(whileLoop) {
			System.out.println();

			System.out.print("메뉴 번호를 입력하세요 =>");
			long itemNum = Long.parseLong(sc.nextLine());
			System.out.print("주문 개수를 입력하세요 =>");
			int orderItemCount = Integer.parseInt(sc.nextLine());

			String orderItemName = " ";
			int itemPrice = 0;
			
			for(Menu menu : menuList) {
				if(menu.getItemNum() == itemNum) {
					orderItemName = menu.getItemName();
					itemPrice = menu.getItemPrice();
				}
			}
			long orderItemTotalSum = (itemPrice * orderItemCount);
			Order order = new Order(orderItemNum, orderItemName, orderItemCount, orderItemTotalSum);
			orderList.add(order);
			
			orderItemNum++;
			
			System.out.println("주문을 추가하시겠습니까?");
			System.out.println("\t" + "1.추가");
			System.out.println("\t" + "2.주문 종료");
			System.out.print("선택 =>");
			String num = sc.nextLine();
			
			if(num.equals("2")) {
				whileLoop = false;
				break;
			}
		}
		
		oos.writeObject(orderList);
		
		oos.flush();
		oos.close();
		
		System.out.println("\t" + "주문 목록");
		printOrderInfo();
	}
	
	private void printOrderInfo() throws Exception {
		
		orderList = findAllOrder();
		int finalTotalSum = 0;
		
		for(Order order : orderList) {
			System.out.print("\t" + "주문번호 " + order.getOrderItemNum() + ". ");
			System.out.println(order.getOrderItemName() + " | " + order.getOrderItemCount() + "(개)" + " | " + "금액 : " + order.getOrderItemTotalSum() + "(원)" + " | " + order.getOrderTime());
			finalTotalSum += order.getOrderItemTotalSum();
		}
		
		System.out.println("\t" + "*총 금액 : " + finalTotalSum);
	}
	
	@SuppressWarnings("unchecked")
	public List<Order> findAllOrder() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Temp/receipt.txt"));	
		List<Order> targetOrderList = (List<Order>) ois.readObject();
		ois.close();
		return targetOrderList;
	}
	
	public void printOrderList() throws Exception {
		System.out.println();
		System.out.println("[주문 조회]");
		printOrderInfo();
	}

}
