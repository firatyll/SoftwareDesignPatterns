package creational.abstractFactory;

public class SamsungFactory implements AbstractFactory {

	@Override
	public Phone createPhone(String model, int price) {
		return new SamsungPhone(model, price);
	}

	@Override
	public Watch createWatch(String model, int price) {
		return new SamsungWatch(model, price);
	}

}
