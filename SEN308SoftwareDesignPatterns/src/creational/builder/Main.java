package creational.builder;

public class Main {

	public static void main(String[] args) {
		CarBuilder toyotaBuilder = new CarBuilder("toyota");
		Car toyotaCorollaBlue = toyotaBuilder.setModel("corolla").setColor("blue").setMultiMedia(true).build();
		Car toyotaCorollaBlack = toyotaBuilder.setModel("corolla").setColor("black").setMultiMedia(false).build();

		CarBuilder audiBuilder = new CarBuilder("audi");
		Car audiA3white = audiBuilder.setModel("a3").setColor("white").setMultiMedia(true).build();
		Car audiA5Red = audiBuilder.setModel("a5").setColor("red").setMultiMedia(false).build();
		
		System.out.println("Car Brand : " + toyotaCorollaBlue.getBrand() + "\nCar Model : "
				+ toyotaCorollaBlue.getModel() + "\nCar Color : " + toyotaCorollaBlue.getColor() + "\nCar Year : "
				+ toyotaCorollaBlue.getYear() + "\nCar MultiMedia : " + toyotaCorollaBlue.isHaveMultiMedia());
		System.out.println("---");
		System.out.println("Car Brand : " + toyotaCorollaBlack.getBrand() + "\nCar Model : "
				+ toyotaCorollaBlack.getModel() + "\nCar Color : " + toyotaCorollaBlack.getColor() + "\nCar Year : "
				+ toyotaCorollaBlack.getYear() + "\nCar MultiMedia : " + toyotaCorollaBlack.isHaveMultiMedia());
		System.out.println("---");
		System.out.println("Car Brand : " + audiA3white.getBrand() + "\nCar Model : "
				+ audiA3white.getModel() + "\nCar Color : " + audiA3white.getColor() + "\nCar Year : "
				+ audiA3white.getYear() + "\nCar MultiMedia : " + audiA3white.isHaveMultiMedia());
		System.out.println("---");
		System.out.println("Car Brand : " + audiA5Red.getBrand() + "\nCar Model : "
				+ audiA5Red.getModel() + "\nCar Color : " + audiA5Red.getColor() + "\nCar Year : "
				+ audiA5Red.getYear() + "\nCar MultiMedia : " + audiA5Red.isHaveMultiMedia());
		System.out.println("---");
		

	}

}
