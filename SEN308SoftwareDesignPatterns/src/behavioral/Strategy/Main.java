package behavioral.Strategy;

public class Main {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("123", 200);
		Item item2 = new Item("124", 300);
		Item item3 = new Item("125", 400);
		Item item4 = new Item("126", 500);
		
		PaymentStrategy creditCard = new CreditCardStrategy("jose moruinho","123456" , "123", "1907");
		PaymentStrategy paypal = new PaypalStrategy("josemo@gmail.com", "fenerbahce");
		
		cart.addItem(item1);
		cart.addItem(item2);;
		cart.pay(creditCard);
		cart.removeItem(item1);
		cart.removeItem(item2);
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		cart.addItem(item4);
		cart.pay(paypal);
		
	}

}
