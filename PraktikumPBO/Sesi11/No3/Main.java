package PraktikumPBO.Sesi11.No3;

import PraktikumPBO.Sesi11.No3.Anak.Samsung;
import PraktikumPBO.Sesi11.No3.Ortu.Phone;
import PraktikumPBO.Sesi11.No3.Ortu.PhoneUser;

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
