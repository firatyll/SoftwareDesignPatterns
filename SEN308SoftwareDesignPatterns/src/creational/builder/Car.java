package creational.builder;

import java.time.LocalDateTime;

public class Car {
	private String brand;
	private String model;
	private String color;
	private int year;
	private boolean haveMultiMedia;

	public Car(CarBuilder builder) {
		this.brand = builder.brand;
		this.model = builder.model;
		this.color = builder.color;
		this.year = LocalDateTime.now().getYear();
		this.haveMultiMedia = builder.haveMultiMedia;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getYear() {
		return year;
	}

	public boolean isHaveMultiMedia() {
		return haveMultiMedia;
	}

}
