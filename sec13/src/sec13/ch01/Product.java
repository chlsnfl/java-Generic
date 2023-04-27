package sec13.ch01;

public class Product<K,M> {
	//제니릭 타입 필드 사용
	//대문자 한글자로 만드는 게 일반적인 방법
	private K Kind;
	private M model;
		
	
	//제네릭 타입 메소드 사용
	public K getKind() {
		return Kind;
	}
	public void setKind(K kind) {
		Kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}

}
