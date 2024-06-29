package structural.bridge;

public class Main {

	public static void main(String[] args) {
		
		Car toyotaCarRed = new ToyotaCar(new Red());
		Car toyotaCarWhite = new ToyotaCar(new White());
		Car hondaCarWhite = new HondaCar(new White());
		Car hondaCarBlue = new HondaCar(new Blue());
		

		System.out.println(toyotaCarRed.colorize());
		System.out.println(toyotaCarWhite.colorize());
		System.out.println(hondaCarWhite.colorize());
		System.out.println(hondaCarBlue.colorize());
		
	}

}
