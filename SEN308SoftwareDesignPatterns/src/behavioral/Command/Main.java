package behavioral.Command;

public class Main {

	public static void main(String[] args) {
		RemoteControl controller = new RemoteControl();
		TV tv = new TV();
		Stereo stereo = new Stereo();
		
		Command turnOnTv = new TurnOnCommand(tv);
		Command turnOffTv = new TurnOffCommand(tv);
		Command turnOnStereo = new TurnOnCommand(stereo);
		Command turnOffStereo = new TurnOffCommand(stereo);
		Command changeChannel = new ChangeChannelCommand(tv);
		Command adjustVolume = new AdjustVolumeCommand(stereo);
		
		controller.setCommand(turnOnTv);
		controller.pressButton();
		controller.setCommand(changeChannel);
		controller.pressButton();
		controller.setCommand(turnOffTv);
		controller.pressButton();
		controller.setCommand(turnOnStereo);
		controller.pressButton();
		controller.setCommand(adjustVolume);
		controller.pressButton();
		controller.setCommand(turnOffStereo);
		controller.pressButton();
		
	}

}
