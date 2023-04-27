package sec13.ch01;

public class HomeRent implements Rentable<Home>{
	@Override
	public Home rent() {
		return new Home();
	}

}
