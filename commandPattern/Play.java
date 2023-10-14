package commandPattern;

public class Play implements ICommand {
    private IAudioDevice audioDevice;

    public Play(IAudioDevice audioDevice) {
        this.audioDevice = audioDevice;
    }

    @Override
    public String execute() {
        return audioDevice.play();
    }
}
