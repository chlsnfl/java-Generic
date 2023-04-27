package sec13.ch01;

public class ProductExam {

	public static void main(String[] args) {
		//K는 Tv, M은 String 
		Product<Tv, String> product = new Product<>();
		
		//Setter 셋팅(타입은 Tv, String으로 제공)
		product.setKind(new Tv());
		product.setModel("LG나노TV");
		
		//Getter 리턴값이 일치 되어야 함
		Tv tv = product.getKind();
		String tvModel = product.getModel();
		
		//K는 Car M은 String
		Product<Car, String> carproduct = new Product<>();
		carproduct.setKind(new Car());
		carproduct.setModel("베뉴");
		
		Car car = carproduct.getKind();
		String carModel = carproduct.getModel();
		
		
		
	}

}
