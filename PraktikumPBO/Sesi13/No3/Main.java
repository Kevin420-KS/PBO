package PraktikumPBO.Sesi13.No3;

public class Main {
    public static void main(String[] args) {
        Phone samsung = new Samsung();
        PhoneUser user = new PhoneUser(samsung);

        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();
    }
}
