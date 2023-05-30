package generic_practice.practice12;

// 제너릭 타입에도 제한 가능
public class GenericP<T extends Person> {

	T field;

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}

}
