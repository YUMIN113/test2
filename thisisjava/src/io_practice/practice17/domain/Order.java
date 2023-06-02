package io_practice.practice17.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import commonfunc.util.NumberFormatUtil;

public class Order implements Serializable {

	private static final long serialVersionUID = -4787900992915374232L;
	
	private int orderItemNum;
	private String orderItemName;
	private int orderItemCount;
	private long orderItemTotalSum;
	private String orderTime;
	
	public Order(int orderItemNum, String orderItemName, int orderItemCount, long orderItemTotalSum) {
		this.orderItemNum = orderItemNum;
		this.orderItemName = orderItemName;
		this.orderItemCount = orderItemCount;
		this.orderItemTotalSum = orderItemTotalSum;
		this.orderTime = createOrderTime();
	}
	
	private String createOrderTime() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		return sdf.format(now);
	}

	public long getOrderItemNum() {
		return orderItemNum;
	}

	public void setOrderItemNum(int orderItemNum) {
		this.orderItemNum = orderItemNum;
	}

	public String getOrderItemName() {
		return orderItemName;
	}

	public void setOrderItemName(String orderItemName) {
		this.orderItemName = orderItemName;
	}

	public int getOrderItemCount() {
		return orderItemCount;
	}

	public void setOrderItemCount(int orderItemCount) {
		this.orderItemCount = orderItemCount;
	}

	public long getOrderItemTotalSum() {
		return orderItemTotalSum;
	}

	public void setOrderItemTotalSum(long orderItemTotalSum) {
		this.orderItemTotalSum = orderItemTotalSum;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "\t" + "주문번호 " + this.getOrderItemNum() + ". "
				+ this.getOrderItemName() + " | " 
				+ this.getOrderItemCount() + "(개)" + " | "
				+ "금액 : " + NumberFormatUtil.toDecimalFormat(this.getOrderItemTotalSum()) + "(원)" + " | " 
				+ this.getOrderTime();
	}
}
