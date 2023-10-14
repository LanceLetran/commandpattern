package commandPattern;

public class SwitchOff implements ICommand {
    private ITVdevice tvDevice;

    public SwitchOff(ITVdevice tvDevice) {
        this.tvDevice = tvDevice;
    }

    @Override
    public String execute() {
        return tvDevice.switchOff();
    }
}
