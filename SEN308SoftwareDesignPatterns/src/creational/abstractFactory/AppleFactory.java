package creational.abstractFactory;

public class AppleFactory implements AbstractFactory {

	@Override
	public Phone createPhone(String model, int price) {
		return new ApplePhone(model, price);
	}

	@Override
	public Watch createWatch(String model, int price) {
		return new AppleWatch(model, price);
	}

}
