package behavioral.Command;

public class TV implements Device {

	@Override
	public void turnOn() {
		System.out.println("TV Turn On");
	}

	@Override
	public void turnOff() {
		System.out.println("TV Turn Off");		
	}
	
	public void changeChannel() {
        System.out.println("Channel changed");
    }

}
