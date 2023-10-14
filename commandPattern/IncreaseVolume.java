package commandPattern;

public class IncreaseVolume implements ICommand {
    private IAudioDevice audioDevice;

    public IncreaseVolume(IAudioDevice audioDevice) {
        this.audioDevice = audioDevice;
    }

    @Override
    public String execute() {
        return audioDevice.increaseVolume();
    }
}
