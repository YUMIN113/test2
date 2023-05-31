package io_practice.practice11;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = -456272147280367639L;
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ": " + price;
	}

}
