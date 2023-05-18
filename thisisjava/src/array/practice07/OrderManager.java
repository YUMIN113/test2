package array.practice07;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderManager {

	private Menu[] order;

	public OrderManager(Menu[] order) {
		this.order = order;
	}

	public Menu[] getOrder() {
		return order;
	}

	public void setOrder(Menu[] order) {
		this.order = order;
	}
	
	public void printInfo() {
		System.out.println("===== [영수증] =====");
		System.out.println();
		
		System.out.println("----- 주문 시간 -----");
		orderTime();
		System.out.println();
		
		System.out.println("----- 주문 상세 -----");
		orderDetail();
		System.out.println();
		
		System.out.println("----- 주문 금액 합계 -----");
		totalSum();
	}
	
	private void totalSum() {
		DecimalFormat df = new DecimalFormat("#,###");
		
		int sum = 0;
		for(int i = 0; i < order.length; i++) {
			sum += order[i].getItemPrice();
		}
		System.out.println(df.format(sum) + "(원)");
	}
	
	private void orderDetail() {
		DecimalFormat df = new DecimalFormat("#,###");
		for(int i = 0; i < order.length; i++) {
			System.out.println((i + 1) + ". 메뉴=" + order[i].getItemName() + " | 가격=" + df.format(order[i].getItemPrice()));
		}
	}
	
	private void orderTime() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println(sdf.format(now));
	}
}
