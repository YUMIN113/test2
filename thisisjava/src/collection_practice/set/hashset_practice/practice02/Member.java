package collection_practice.set.hashset_practice.practice02;

public class Member {

	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			return ((target.name.equals(name)) && (target.age == age));
		} else {
			return false;
		}
	}
	
	
	
	
}
