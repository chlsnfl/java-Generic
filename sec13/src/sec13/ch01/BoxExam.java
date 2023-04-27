package sec13.ch01;

public class BoxExam {

	public static void main(String[] args) {

		Box<String> box1 = new Box<>();
		//Box<String> box1 = new Box<String>();
		
		box1.content = "안녕하세용";	//자동 타입 변환 필요 없음
		String str = box1.content;	//강제 타입 변환 필요 없음
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 568;
		int val = box2.content;
		
		System.out.println(val);
	}

}
