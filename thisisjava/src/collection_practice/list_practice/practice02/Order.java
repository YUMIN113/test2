package collection_practice.list_practice.practice02;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Order {

	private List<Menu> menuList;
	private static int orderCount = 0;
	private static int menuCount = 0;
	private static long totalSum = 0;

	public Order(List<Menu> menuList) {
		this.menuList = menuList;
		orderCount++;
	}
	
	public void printOrder() {
		
		System.out.println("\n===== 주문서 =====");
		int orderNum = orderCount;
		System.out.println("* 주문번호 : " + orderNum);
		for(int i = 0; i < menuList.size(); i++) {
			System.out.print("\t" + (i + 1) + ".");
			menuList.get(i).printInfo();
		}
		menuCount += menuList.size();
		System.out.println("* 주문 메뉴수 : " + menuList.size());
		
		long sum = totalSum(menuList);
		totalSum += sum;
		
		DecimalFormat df = new DecimalFormat("#,###");
		String result = df.format(sum);
		System.out.println("* 주문액 : " + result + "(원)");
		
		printOrderTime();
		
	}

	private long totalSum(List<Menu> menuList) {
		long sum = 0;
		for(int i = 0; i < menuList.size(); i++) {
			sum += menuList.get(i).getPrice();
		}
		return sum;
	}
	
	private void printOrderTime() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println("* 주문시간 : " + sdf.format(now));
	}
	
	public static void printSummary() {
		System.out.println("\n===== 정산 =====");
		System.out.println("총 주문 건수 : " + (orderCount));
		System.out.println("총 주문 메뉴 수 : " + menuCount);
		DecimalFormat df = new DecimalFormat("#,###");
		String result = df.format(totalSum);
		System.out.println("총 매출 : " + result + "(원)");
	}
}
