package creational.abstractFactory;

public class AppleWatch implements Watch {

	String brand;
	String model;
	int price;

	public AppleWatch(String model, int price) {
		this.brand = "apple";
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
	public void showWatchInfo() {
		System.out.println("Watch Brand: " + brand);
		System.out.println("Watch Model: " + model);
		System.out.println("Watch Price: " + price);
	}

}
