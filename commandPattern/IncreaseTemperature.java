package commandPattern;

public class IncreaseTemperature implements ICommand {
    private IThermostatDevice thermostatDevice;

    public IncreaseTemperature(IThermostatDevice thermostatDevice) {
        this.thermostatDevice = thermostatDevice;
    }

    @Override
    public String execute() {
        return thermostatDevice.increaseTemperature();
    }
}
