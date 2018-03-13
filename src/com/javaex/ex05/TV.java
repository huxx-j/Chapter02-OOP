package com.javaex.ex05;

public class TV {
    private int channel;
    private int volume;
    private boolean power;
    public TV() {}
    public TV (int channel, int volume, boolean power) {
        this.channel = channel;
        this.volume = volume;
        this.power = power;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isPower() {
        return power;
    }

    public void power(boolean power) {
        this.power=power;
    }
    public void channel (int channel) {
        if (channel>=1 && channel<=255) {
            this.channel = channel;
        }
    }
    public void channel (boolean up) {
        if (channel>1 && channel<255) {
            if (up == true) {
                channel++;
            } else {
                channel--;
            }
        }
    }
    public void volume(int volume) {
        if (volume>=0 && volume<=100) {
            this.volume = volume;
        }
    }
    public void volume(boolean up) {
        if (volume>0 && volume<100) {
            if (up == true) {
                volume++;
            } else {
                volume--;
            }
        }
    }

    public void status() {
        System.out.println("채널 : " + channel + " | 볼륨 : " + volume + " | 전원 : " + power);
    }
}
