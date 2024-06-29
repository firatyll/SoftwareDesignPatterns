package creational.builder;

public class CarBuilder {
	String brand;
	String model;
	String color;
	boolean haveMultiMedia;

	public CarBuilder(String brand) {
		this.brand = brand;
	}

	public CarBuilder setModel(String model) {
		this.model = model;
		return this;
	}

	public CarBuilder setColor(String color) {
		this.color = color;
		return this;
	}

	public CarBuilder setMultiMedia(boolean multiMedia) {
		this.haveMultiMedia = multiMedia;
		return this;
	}

	public Car build() {
		return new Car(this);
	}

}
