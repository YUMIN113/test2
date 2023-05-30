package generic_practice.practice09;

public class Biz<T> {

	private T t;

	public Biz(T t) {
		System.out.println("Biz(T t) : " + t.getClass().getSimpleName());
		this.t = t;
	}

	public T getT() {
		System.out.println("getT() : " + t.getClass().getSimpleName());
		return t;
	}

	public void setT(T t) {
		System.out.println("setT() : " + t.getClass().getSimpleName());
		this.t = t;
	}

	public <T> T biz(T t) {
		System.out.println("biz(T t) : " + t.getClass().getSimpleName());
		return t;
	}

}
