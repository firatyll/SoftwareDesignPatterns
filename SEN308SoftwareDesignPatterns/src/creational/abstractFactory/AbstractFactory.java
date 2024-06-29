package creational.abstractFactory;

public interface AbstractFactory {
	Phone createPhone(String model, int price);

	Watch createWatch(String model, int price);
}
