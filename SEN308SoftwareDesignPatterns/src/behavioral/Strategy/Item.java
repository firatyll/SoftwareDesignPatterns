package behavioral.Strategy;

public class Item {
	private String barcode;
	private int price;
	
	public Item(String barcode, int price) {
		this.barcode = barcode;
		this.price = price;
	}

	public String getBarcode() {
		return barcode;
	}

	public int getPrice() {
		return price;
	}
	
}
