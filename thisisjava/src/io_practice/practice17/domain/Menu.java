package io_practice.practice17.domain;

import java.io.Serializable;

public class Menu implements Serializable {

	private static final long serialVersionUID = 3831260121026666070L;

	private long itemNum;
	private String itemCategory;
	private String itemName;
	private int itemPrice;
	
	public Menu(long itemNum, String itemCategory, String itemName, int itemPrice) {
		this.itemNum = itemNum;
		this.itemCategory = itemCategory;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	public long getItemNum() {
		return itemNum;
	}

	public void setItemNum(long itemNum) {
		this.itemNum = itemNum;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
