package PraktikumPBO.Sesi10.Hewan.Anak;

import PraktikumPBO.Sesi10.Hewan.Ortu.Ikan;

public class Gurami extends Ikan {
    final private String ciri, berat;

    public Gurami() {
        super();
        this.ciri = "berwarna hitam";
        this.berat = "2 kg";
    }

    @Override
    public void display() {
        System.out.println("============Data Gurami============");
        super.display();
        System.out.println("Gurami dengan ciri: " + this.ciri);
        System.out.println("Gurami dengan berat: " + this.berat);
    }
}
