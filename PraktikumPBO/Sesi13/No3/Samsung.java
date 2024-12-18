package PraktikumPBO.Sesi13.No3;

public class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Samsung phone is ON.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Samsung phone is OFF.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("Samsung volume: " + volume);
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
                System.out.println("Samsung volume: " + volume);
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
