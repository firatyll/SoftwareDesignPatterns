package structural.bridge;

public abstract class Car {

	protected Color color;
	
	public Car(Color c) {
		this.color = c;
	}

	abstract public String colorize();
}
