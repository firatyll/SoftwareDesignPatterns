package behavioral.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Item> items;

	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}

	public void addItem(Item i) {
		this.items.add(i);
	}

	public void removeItem(Item i) {
		this.items.remove(i);
	}

	public int calculateTotal() {
		int sum = 0;

		for (int i = 0; i < this.items.size(); i++) {
			sum += this.items.get(i).getPrice();
		}

		return sum;
	}
	
	public void pay(PaymentStrategy paymentStrategy) {
		paymentStrategy.pay(this.calculateTotal());
	}

}
