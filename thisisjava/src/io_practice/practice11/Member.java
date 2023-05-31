package io_practice.practice11;

import java.io.Serializable;

public class Member implements Serializable {

	private static final long serialVersionUID = -4916110231685119105L;
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ": " + name;
	}

}
