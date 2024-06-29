package behavioral.Visitor;

public class ShoppingCart implements ShoppingCartVisitor {

	@Override
	public int visit(Fruit f) {
		int totalPrice = f.getPricePerKG() * f.getWeight();
		if (totalPrice > 100) {
			return totalPrice - 10;
		}
		System.out.println("Fruit : " + f.getName());
		return totalPrice;
	}

	@Override
	public int visit(Book b) {
		System.out.println("Book ISBN : " + b.getIsbn());
		return b.getPrice();
	}

}
