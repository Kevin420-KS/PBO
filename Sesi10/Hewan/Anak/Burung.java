package PraktikumPBO.Sesi10.Hewan.Anak;

import PraktikumPBO.Sesi10.Hewan.Ortu.Unggas;

public class Burung extends Unggas {
    final private String jenis, ciri;

    public Burung() {
        super();
        this.suara = "kicauan";
        this.jenis = "merpati";
        this.ciri = "bulu putih";
    }

    @Override
    public void display() {
        System.out.println("============Data Burung============");
        super.display();
        System.out.println("Suara burung: " + this.suara);
        System.out.println("Burung berjenis: " + this.jenis + " dengan ciri: " + this.ciri);
    }
}
