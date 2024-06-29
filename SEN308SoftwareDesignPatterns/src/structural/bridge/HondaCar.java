package structural.bridge;

public class HondaCar extends Car {

	public HondaCar(Color c) {
		super(c);
	}

	@Override
	public String colorize() {
		return "Honda Car Colorized with : " + color.fill();
	}

}
