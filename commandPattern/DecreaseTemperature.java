package commandPattern;

public class DecreaseTemperature implements ICommand {
    private IThermostatDevice thermostatDevice;

    public DecreaseTemperature(IThermostatDevice thermostatDevice) {
        this.thermostatDevice = thermostatDevice;
    }

    @Override
    public String execute() {
        return thermostatDevice.decreaseTemperature();
    }
}
