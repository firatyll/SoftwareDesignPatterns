package behavioral.Command;

public class Stereo implements Device {

	@Override
	public void turnOn() {
		System.out.println("Stereo Turn On");
	}

	@Override
	public void turnOff() {
		System.out.println("Stereo Turn Off");
	}

    public void adjustVolume() {
        System.out.println("Volume adjusted");
    }
	
}
