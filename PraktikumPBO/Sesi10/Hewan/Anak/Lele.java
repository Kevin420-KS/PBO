package PraktikumPBO.Sesi10.Hewan.Anak;

import PraktikumPBO.Sesi10.Hewan.Ortu.Ikan;

public class Lele extends Ikan {
    final private String ciri, berat;

    public Lele() {
        super();
        this.ciri = "berwarna hitam keputihan";
        this.berat = "3 kg";
    }

    @Override
    public void display() {
        System.out.println("============Data Lele============");
        super.display();
        System.out.println("Lele dengan ciri: " + this.ciri);
        System.out.println("Lele dengan berat: " + this.berat);
    }
}
