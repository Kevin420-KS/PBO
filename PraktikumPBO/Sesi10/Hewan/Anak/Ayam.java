package PraktikumPBO.Sesi10.Hewan.Anak;

import PraktikumPBO.Sesi10.Hewan.Ortu.Unggas;

public class Ayam extends Unggas {
    final private String jenis, ciri;

    public Ayam() {
        super();
        this.suara = "kukuruyuk";
        this.jenis = "ayam kampung";
        this.ciri = "ayam berwarna hitam";
    }

    @Override
    public void display() {
        System.out.println("============Data Ayam============");
        super.display();
        System.out.println("Suara ayam: " + this.suara);
        System.out.println("Ayam berjenis: " + this.jenis + " dengan ciri: " + this.ciri);
    }
}
