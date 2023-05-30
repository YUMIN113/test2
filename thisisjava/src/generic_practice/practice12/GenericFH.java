package generic_practice.practice12;

// ' & ' 로 연결
public class GenericFH<T extends Fly & Hidden> {

	T field;

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}
}
