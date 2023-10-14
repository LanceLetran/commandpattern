package commandPattern;

public class SwitchOn implements ICommand {
    private ITVdevice tvDevice;

    public SwitchOn(ITVdevice tvDevice) {
        this.tvDevice = tvDevice;
    }

    @Override
    public String execute() {
        return tvDevice.switchOn();
    }
}
