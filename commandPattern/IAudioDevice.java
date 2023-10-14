package commandPattern;

public class IAudioDevice {
    public String increaseVolume() {
        return "Music Volume increased!";
    }

    public String decreaseVolume() {
        return "Music Volume decreased!";
    }

    public String play() {
        return "Playing the playlist.";
    }
}
