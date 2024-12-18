package PraktikumPBO.Sesi13.No3.Anak;

import PraktikumPBO.Sesi13.No3.Ortu.Phone;

public class iPhone implements Phone {
    private int volume;
    private boolean isPowerOn;

    public iPhone() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("iPhone is ON.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("iPhone is OFF.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("iPhone volume: " + volume);
            } else {
                System.out.println("Volume is at MAX!");
            }
        } else {
            System.out.println("Turn on the phone first!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("iPhone volume: " + volume);
            } else {
                System.out.println("Volume is at MIN!");
            }
        } else {
            System.out.println("Turn on the phone first!");
        }
    }

    public int getVolume() {
        return volume;
    }
}
