package commandPattern;

public class DecreaseVolume implements ICommand {
    private IAudioDevice audioDevice;

    public DecreaseVolume(IAudioDevice audioDevice) {
        this.audioDevice = audioDevice;
    }

    @Override
    public String execute() {
        return audioDevice.decreaseVolume();
    }
}
