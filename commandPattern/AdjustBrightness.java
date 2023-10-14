package commandPattern;

public class AdjustBrightness implements ICommand {
    private ILightDevice lightDevice;
    private int brightnessLevel;

    public AdjustBrightness(ILightDevice lightDevice, int brightnessLevel) {
        this.lightDevice = lightDevice;
        this.brightnessLevel = brightnessLevel;
    }

    @Override
    public String execute() {
        return lightDevice.adjustBrightness(brightnessLevel);
    }
}
