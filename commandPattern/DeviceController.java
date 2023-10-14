package commandPattern;

public class DeviceController {
    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public String clickButton() {
        return command.execute();
    }
}
