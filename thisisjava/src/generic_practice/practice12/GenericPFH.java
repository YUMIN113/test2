package generic_practice.practice12;

// 아래와 같이 클래스와 인터페이스를 함께 써야 할 때,
// 반드시 클래스가 앞에 와야 한다.
public class GenericPFH<T extends Person & Fly & Hidden> {

	T field;

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}

}
