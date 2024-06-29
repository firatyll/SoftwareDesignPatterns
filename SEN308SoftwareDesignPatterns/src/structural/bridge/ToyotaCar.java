package structural.bridge;

public class ToyotaCar extends Car {

	public ToyotaCar(Color c) {
		super(c);
	}

	@Override
	public String colorize() {
		return "Toyota Car Colorized with : " + color.fill();
	}

}
