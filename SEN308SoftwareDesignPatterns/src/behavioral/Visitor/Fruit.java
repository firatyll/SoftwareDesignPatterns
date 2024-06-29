package behavioral.Visitor;

public class Fruit implements ItemElement {
	private int pricePerKG;
	private int weight;
	private String name;
	
	public Fruit(int pricePerKG, int weight, String name) {
		this.pricePerKG = pricePerKG;
		this.weight = weight;
		this.name = name;
	}

	public int getPricePerKG() {
		return pricePerKG;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
	
}
