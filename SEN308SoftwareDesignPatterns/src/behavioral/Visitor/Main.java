package behavioral.Visitor;

public class Main {

	public static void main(String[] args) {
		ItemElement[] items = { new Book(20, "1234"), new Book(100, "5678"), new Fruit(10, 2, "Banana"),
				new Fruit(5, 5, "Apple") };

		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCart visitor = new ShoppingCart();
		int sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}
