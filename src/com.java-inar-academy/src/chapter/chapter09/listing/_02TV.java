package chapter.chapter09.listing;

public class _02TV {
    int channel;
    int volume;
    boolean on;

    public _02TV() {
        channel = 1;
        volume = 1;
        on = false;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOf() {
        on = false;

    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolume) {
        if (on && newVolume >= 1 && newVolume <= 7) {
            volume = newVolume;
        }
    }

    public void channelUp() {
        if (on && channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }

    }

    public void volumeUp() {
        if (on && volume < 7) {
            volume++;
        }
    }

    public void volumeDown() {
        if (on && volume > 1) {
            volume--;
        }
    }

}