package creational.abstractFactory;

public class SamsungPhone implements Phone {

	String brand;
	String model;
	int price;

	public SamsungPhone(String model, int price) {
		this.brand = "Samsung";
		this.model = model;
		this.price = price;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void showPhoneInfo() {
		System.out.println("Phone Brand: " + brand);
		System.out.println("Phone Model: " + model);
		System.out.println("Phone Price: " + price);
	}

}
